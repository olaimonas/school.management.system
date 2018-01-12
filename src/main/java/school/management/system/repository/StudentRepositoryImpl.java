package school.management.system.repository;

import org.springframework.stereotype.Service;
import school.management.system.ctx.SchoolRegistry;
import school.management.system.exception.NoStipendException;
import school.management.system.exception.NoSuchSchoolException;
import school.management.system.exception.NoSuchStudentException;
import school.management.system.model.Money;
import school.management.system.model.School;
import school.management.system.model.Student;

import java.util.List;

@Service
public class StudentRepositoryImpl implements StudentRepository {

    public Money getStipend(String schoolId, String studentId) {
        for (int i = 0; i < SchoolRegistry.getSchoolObjectList().size(); i++) {
            School school = SchoolRegistry.getSchoolObjectList().get(i);
            if (school.getId().equals(schoolId)) {
                List<Student> students = school.getStudents();
                for (Student student : students) {
                    if (student.getId().equals(studentId)) {
                        if (student.getStipend() == null) throw new NoStipendException();
                        return student.getStipend();
                    }
                }
                throw new NoSuchStudentException();
            }
        }
        throw new NoSuchSchoolException();
    }

    public String getName(String schoolId, String studentId) {
        for (int i = 0; i < SchoolRegistry.getSchoolObjectList().size(); i++) {
            School school = SchoolRegistry.getSchoolObjectList().get(i);
            if (school.getId().equals(schoolId)) {
                List<Student> students = school.getStudents();
                for (Student student : students) {
                    if (student.getId().equals(studentId)) {
                        return student.getName() + " " + student.getSurname();
                    }
                }
                throw new NoSuchStudentException();
            }
        }
        throw new NoSuchSchoolException();
    }

    public String getId(String schoolId, String name, String surname) {
        for (int i = 0; i < SchoolRegistry.getSchoolObjectList().size(); i++) {
            School school = SchoolRegistry.getSchoolObjectList().get(i);
            if (school.getId().equals(schoolId)) {
                List<Student> students = school.getStudents();
                for (Student student : students) {
                    if (student.getName().equals(name) && student.getSurname().equals(surname)) {
                        return student.getId();
                    }
                }
                throw new NoSuchStudentException();
            }
        }
        throw new NoSuchSchoolException();
    }

}