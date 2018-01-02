package school.management.system.model;

public class Student extends Person {

    private int grade;
    private Money totalFeesPaid;
    private Subject subject;
    private Diary diary;

    public Student(String name, String surname, String id) {
        super(name, surname, id);
        totalFeesPaid = new Money(0);
    }

    public void payFee(double amount) {
        totalFeesPaid.add(new Money(amount));
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Diary getDiary() {
        return diary;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }

    @Override
    public String toString() {
        return "Student " + getName() + " " + getSurname() + ", id " + getId() + ".";
    }
}