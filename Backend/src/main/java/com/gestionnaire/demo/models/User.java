package com.gestionnaire.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long idUtil;

    @Lob
    String image;
    @Column(unique=true)
    private String username;
    private String password;
    private Boolean enabled;
    private String nom;
	private String prenom;
	private String numTel;
	private String email;
    private String adresse;
}
