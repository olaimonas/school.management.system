package service;

import junit.framework.Assert;
import org.junit.Test;
import school.management.system.model.School;
import school.management.system.model.Subject;
import school.management.system.model.Teacher;
import school.management.system.repository.TeacherRepository;
import school.management.system.repository.TeacherRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepositoryTest {

    @Test
    public void idTest() {
        TeacherRepository teacherRepository = new TeacherRepositoryImpl();
        Teacher teacher = new Teacher("Mister", "Dork", "TCH666", Subject.ART);
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher);
        School school = new School("DorkSchool", teachers, null);
        Assert.assertEquals("TCH666", teacherRepository.getId(school.getId(), "Mister", "Dork"));
    }

    @Test
    public void nameAndSurnameTest() {
        TeacherRepository teacherRepository = new TeacherRepositoryImpl();
        Teacher teacher = new Teacher("Mister", "Dork", "TCH666", Subject.ART);
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher);
        School school = new School("DorkSchool", teachers, null);
        Assert.assertEquals("Mister Dork", teacherRepository.getName(school.getId(), "TCH666"));
    }

    @Test
    public void subjectTest() {
        TeacherRepository teacherRepository = new TeacherRepositoryImpl();
        Teacher teacher = new Teacher("Mister", "Dork", "TCH666", Subject.ART);
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher);
        School school = new School("DorkSchool", teachers, null);
        Assert.assertNotNull(teacher.getSubject());
    }

}