package service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import school.management.system.model.School;
import school.management.system.model.Student;
import school.management.system.model.Subject;
import school.management.system.model.Teacher;

public class StudentServiceTest {

	@Test
	public void studentServiceTest() {
		StudentService studentService = new StudentServiceImpl();
		Student student = new Student("Ockarik", "Zadrot", "STD333");
		List<Student> students = new ArrayList<>();
		students.add(student);
		School school = new School("JavaSchool", null, students);
		Assert.assertEquals("STD333", studentService.getId(school.getId(), "Ockarik", "Zadrot"));
		Assert.assertEquals("Ockarik Zadrot", studentService.getName(school.getId(), "STD333"));
	}
	
}