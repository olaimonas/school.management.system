package school.management.system.factory.impl;

import school.management.system.factory.PersonFactory;
import school.management.system.model.Student;
import school.management.system.model.Subject;
import school.management.system.model.Teacher;

public class PersonFactoryImpl implements PersonFactory {

    @Override
    public Student createStudent(String name, String surname, String id) {
        return new Student(name, surname, id);
    }

    @Override
    public Student createStudent(String name, String surname) {
        return new Student(name, surname);
    }

    @Override
    public Teacher createTeacher(String name, String surname, String id, Subject subject) {
        return new Teacher(name, surname, id, subject);
    }

    @Override
    public Teacher createTeacher(String name, String surname, Subject subject) {
        return new Teacher(name, surname, subject);
    }
}