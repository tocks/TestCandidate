package fr.astek.utilisateur.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.astek.utilisateur.entity.Candidat;
@Transactional
@Service
public class CandidatDaoImpl implements CandidatDao {

	@Autowired
	private CandidatRepository candidatRepository;
	
	@Override
	public Candidat addCandidat(Candidat candidat) {
		return candidatRepository.save(candidat);
	}

	@Override
	public void deleteCandidat(Candidat candidat) {
		candidatRepository.delete(candidat);
	}

	@Override
	public Candidat setCandidat(Candidat candidat) {
		return candidatRepository.save(candidat);
	}

	@Override
	public List<Candidat> getAllCandidats() {
		return candidatRepository.findAll();
	}

	@Override
	public Candidat findById(Long id) {
		return candidatRepository.getOne(id);
	}

}
