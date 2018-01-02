package school.management.system.model;

public class Administration extends Department {

    private int numberOfTeachers;
    private int numberOfStudents;
    private int totalNumberOfPersons;

    public Administration() {
        super();
    }

    public int getNumberOfTeachers(School school) {
        numberOfTeachers = school.getTeachers().size();
        return numberOfTeachers;
    }

    public void setNumberOfTeachers(int numberOfTeachers) {
        this.numberOfTeachers = numberOfTeachers;
    }

    public int getNumberOfStudents(School school) {
        numberOfStudents = school.getStudents().size();
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getTotalNumberOfPersons(School school) {
        totalNumberOfPersons = getNumberOfStudents(school) + getNumberOfTeachers(school);
        return totalNumberOfPersons;
    }

    public void setTotalNumberOfPersons(int totalNumberOfPersons) {
        this.totalNumberOfPersons = totalNumberOfPersons;
    }
}