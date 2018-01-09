package service;

import org.springframework.beans.factory.annotation.Autowired;
import school.management.system.model.Money;
import school.management.system.repository.StudentRepository;
import school.management.system.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepositoryImpl;
		
	@Override
	public Money getStipend(String schoolId, String studentId) {
		return studentRepositoryImpl.getStipend(schoolId, studentId);
	}
	
	@Override
	public String getName(String schoolId, String studentId) {
		return studentRepositoryImpl.getStudentName(schoolId, studentId);
	}
	
	@Override
	public String getId(String schoolId, String name, String surname) {
		return studentRepositoryImpl.getStudentId(schoolId, name, surname);
	}

}