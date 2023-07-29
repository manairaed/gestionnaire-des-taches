package com.gestionnaire.demo.services;

import java.util.List;

import com.gestionnaire.demo.models.User;

public interface UserService {
    User saveUser (User u);
    User updateUser (User u);
    void deleteUser (User u);
    void deleteUserById (Long id);
    User getUser (Long id);
    List <User> getAllUsers();
}
