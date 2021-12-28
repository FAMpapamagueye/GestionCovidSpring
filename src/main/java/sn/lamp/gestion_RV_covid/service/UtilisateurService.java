package sn.lamp.gestion_RV_covid.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import sn.lamp.gestion_RV_covid.entities.Utilisateur;

public interface UtilisateurService {
	List<Utilisateur> getAll();
	Utilisateur saveUtilisateur(Utilisateur e);
	
	Utilisateur getUtilisateurById(Long id);
	Utilisateur UpdateUtilisateur(Utilisateur e);
	void suppression(@PathVariable Long id);
	

}
