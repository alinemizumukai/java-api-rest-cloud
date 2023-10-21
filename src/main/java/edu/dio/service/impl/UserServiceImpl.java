package edu.dio.service.impl;

import edu.dio.domain.model.User;
import edu.dio.domain.repository.UserRepository;
import edu.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if (user.getEmail() != null && userRepository.existsByEmail(user.getEmail())){
            throw new IllegalArgumentException("This user ID already exists");
        }
        return userRepository.save(user);
    }
}
