package school.management.system.repository;

import school.management.system.model.Subject;

public interface TeacherRepository {

    // Return a teacher's subject according to provided School and Teacher ID
    Subject getSubject(String schoolId, String teacherId);

    // Return a teacher's name and surname according to provided ID
    String getName(String schoolId, String teacherId);

    // Return a teacher's ID according to provided School Id, teacher's name and surname
    String getId(String schoolId, String name, String surname);
}