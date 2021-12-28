package sn.lamp.gestion_RV_covid.service.implement;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import sn.lamp.gestion_RV_covid.entities.Utilisateur;
import sn.lamp.gestion_RV_covid.repository.UtilisateurRepository;
import sn.lamp.gestion_RV_covid.service.UtilisateurService;
@Service
public class UtilisateurServiceImpl  implements UtilisateurService{
   @Autowired
   private UtilisateurRepository utilisateurRepository;
   
	public UtilisateurServiceImpl(UtilisateurRepository utilisateurRepository) {
	super();
	this.utilisateurRepository = utilisateurRepository;
}

	@Override
	public List<Utilisateur> getAll() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll();
		
	}

	@Override
	public Utilisateur saveUtilisateur(Utilisateur e) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(e);
	}

	@Override
	public Utilisateur getUtilisateurById(Long id) {
		// TODO Auto-generated method stub
		return utilisateurRepository.findById(id).get();
	}

	@Override
	public Utilisateur UpdateUtilisateur(Utilisateur e) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(e);
	}

	@Override
	public void suppression(Long id) {
		// TODO Auto-generated method stub
		 utilisateurRepository.deleteById(id);
	}



}
