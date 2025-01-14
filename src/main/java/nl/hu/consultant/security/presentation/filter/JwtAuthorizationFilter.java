package nl.hu.consultant.security.presentation.filter;

import io.jsonwebtoken.*;
import nl.hu.consultant.security.persistence.UserProfile;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Tries to authorize a user, based on the Bearer token (JWT) from
 * the Authorization header of the incoming request.
 */
public class JwtAuthorizationFilter extends BasicAuthenticationFilter {
    private final String secret;
    private final static List<String> tokenBlacklist = new ArrayList<>();

    public JwtAuthorizationFilter(
            String secret,
            AuthenticationManager authenticationManager
    ) {
        super(authenticationManager);

        this.secret = secret;
    }

    public static boolean addToBlacklist(String token) {
        if (!tokenBlacklist.contains(token)) {
            tokenBlacklist.add(token);
            return true;
        }
        return false;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws IOException, ServletException {
        Authentication authentication = this.getAuthentication(request);
        if (authentication != null) {
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }

        filterChain.doFilter(request, response);
    }

    private Authentication getAuthentication(HttpServletRequest request) {
        String token = request.getHeader("Authorization");

        // Check if token not empty
        if (token == null || token.isEmpty()) {
            return null;
        }

        // Check if token has correct format
        if (!token.startsWith("Bearer ")) {
            return null;
        }

        // Check if token is not in logged out blacklist
        if (tokenBlacklist.contains(token)) {
            return null;
        }

        byte[] signingKey = this.secret.getBytes();

        JwtParser jwtParser = Jwts.parserBuilder()
                .setSigningKey(signingKey)
                .build();

        Jws<Claims> parsedToken = jwtParser
                .parseClaimsJws(token.replace("Bearer ", ""));

        var username = parsedToken
                .getBody()
                .getSubject();

        var authorities = ((List<?>) parsedToken.getBody()
                .get("rol")).stream()
                .map(authority -> new SimpleGrantedAuthority((String) authority))
                .collect(Collectors.toList());

        if (username.isEmpty()) {
            return null;
        }

        UserProfile principal = new UserProfile(username);
//                username),
//                (String) parsedToken.getBody().get("firstName"),
//                (String) parsedToken.getBody().get("lastName")
//        );

        return new UsernamePasswordAuthenticationToken(principal, null, authorities);
    }
}

