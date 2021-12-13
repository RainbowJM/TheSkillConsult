package nl.hu.consultant.security.presentation.controller;

import nl.hu.consultant.security.application.UserService;
import nl.hu.consultant.security.presentation.filter.JwtAuthorizationFilter;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/logout")
public class LogoutController {
    private final UserService userService;

    public LogoutController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity logout(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        if (JwtAuthorizationFilter.addToBlacklist(token)) {
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }
}
