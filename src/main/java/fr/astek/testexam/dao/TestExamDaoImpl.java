package fr.astek.testexam.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.astek.testexam.entity.TestExam;

@Transactional
@Service
public class TestExamDaoImpl implements TestExamenDao {
	
	@Autowired
	private TestExamRepository testExamRepository;
	@Override
	public void addTestExam(TestExam t) {
		testExamRepository.save(t);
	}

	@Override
	public void deleteTestExam(TestExam t) {
		testExamRepository.delete(t);
	}

	@Override
	public void setTestExam(TestExam t) {
		testExamRepository.save(t);
	}

	@Override
	public List<TestExam> getAllTests() {
		return testExamRepository.findAll();
	}

	@Override
	public TestExam findByID(Long id) {
		return testExamRepository.getOne(id);
	}
	
}
