package fr.astek.testexam.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.astek.testexam.entity.Difficulte;
import fr.astek.testexam.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

	public List<Question> findByDifficulte(Difficulte difficulte);
}
