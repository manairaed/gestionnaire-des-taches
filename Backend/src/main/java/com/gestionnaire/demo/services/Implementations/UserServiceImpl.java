package com.gestionnaire.demo.services.Implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gestionnaire.demo.dao.UserRepository;
import com.gestionnaire.demo.models.User;
import com.gestionnaire.demo.services.UserService;

import jakarta.transaction.Transactional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
	UserRepository userRepository;

    @Override
    public User saveUser(User u) {
        return userRepository.save(u);
    }

    @Override
    public User updateUser(User u) {
        return userRepository.save(u);
    }

    @Override
    public void deleteUser(User u) {
        userRepository.delete(u);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
}
