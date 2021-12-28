package sn.lamp.gestion_RV_covid.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String adress;
	private String email;
	private String age;

	@OneToMany(mappedBy = "user")
	private List<vaccin> vaccin;

	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(String nom, String prenom, String adress, String email, String age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.email = email;
		this.age = age;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<vaccin> getVaccin() {
		return vaccin;
	}

	public void setVaccin(List<vaccin> vaccin) {
		this.vaccin = vaccin;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
