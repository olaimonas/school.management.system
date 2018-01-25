package school.management.system.repository;

import school.management.system.model.Subject;

public interface TeacherRepository {

    Subject getSubject(String schoolId, String teacherId);

    String getName(String schoolId, String teacherId);

    String getId(String schoolId, String name, String surname);
}