package ua.edu.ucu.apps.demo.flowerstore.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(AppUser user) {
        if (userRepository.findAppUserByEmail(user.getEmail()).isEmpty())
            userRepository.save(user);
    }
}
