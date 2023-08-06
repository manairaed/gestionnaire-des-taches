package com.gestionnaire.demo.models;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "idUtil")
public class Personnel extends User {
   
   
	public Personnel(Long idUtil, String username, String password, Boolean enabled, List<Role> roles) {
		super(idUtil, username, password, enabled, roles);
		// TODO Auto-generated constructor stub
	}
	public Personnel(String username, String password, Boolean enabled, String nom, String prenom, String numTel,
			String email, String adresse) {
		super(username, password, enabled, nom, prenom, numTel, email, adresse);
		// TODO Auto-generated constructor stub
	}
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPers;
    
    private String departement;
    private String poste;
    private float salaire;
	public Long getNumPers() {
		return numPers;
	}
	public void setNumPers(Long numPers) {
		this.numPers = numPers;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
    
    
}
