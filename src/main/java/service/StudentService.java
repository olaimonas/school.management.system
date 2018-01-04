package service;

import school.management.system.model.Money;
import school.management.system.persistence.Persistence;

public class StudentService {
	
	Persistence persistence = new Persistence();
	
	public Money getStipend(String schoolId, String studentId) {
		return persistence.returnStipend(schoolId, studentId);
	}
	
	public String getName(String schoolId, String studentId) {
		return persistence.returnStudentName(schoolId, studentId);
	}
	
	public String getId(String schoolId, String name, String surname) {
		return persistence.returnStudentId(schoolId, name, surname);
	}

}
