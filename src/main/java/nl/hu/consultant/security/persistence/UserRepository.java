package nl.hu.consultant.security.persistence;

import nl.hu.consultant.security.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * This is a magic interface, which is converted
 * to a class during compilation.
 * <p>
 * Note that this introduces coupling between Chips and the way they are stored!
 * In more loosely coupled components, you would add an intermediary abstraction
 * like an abstract repository or a DAO!
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}

