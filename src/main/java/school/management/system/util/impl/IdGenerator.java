package school.management.system.util.impl;

import java.util.Random;

public interface IdGenerator {

    Random random = new Random();
    int BOUND = 1_000_000;
    String STUDENT_ID_PREIFX = "STD";
    String TEACHER_ID_PREIFX = "TCH";
    String SCHOOL_ID_PREIFX = "SCH";
    String DEPARTMENT_ID_PREIFX = "DPT";

    String generateId();
}
