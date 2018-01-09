package school.management.system.repository;

import school.management.system.model.Money;

public interface StudentRepository {

    // Return a student's stipend according to provided Ids
    Money getStipend(String schoolId, String studentId);

    // Return a student's name and surname according to provided Id
    String getStudentName(String schoolId, String studentId);

    // Return a student's Id according to provided School ID, student's name and surname
    String getStudentId(String schoolId, String name, String surname);
}