package service;

import school.management.system.model.Money;
import school.management.system.persistence.Persistence;

public interface StudentService {
	
	Persistence persistence = new Persistence();
	
	public Money getStipend(String schoolId, String studentId);
	
	public String getName(String schoolId, String studentId);
	
	public String getId(String schoolId, String name, String surname);

}