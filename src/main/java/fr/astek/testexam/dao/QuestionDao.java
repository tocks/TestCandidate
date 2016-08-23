package fr.astek.testexam.dao;


import java.util.List;

import fr.astek.testexam.entity.Difficulte;
import fr.astek.testexam.entity.Question;

public interface QuestionDao  {

	public Question addQuestion(Question question);
	public void deleteQuestion(Question question);
	public Question setQuestion(Question question);
	public List<Question> getAllQuestions();
	public Question findById(Long id);
	public List<Question> findByDifficulte(Difficulte difficulte);

}
