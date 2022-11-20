package ua.edu.ucu.apps.demo.flowerstore.users;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(AppUser user) {
        if (userRepository.findAppUserByEmail(user.getEmail()).isEmpty())
            userRepository.save(user);
    }
}
