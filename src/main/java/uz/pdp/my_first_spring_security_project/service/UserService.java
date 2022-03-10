package uz.pdp.my_first_spring_security_project.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import uz.pdp.my_first_spring_security_project.dto.UserRegistrationDto;
import uz.pdp.my_first_spring_security_project.model.User;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
