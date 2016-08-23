package fr.astek.testexam.ws;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.osgi.service.application.ApplicationAdminPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.astek.testexam.dao.TestExamenDao;
import fr.astek.testexam.entity.TestExam;

@RestController
@RequestMapping("/TestExamRest")
public class TestExamRest {
	
	@Autowired
	private TestExamenDao testExamenDao;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST )
	@Produces({"appation/json"})
	@Consumes({"application/json"})
	public void addTestExam(@RequestBody TestExam t) {
		testExamenDao.addTestExam(t);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE )
	@Produces({"appation/json"})
	@Consumes({"application/json"})
	public void deleteTestExam(@PathVariable Long id) {
		TestExam testExam = testExamenDao.findByID(id);
		testExamenDao.deleteTestExam(testExam);
	}

	@RequestMapping(value = "/set/{id}", method = RequestMethod.PUT)
	@Produces({"appation/json"})
	@Consumes({"application/json"})
	public void setTestExam(@PathVariable Long id) {
		TestExam testExam = testExamenDao.findByID(id);
		testExamenDao.setTestExam(testExam);
	}
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET )
	@Produces({"appation/json"})
	@Consumes({"application/json"})
	public List<TestExam> getAllTests() {
		return testExamenDao.getAllTests();
	}
	
	@RequestMapping(value = "/findByID/{id}", method = RequestMethod.GET )
	@Produces({"appation/json"})
	@Consumes({"application/json"})
	public TestExam findByID(@PathVariable Long id) {
		return testExamenDao.findByID(id);
	}

}
