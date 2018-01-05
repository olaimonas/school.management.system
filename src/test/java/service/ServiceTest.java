package service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;
import school.management.system.model.School;
import school.management.system.model.Student;
import school.management.system.model.Subject;
import school.management.system.model.Teacher;

public class ServiceTest {
	
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
	
	@Test
	public void teacherServiceTest() {
		TeacherService teacherService = new TeacherServiceImpl();
		Teacher teacher = new Teacher("Mister", "Dork", "TCH666", Subject.ART);
		List<Teacher> teachers = new ArrayList<>();
		teachers.add(teacher);
		School school = new School("DorkSchool", teachers, null);
		Assert.assertEquals("TCH666", teacherService.getId(school.getId(), "Mister", "Dork"));
		Assert.assertEquals("Mister Dork", teacherService.getName(school.getId(), "TCH666"));
	}
	
}