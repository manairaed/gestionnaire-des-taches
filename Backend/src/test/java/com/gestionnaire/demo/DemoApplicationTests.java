package com.gestionnaire.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.gestionnaire.demo.dao.UserRepository;
import com.gestionnaire.demo.models.User;
import com.gestionnaire.demo.services.UserService;

@SpringBootTest
@ActiveProfiles("test")
class DemoApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    /*
     * @Test
     * public void testCreateUser() {
     * User u = new User();
     * u.setUsername("raed1");
     * u.setPassword("123456");
     * u.setEnabled(true);
     * u.setNom("manai");
     * u.setPrenom("raed");
     * u.setNumTel("29886500");
     * u.setEmail("raedmanai3@gmail.com");
     * u.setAdresse("Rue Jeljlen Nabeul");
     * 
     * 
     * User savedUser = userRepository.save(u);
     * 
     * 
     * assertNotNull(savedUser.getIdUtil());
     * 
     * 
     * assertEquals("raed", savedUser.getUsername());
     * assertEquals("manai", savedUser.getNom());
     * assertEquals("raedmanai3@gmail.com", savedUser.getEmail());
     * 
     * 
     * }
     */

    /*
     * @Test
     * public void testDeleteUser(){
     * 
     * User u = new User();
     * u.setUsername("userToDelete");
     * u.setPassword("password");
     * u.setEnabled(true);
     * u.setNom("User");
     * u.setPrenom("ToDelete");
     * u.setNumTel("123456789");
     * u.setEmail("userToDelete@example.com");
     * u.setAdresse("123, Street, City");
     * 
     * 
     * User savedUser = userRepository.save(u);
     * 
     * 
     * assertNotNull(savedUser.getIdUtil());
     * 
     * 
     * userService.deleteUserById(savedUser.getIdUtil());
     * 
     * 
     * assertFalse(userRepository.existsById(savedUser.getIdUtil()));
     * }
     */
}
