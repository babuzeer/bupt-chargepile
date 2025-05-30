package com.example.charge.service;

import com.example.charge.model.User;
import com.example.charge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean register(String username, String password) {
        if (userRepository.findByUsername(username) != null) return false;
        userRepository.save(new User(null, username, password));
        return true;
    }

    public boolean login(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }
}

