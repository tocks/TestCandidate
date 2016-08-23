package fr.astek.utilisateur.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.astek.utilisateur.entity.Administrateur;
@Transactional
@Service
public class AdministrateurDaoImpl implements AdministrateurDao {

	@Autowired
	private AdministrateurRepository administrateurRepository;
	
	@Override
	public Administrateur addAdministrateur(Administrateur administrateur) {
		return administrateurRepository.save(administrateur);
	}

	@Override
	public void deleteAdministrateur(Administrateur administrateur) {
		administrateurRepository.delete(administrateur);
	}

	@Override
	public Administrateur setAdministrateur(Administrateur administrateur) {
		return administrateurRepository.save(administrateur);
	}

	@Override
	public List<Administrateur> getAllAdministrateurs() {
		return administrateurRepository.findAll();
	}

	@Override
	public Administrateur findById(Long id) {
		return administrateurRepository.getOne(id);
	}

}
