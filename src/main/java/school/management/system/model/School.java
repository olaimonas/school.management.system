package school.management.system.model;

import school.management.system.util.impl.IdGenerator;

import java.util.List;

public class School extends Entity {

    private Administration administration = new Administration();
    private FinanceManagement financeManagement = new FinanceManagement();
    private String name;
    private List<Teacher> teachers;
    private List<Student> students;

    public School(String name, List<Teacher> teachers, List<Student> students) {
        this.name = name;
        this.teachers = teachers;
        this.students = students;
    }
    
    public School(String name) {
    	
    }

    @Override
    public String generateId() {
        return IdGenerator.SCHOOL_ID_PREIFX + IdGenerator.random.nextInt(IdGenerator.BOUND);
    }

    public Administration getAdministration() {
        return administration;
    }

    public void setAdministration(Administration administration) {
        this.administration = administration;
    }

    public FinanceManagement getFinanceManagement() {
        return financeManagement;
    }

    public void setFinanceManagement(FinanceManagement financeManagement) {
        this.financeManagement = financeManagement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return getName();
    }

}