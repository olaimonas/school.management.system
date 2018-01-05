package service;

import school.management.system.model.Money;
import school.management.system.persistence.Persistence;

public class StudentServiceImpl implements StudentService {

	Persistence persistence = new Persistence();
		
	@Override
	public Money getStipend(String schoolId, String studentId) {
		return persistence.returnStipend(schoolId, studentId);
	}
	
	@Override
	public String getName(String schoolId, String studentId) {
		return persistence.returnStudentName(schoolId, studentId);
	}
	
	@Override
	public String getId(String schoolId, String name, String surname) {
		return persistence.returnStudentId(schoolId, name, surname);
	}

}
