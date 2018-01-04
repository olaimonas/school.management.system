package school.management.system.persistence;

import java.util.List;

import school.management.system.ctx.Registry;
import school.management.system.exception.NoSuchSchoolException;
import school.management.system.exception.NoSuchStudentException;
import school.management.system.exception.NoSuchTeacherException;
import school.management.system.model.Money;
import school.management.system.model.School;
import school.management.system.model.Student;
import school.management.system.model.Subject;
import school.management.system.model.Teacher;

public class Persistence {
	
	// Return a student's stipend according to provided Ids
	public Money returnStipend(String schoolId, String studentId) {
		for(int i = 0; i < Registry.getSchoolObjectList().size(); i++) {
			School school = Registry.getSchoolObjectList().get(i);
			if(school.getId().equals(schoolId)) {
				List<Student> students = school.getStudents();
				for(Student student : students) {
					if(student.getId().equals(studentId)) {
						return student.getStipend();
					}
				} throw new NoSuchStudentException();
			}
		} throw new NoSuchSchoolException();
	}
	
	// Return a student's name and surname according to provided Id
	public String returnStudentName(String schoolId, String studentId) {
		for(int i = 0; i < Registry.getSchoolObjectList().size(); i++) {
			School school = Registry.getSchoolObjectList().get(i);
			if(school.getId().equals(schoolId)) {
				List<Student> students = school.getStudents();
				for(Student student : students) {
					if(student.getId().equals(studentId)) {
						return student.getName() + " " + student.getSurname();
					}
				} throw new NoSuchStudentException();
			}
		} throw new NoSuchSchoolException();
	}
	
	
	// Return a student's Id according to provided School ID, student's name and surname
	public String returnStudentId(String schoolId, String name, String surname) {
		for(int i = 0; i < Registry.getSchoolObjectList().size(); i++) {
			School school = Registry.getSchoolObjectList().get(i);
			if(school.getId().equals(schoolId)) {
				List<Student> students = school.getStudents();
				for(Student student : students) {
					if(student.getName().equals(name) && student.getSurname().equals(surname)) {
						return student.getId();
					}
				} throw new NoSuchStudentException();
			}
		} throw new NoSuchSchoolException();
	}
	
	// Return a teacher's subject according to provided School and Teacher ID
	public Subject returnSubject(String schoolId, String teacherId) {
		for(int i = 0; i < Registry.getSchoolObjectList().size(); i++) {
			School school = Registry.getSchoolObjectList().get(i);
			if(school.getId().equals(schoolId)) {
				List<Teacher> teachers = school.getTeachers();
				for(Teacher teacher : teachers) {
					if(teacher.getId().equals(teacherId)) {
						return teacher.getSubject();
					}
				} throw new NoSuchTeacherException();
			}
		} throw new NoSuchSchoolException();
	}
	
	// Return a teacher's name and surname according to provided ID
	public String returnTeacherName(String schoolId, String teacherId) {
		for(int i = 0; i < Registry.getSchoolObjectList().size(); i++) {
			School school = Registry.getSchoolObjectList().get(i);
			if(school.getId().equals(schoolId)) {
				List<Teacher> teachers = school.getTeachers();
				for(Teacher teacher : teachers) {
					if(teacher.getId().equals(teacherId)) {
						return teacher.getName() + " " + teacher.getSurname();
					}
				} throw new NoSuchTeacherException();
			}
		} throw new NoSuchSchoolException();
	}
	
	// Return a teacher's ID according to provided School Id, teacher's name and surname
		public String returnTeacherId(String schoolId, String name, String surname) {
			for(int i = 0; i < Registry.getSchoolObjectList().size(); i++) {
				School school = Registry.getSchoolObjectList().get(i);
				if(school.getId().equals(schoolId)) {
					List<Teacher> teachers = school.getTeachers();
					for(Teacher teacher : teachers) {
						if(teacher.getName().equals(name) && teacher.getSurname().equals(surname)) {
							return teacher.getId();
						}
					} throw new NoSuchTeacherException();
				}
			} throw new NoSuchSchoolException();
		}

}