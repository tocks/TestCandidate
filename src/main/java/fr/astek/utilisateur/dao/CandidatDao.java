package fr.astek.utilisateur.dao;

import java.util.List;

import fr.astek.utilisateur.entity.Candidat;

public interface CandidatDao {
	
	public Candidat addCandidat(Candidat candidat);
	public void deleteCandidat(Candidat candidat);
	public Candidat setCandidat(Candidat candidat);
	public List<Candidat> getAllCandidats();
	public Candidat findById(Long id);
}
