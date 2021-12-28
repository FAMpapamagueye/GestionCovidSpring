package sn.lamp.gestion_RV_covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.lamp.gestion_RV_covid.entities.Utilisateur;
@Repository

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
