package school.management.system.factory;

import school.management.system.model.Student;
import school.management.system.model.Subject;
import school.management.system.model.Teacher;

public interface PersonFactory {

    Student createStudent(String name, String surname, String id);

    Student createStudent(String name, String surname);

    Teacher createTeacher(String name, String surname, String id, Subject subject);

    Teacher createTeacher(String name, String surname, Subject subject);
}
