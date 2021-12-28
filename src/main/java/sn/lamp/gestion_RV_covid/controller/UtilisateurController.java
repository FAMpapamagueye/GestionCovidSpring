package sn.lamp.gestion_RV_covid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import sn.lamp.gestion_RV_covid.entities.Utilisateur;
import sn.lamp.gestion_RV_covid.service.UtilisateurService;
import sn.lamp.gestion_RV_covid.service.implement.UtilisateurServiceImpl;

@Controller
public class UtilisateurController {
	private UtilisateurServiceImpl utilisateurServiceImpl;
	
    public UtilisateurController(UtilisateurServiceImpl utilisateurServiceImpl) {
		super();
		this.utilisateurServiceImpl = utilisateurServiceImpl;
	}

	@GetMapping("/Utilisateur")
	
	public String listsUtilisateur(Model model) {
    	model.addAttribute("Utilisateurs", utilisateurServiceImpl.getAll());
		return "listUtilisateur";
	}
	@GetMapping(value = "/Utilisateur/new")
	public String CreateUtilisateur(Model model) {
		Utilisateur utilisateur=new Utilisateur();
		model.addAttribute("utilisateur",utilisateur);
		return "newUtilisateur";
	}
	@PostMapping(value = "Utilisateur")
	public String saveUtilisateur(@ModelAttribute("utilisateur")Utilisateur utilisateur) {
		utilisateurServiceImpl.saveUtilisateur(utilisateur);
		
		return "redirect:Utilisateur";
		
	}
	@GetMapping("/Utilisateur/edit/{id}")
	public String editUtilisateur(@PathVariable Long id,Model m) {
		m.addAttribute("utilisateur", utilisateurServiceImpl.getUtilisateurById(id));
		return "edit_utlisateur";
	}
//	public String UpdateUtilisateur(@PathVariable Long id,@ModelAttribute("utilisateur") Utilisateur utilisateur) {
//		
//		utilisateurServiceImpl.saveUtilisateur(utilisateur);
//		return "";
//	}
	@GetMapping("/Utilisateur/delete/{id}")
	public String supprimer(@PathVariable Long id,Model model) {
		model.addAttribute("utilisateur", utilisateurServiceImpl.getUtilisateurById(id));
		return "confirmation";
		
	}
	@GetMapping("/Utilisateur/supprimer/{id}")
	public String confirmer(@PathVariable Long id) {
		utilisateurServiceImpl.suppression(id);
		return "redirect:/Utilisateur";
	}
}
