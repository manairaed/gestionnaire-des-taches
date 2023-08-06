package com.gestionnaire.demo;

import javax.annotation.PostConstruct;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.gestionnaire.demo.models.Role;
import com.gestionnaire.demo.models.User;
import com.gestionnaire.demo.services.UserService;


@SuppressWarnings("unused")
@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	UserService userService;
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*@PostConstruct
	void init_users() {
		//ADD Role
		userService.addRole(new Role(null,"ADMIN"));
		userService.addRole(new Role(null,"USER"));
		//ajouter les users
		userService.saveUser(new User(null,"admin","123",true,null));
		userService.saveUser(new User(null,"test","1234",true,null));
		userService.saveUser(new User(null,"foulen","12345",true,null));
		//ajouter les rôles aux users
		userService.addRoleToUtilisateur("admin", "ADMIN");
		userService.addRoleToUtilisateur("admin", "USER");
		userService.addRoleToUtilisateur("raed", "USER");
		userService.addRoleToUtilisateur("foulen", "USER");
	}*/
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}


}
