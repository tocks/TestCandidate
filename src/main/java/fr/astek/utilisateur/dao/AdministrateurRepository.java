package fr.astek.utilisateur.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.astek.utilisateur.entity.Administrateur;

public interface AdministrateurRepository extends JpaRepository<Administrateur, Long>{

}
