package school.management.system.model;

public abstract class Person extends Entity {
    private String name;
    private String surname;

    public Person(String name, String surname, String id) {
        super(id);
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}