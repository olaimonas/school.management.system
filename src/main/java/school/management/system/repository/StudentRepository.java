package school.management.system.repository;

import school.management.system.model.Money;

public interface StudentRepository {

    Money getStipend(String schoolId, String studentId);

    String getName(String schoolId, String studentId);

    String getId(String schoolId, String name, String surname);
}