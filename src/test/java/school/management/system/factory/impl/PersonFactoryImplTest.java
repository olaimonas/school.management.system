package school.management.system.factory.impl;

import org.junit.Assert;
import org.junit.Test;

import school.management.system.factory.PersonFactory;
import school.management.system.model.Student;
import school.management.system.model.Teacher;

public class PersonFactoryImplTest {

    private PersonFactory personFactory = new PersonFactoryImpl();

    @Test
    // Enter your own Id
    public void createStudent() {
        Student johan = personFactory.createStudent("Johan", "Jakobsson", "1234");
        Assert.assertEquals("Johan", johan.getName());
        Assert.assertEquals("1234", johan.getId());
        Assert.assertEquals("Jakobsson", johan.getSurname());
    }
    
    @Test
    // Let the program create Id for you
    public void createStudentWithId() {
    	Student man = personFactory.createStudent("John", "Bastardo");
    	Assert.assertNotNull(man.getId());
    }
    
    @Test
    // Enter your own Id
    public void createTeacher() {
    	Teacher mrStrict = personFactory.createTeacher("Strict", "Bastard", "6666");
    	Assert.assertEquals("Strict", mrStrict.getName());
    	Assert.assertEquals("Bastard", mrStrict.getSurname());
    	Assert.assertEquals("6666", mrStrict.getId());
    }
}