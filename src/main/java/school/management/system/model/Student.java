package school.management.system.model;

import school.management.system.util.impl.IdGenerator;

public class Student extends Person {

    private int grade;
    private Money totalFeesPaid;
    private Subject subject;
    private Diary diary;
    private Money stipend;

    public Student(String name, String surname, String id) {
        super(name, surname, id);
        totalFeesPaid = new Money(0);
        stipend = new Money(0);
    }

    public Student(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String generateId() {
        return IdGenerator.STUDENT_ID_PREIFX + IdGenerator.random.nextInt(IdGenerator.BOUND);
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

    public Money getTotalFeesPaid() {
		return totalFeesPaid;
	}

	public void setTotalFeesPaid(Money totalFeesPaid) {
		this.totalFeesPaid = totalFeesPaid;
	}

	public Money getStipend() {
		return stipend;
	}

	public void setStipend(Money stipend) {
		this.stipend = stipend;
	}

	@Override
    public String toString() {
        return "Student " + getName() + " " + getSurname() + ", id " + getId() + ".";
    }

}