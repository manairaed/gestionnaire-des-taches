package com.gestionnaire.demo.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "idUtil")
public class Personnel extends User {
   
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
