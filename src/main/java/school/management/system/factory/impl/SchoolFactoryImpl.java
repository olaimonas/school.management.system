package school.management.system.factory.impl;

import school.management.system.factory.SchoolFactory;
import school.management.system.model.School;
import school.management.system.model.Student;
import school.management.system.model.Subject;
import school.management.system.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SchoolFactoryImpl implements SchoolFactory {

    private PersonFactoryImpl personFactory = new PersonFactoryImpl();

    @Override
    public School createSchool(String name, int numTeachers, int numStudents) {

        School school;

        // Create a chosen number of faceless teachers and students
        List<Teacher> teacherList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();

        // Teachers
        IntStream.range(0, numTeachers)
                .forEach(i -> teacherList.add(personFactory.createTeacher("Teacher " + i, "Teacher " + i, Subject.MATHS)));

        // Students
        IntStream.range(0, numStudents)
                .forEach(i -> studentList.add(personFactory.createStudent("Student " + i, "Student " + i)));

        school = new School(name, teacherList, studentList);
        return school;
    }

    public PersonFactoryImpl getPersonFactory() {
        return personFactory;
    }

    public void setPersonFactory(PersonFactoryImpl personFactory) {
        this.personFactory = personFactory;
    }
}