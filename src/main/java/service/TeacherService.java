package service;

import school.management.system.model.Subject;
import school.management.system.persistence.Persistence;

public interface TeacherService {
	
Persistence persistence = new Persistence();
	
	public Subject getSubject(String schoolId, String teacherId);
	
	public String getName(String schoolId, String teacherId);
	
	public String getId(String schoolId, String name, String surname);

}