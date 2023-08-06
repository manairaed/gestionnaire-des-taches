package com.gestionnaire.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionnaire.demo.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername (String userName);
}
