package school.management.system.factory.impl;

import school.management.system.factory.PersonFactory;
import school.management.system.util.impl.IdGenerator;
import school.management.system.util.impl.IdGeneratorImpl;
import school.management.system.model.Student;
import school.management.system.model.Teacher;

public class PersonFactoryImpl implements PersonFactory {

    private IdGenerator idGenerator = new IdGeneratorImpl();

    @Override
    public Student createStudent(String name, String surname, String id) {
        return new Student(name, surname, id);
    }

    public Student createStudent(String name, String surname) {
        String id = idGenerator.generateStudentId();
        return new Student(name, surname, id);
    }

    @Override
    public Teacher createTeacher(String name, String surname, String id) {
        return new Teacher(name, surname, id);
    }

    public Teacher createTeacher(String name, String surname) {
        String id = idGenerator.generateTeacherId();
        return new Teacher(name, surname, id);
    }

    public IdGenerator getIdGenerator() {
        return idGenerator;
    }

    public void setIdGenerator(IdGeneratorImpl idGenerator) {
        this.idGenerator = idGenerator;
    }
}