package ua.edu.ucu.apps.demo.flowerstore.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Integer> {
//    @Query("SELECT u FROM app_user u WHERE u.email = ?1")
    Optional<AppUser> findAppUserByEmail(String email);
}
