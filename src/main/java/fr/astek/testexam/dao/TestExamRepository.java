package fr.astek.testexam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.astek.testexam.entity.TestExam;

public interface TestExamRepository extends JpaRepository<TestExam, Long>{

}
