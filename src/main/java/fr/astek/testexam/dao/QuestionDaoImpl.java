package fr.astek.testexam.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.astek.testexam.entity.Difficulte;
import fr.astek.testexam.entity.Question;

@Transactional
@Service
public class QuestionDaoImpl implements QuestionDao {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public Question addQuestion(Question question) {
		questionRepository.save(question);
		return question;
	}

	@Override
	public void deleteQuestion(Question question) {
		questionRepository.delete(question);
		
	}

	@Override
	public Question setQuestion(Question question) {
		questionRepository.save(question);
		return question;
	}

	@Override
	public List<Question> getAllQuestions() {
		return questionRepository.findAll();
	}

	@Override
	public Question findById(Long id) {
		return questionRepository.getOne(id);
	}

	@Override
	public List<Question> findByDifficulte(Difficulte difficulte) {
		return questionRepository.findByDifficulte(difficulte);
	}

	
}
