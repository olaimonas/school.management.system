package school.management.system.factory.impl;

import org.junit.Test;
import school.management.system.factory.SchoolFactory;
import school.management.system.model.School;
import school.management.system.util.impl.IdGenerator;
import school.management.system.util.impl.IdGeneratorImpl;

import static org.junit.Assert.*;

public class SchoolFactoryImplTest {

    private PersonFactoryImpl personFactory = new PersonFactoryImpl();
    private IdGenerator idGenerator = new IdGeneratorImpl();
    SchoolFactory schoolFactory = new SchoolFactoryImpl();

    @Test
    public void createSchoolTest() {
        School testSchool = schoolFactory.createSchool("TestSchool", 2, 5);
        assertEquals(2, testSchool.getTeachers().size());
        assertEquals(5, testSchool.getStudents().size());
        assertEquals("TestSchool", testSchool.getName());
    }
}