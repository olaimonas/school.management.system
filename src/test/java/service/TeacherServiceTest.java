package service;

import junit.framework.Assert;
import org.junit.Test;
import school.management.system.model.School;
import school.management.system.model.Subject;
import school.management.system.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherServiceTest {

    @Test
    public void teacherServiceTest() {
        TeacherService teacherService = new TeacherServiceImpl();
        Teacher teacher = new Teacher("Mister", "Dork", "TCH666", Subject.ART);
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher);
        School school = new School("DorkSchool", teachers, null);
        Assert.assertEquals("TCH666", teacherService.getId(school.getId(), "Mister", "Dork"));
        Assert.assertEquals("Mister Dork", teacherService.getName(school.getId(), "TCH666"));
    }

}