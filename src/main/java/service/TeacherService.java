package service;

import school.management.system.model.Subject;
import school.management.system.persistence.Persistence;

public class TeacherService {
	
Persistence persistence = new Persistence();
	
	public Subject getSubject(String schoolId, String teacherId) {
		return persistence.returnSubject(schoolId, teacherId);
	}
	
	public String getName(String schoolId, String teacherId) {
		return persistence.returnTeacherName(schoolId, teacherId);
	}
	
	public String getId(String schoolId, String name, String surname) {
		return persistence.returnTeacherId(schoolId, name, surname);
	}

}