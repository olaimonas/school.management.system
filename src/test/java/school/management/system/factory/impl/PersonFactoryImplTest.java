package school.management.system.factory.impl;

import org.junit.Assert;
import org.junit.Test;
import school.management.system.factory.PersonFactory;
import school.management.system.model.Student;

import static org.junit.Assert.*;

public class PersonFactoryImplTest {

    private PersonFactory personFactory = new PersonFactoryImpl();

    @Test
    public void createStudent() {
        Student johan = personFactory.createStudent("Johan", "Jakobsson", "1234");
        Assert.assertEquals("Johan", johan.getName());
        Assert.assertEquals("1234", johan.getId());
        Assert.assertEquals("Jakobsson", johan.getSurname());
    }
}