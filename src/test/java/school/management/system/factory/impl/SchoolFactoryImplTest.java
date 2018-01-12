package school.management.system.factory.impl;

import org.junit.Test;
import school.management.system.factory.SchoolFactory;
import school.management.system.model.School;

import static org.junit.Assert.assertEquals;

public class SchoolFactoryImplTest {

    private PersonFactoryImpl personFactory = new PersonFactoryImpl();

    SchoolFactory schoolFactory = new SchoolFactoryImpl();

    @Test
    public void createSchoolTest() {
        School testSchool = schoolFactory.createSchool("TestSchool", 2, 5);
        assertEquals(2, testSchool.getTeachers().size());
        assertEquals(5, testSchool.getStudents().size());
        assertEquals("TestSchool", testSchool.getName());
    }
}