package uz.pdp.my_first_spring_security_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.my_first_spring_security_project.model.User;

public interface UserRepository extends JpaRepository <User, Long> {
    User findByEmail(String email);
}
