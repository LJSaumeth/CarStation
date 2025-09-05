package unimag.edu.co.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unimag.edu.co.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // lookup user by email
    Optional<User> findByEmail(String email);
}
