package com.gestionnaire.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long idRole;
    private String role;
    
    
    
	public Role(Long idRole, String role) {
		super();
		this.idRole = idRole;
		this.role = role;
	}
	
	public Role(String role) {
		super();
		this.role = role;
	}
	

	public Role() {
		super();
	}

	public Long getIdRole() {
		return idRole;
	}
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    
    
}
