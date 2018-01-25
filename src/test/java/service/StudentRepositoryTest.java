package service;

import junit.framework.Assert;
import org.junit.Test;
import school.management.system.model.School;
import school.management.system.model.Student;
import school.management.system.repository.StudentRepository;
import school.management.system.repository.StudentRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryTest {

    @Test
    public void idTest() {
        StudentRepository studentRepository = new StudentRepositoryImpl();
        Student student = new Student("Ockarik", "Zadrot", "STD333");
        List<Student> students = new ArrayList<>();
        students.add(student);
        School school = new School("JavaSchool", null, students);
        Assert.assertEquals("STD333", studentRepository.getId(school.getId(), "Ockarik", "Zadrot"));
    }

    @Test
    public void nameAndSurnameTest() {
        StudentRepository studentRepository = new StudentRepositoryImpl();
        Student student = new Student("Ockarik", "Zadrot", "STD333");
        List<Student> students = new ArrayList<>();
        students.add(student);
        School school = new School("JavaSchool", null, students);
        Assert.assertEquals("Ockarik Zadrot", studentRepository.getName(school.getId(), "STD333"));
    }

    @Test
    public void stipendTest() {
        StudentRepository studentRepository = new StudentRepositoryImpl();
        Student student = new Student("Ockarik", "Zadrot", "STD333");
        List<Student> students = new ArrayList<>();
        students.add(student);
        School school = new School("JavaSchool", null, students);
        Assert.assertNotNull(student.getStipend());
    }

}