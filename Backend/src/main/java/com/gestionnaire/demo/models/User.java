package com.gestionnaire.demo.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;


@Data 
@NoArgsConstructor 
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
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
	public Long getIdUtil() {
		return idUtil;
	}
	public void setIdUtil(Long idUtil) {
		this.idUtil = idUtil;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public User(String username, String password, Boolean enabled, String nom, String prenom, String numTel,
			String email, String adresse) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.email = email;
		this.adresse = adresse;
	}
	public User(Long idUtil, String image, String username, String password, Boolean enabled, String nom, String prenom,
			String numTel, String email, String adresse) {
		super();
		this.idUtil = idUtil;
		this.image = image;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.email = email;
		this.adresse = adresse;
	}
	public User() {
		super();
	}
	
	public User(Long idUtil, String username, String password, Boolean enabled, List<Role> roles) {
		super();
		this.idUtil = idUtil;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.roles = roles;
	}



	@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="utilisateur_role",joinColumns = @JoinColumn(name="idUtil") ,
    inverseJoinColumns = @JoinColumn(name="idRole"))
	private List<Role> roles;
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
	
    
    
}
