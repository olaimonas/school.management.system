package school.management.system.repository;

import org.springframework.stereotype.Service;
import school.management.system.ctx.SchoolRegistry;
import school.management.system.exception.NoSuchSchoolException;
import school.management.system.exception.NoSuchTeacherException;
import school.management.system.model.School;
import school.management.system.model.Subject;
import school.management.system.model.Teacher;

import java.util.List;

@Service
public class TeacherRepositoryImpl implements TeacherRepository {

    // Return a teacher's subject according to provided School and Teacher ID
    public Subject getSubject(String schoolId, String teacherId) {
        for (int i = 0; i < SchoolRegistry.getSchoolObjectList().size(); i++) {
            School school = SchoolRegistry.getSchoolObjectList().get(i);
            if (school.getId().equals(schoolId)) {
                List<Teacher> teachers = school.getTeachers();
                for (Teacher teacher : teachers) {
                    if (teacher.getId().equals(teacherId)) {
                        return teacher.getSubject();
                    }
                }
                throw new NoSuchTeacherException();
            }
        }
        throw new NoSuchSchoolException();
    }

    // Return a teacher's name and surname according to provided ID
    public String getName(String schoolId, String teacherId) {
        for (int i = 0; i < SchoolRegistry.getSchoolObjectList().size(); i++) {
            School school = SchoolRegistry.getSchoolObjectList().get(i);
            if (school.getId().equals(schoolId)) {
                List<Teacher> teachers = school.getTeachers();
                for (Teacher teacher : teachers) {
                    if (teacher.getId().equals(teacherId)) {
                        return teacher.getName() + " " + teacher.getSurname();
                    }
                }
                throw new NoSuchTeacherException();
            }
        }
        throw new NoSuchSchoolException();
    }

    // Return a teacher's ID according to provided School Id, teacher's name and surname
    public String getId(String schoolId, String name, String surname) {
        for (int i = 0; i < SchoolRegistry.getSchoolObjectList().size(); i++) {
            School school = SchoolRegistry.getSchoolObjectList().get(i);
            if (school.getId().equals(schoolId)) {
                List<Teacher> teachers = school.getTeachers();
                for (Teacher teacher : teachers) {
                    if (teacher.getName().equals(name) && teacher.getSurname().equals(surname)) {
                        return teacher.getId();
                    }
                }
                throw new NoSuchTeacherException();
            }
        }
        throw new NoSuchSchoolException();
    }

}