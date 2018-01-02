package school.management.system.factory;

import school.management.system.model.School;

public interface SchoolFactory {

    School createSchool(String name, int numTeachers, int numStudents);
}