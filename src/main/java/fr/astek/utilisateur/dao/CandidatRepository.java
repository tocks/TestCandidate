package fr.astek.utilisateur.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.astek.utilisateur.entity.Candidat;

public interface CandidatRepository extends JpaRepository<Candidat, Long>{

}
