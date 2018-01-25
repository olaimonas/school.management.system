package school.management.system.factory.impl;

import org.junit.Assert;
import org.junit.Test;
import school.management.system.factory.PersonFactory;
import school.management.system.model.Student;
import school.management.system.model.Subject;
import school.management.system.model.Teacher;

public class PersonFactoryImplTest {

    private PersonFactory personFactory = new PersonFactoryImpl();

    @Test
    public void createStudent() {
        Student johan = personFactory.createStudent("Johan", "Jakobsson", "1234");
        Assert.assertEquals("Johan", johan.getName());
    }

    @Test
    public void createStudentWithId() {
        Student man = personFactory.createStudent("John", "Bastardo");
        Assert.assertNotNull(man.getId());
    }

    @Test
    public void createTeacher() {
        Teacher mrStrict = personFactory.createTeacher("Strict", "Bastard", "6666", Subject.MATHS);
        Assert.assertEquals("6666", mrStrict.getId());
    }

    @Test
    public void createTeacherWithId() {
        Teacher teacher = personFactory.createTeacher("Mister", "Proper", Subject.CHEMISTRY);
        Assert.assertNotNull(teacher.getId());
    }
}