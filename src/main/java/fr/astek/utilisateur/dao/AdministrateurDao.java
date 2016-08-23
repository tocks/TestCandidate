package fr.astek.utilisateur.dao;

import java.util.List;

import fr.astek.utilisateur.entity.Administrateur;

public interface AdministrateurDao {
	
	public Administrateur addAdministrateur(Administrateur administrateur);
	public void deleteAdministrateur(Administrateur administrateur);
	public Administrateur setAdministrateur(Administrateur administrateur);
	public List<Administrateur> getAllAdministrateurs();
	public Administrateur findById(Long id);
}
