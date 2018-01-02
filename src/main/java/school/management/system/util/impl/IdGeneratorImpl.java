package school.management.system.util.impl;

import school.management.system.model.Student;

import java.util.Random;

public class IdGeneratorImpl implements IdGenerator {
    private static Random random = new Random();
    private final int BOUND = 1_000_000;
    private static Student student;

    public static void generateId(Class c) {

    }

    public String generateStudentId() {
        int id = random.nextInt(BOUND) + 1;
        return "STD" + id;
    }

    public String generateTeacherId() {
        int id = random.nextInt(BOUND) + 1;
        return "TCH" + id;
    }

    public String generateSchoolId() {
        int id = random.nextInt(BOUND) + 1;
        return "SCH" + id;
    }

    public String generateDepartmentId() {
        int id = random.nextInt(BOUND) + 1;
        return "DEP" + id;
    }
}