package school.management.system.model;

import school.management.system.exception.InvalidGradeException;

import java.math.BigDecimal;

public class Teacher extends Person {

    private Money salary;
    private Subject subject;
    private int yearsOfExperience;

    public Teacher(String name, String surname, String id) {
        super(name, surname, id);
    }

    public void setStudentGrade(Student student, int grade) {
        if(grade < 1 || grade > 10) {
            throw new InvalidGradeException();
        } else {
            student.setGrade(grade);
        }
    }

    public Money getSalary() {
        return salary;
    }

    public void setSalary(Money salary) {
        this.salary = salary;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher " + getName() + " " + getSurname() + ", id " + getId() + ".";
    }
}