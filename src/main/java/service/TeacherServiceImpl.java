package service;

import school.management.system.model.Subject;
import school.management.system.repository.TeacherRepositoryImpl;

public class TeacherServiceImpl implements TeacherService {

	TeacherRepositoryImpl teacherRepositoryImpl = new TeacherRepositoryImpl();
	
	public Subject getSubject(String schoolId, String teacherId) {
		return teacherRepositoryImpl.getSubject(schoolId, teacherId);
	}
	
	public String getName(String schoolId, String teacherId) {
		return teacherRepositoryImpl.getTeacherName(schoolId, teacherId);
	}
	
	public String getId(String schoolId, String name, String surname) {
		return teacherRepositoryImpl.getTeacherId(schoolId, name, surname);
	}

}