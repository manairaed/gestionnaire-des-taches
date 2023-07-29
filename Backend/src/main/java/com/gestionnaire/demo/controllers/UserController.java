package com.gestionnaire.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionnaire.demo.dao.UserRepository;
import com.gestionnaire.demo.models.User;
import com.gestionnaire.demo.services.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private UserRepository userRepository;
    
    //Ajouter Utilisateur
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
    
    //Modifier Utilisateur
    @RequestMapping(path = "/edit", method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user) {
    	User users = userRepository.findById(user.getIdUtil()).orElse(null);
        users.setImage(user.getImage());
        users.setEmail(user.getEmail());
        users.setUsername(users.getUsername());
        users.setPassword(user.getPassword());
        users.setNom(user.getNom());
        users.setPrenom(users.getPrenom());
        users.setEnabled(user.getEnabled());
        users.setAdresse(users.getAdresse());
        users.setNumTel(user.getNumTel());
        return userService.updateUser(users);
    }

    //Supprimer Utilisateur
    @RequestMapping(path = "delete/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
    }

    //Recherche Utilisateur Par ID
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable Long id) {
        return userService.getUser(id);
    }

    //Lister les utilisateurs
    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
