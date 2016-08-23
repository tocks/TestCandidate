package fr.astek.testexam.dao;


import java.util.List;

import fr.astek.testexam.entity.TestExam;

public interface TestExamenDao {
	
	public void addTestExam(TestExam t);
	public void deleteTestExam(TestExam t);
	public void setTestExam(TestExam t);
	public List<TestExam> getAllTests();
	public TestExam findByID(Long id);

}
