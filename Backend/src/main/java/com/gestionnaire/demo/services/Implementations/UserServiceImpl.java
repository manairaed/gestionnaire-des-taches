package com.gestionnaire.demo.services.Implementations;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.gestionnaire.demo.dao.RoleRepository;
import com.gestionnaire.demo.dao.UserRepository;
import com.gestionnaire.demo.models.Role;
import com.gestionnaire.demo.models.User;
import com.gestionnaire.demo.services.UserService;



import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
	UserRepository userRepository;
    
    @Autowired
    RoleRepository roleRepository;
    
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User saveUser(User u) {
    	u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));
        return userRepository.save(u);
    }

    @Override
    public User updateUser(User u) {
    	u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));
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

	@Override
	public Role addRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public User addRoleToUtilisateur(String username, String rolename) {
		User usr = userRepository.findByUsername(username);
        Role r = roleRepository.findByRole(rolename);
        usr.getRoles().add(r);
        return usr;
	}

	@Override
	public User findUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}
    
}
