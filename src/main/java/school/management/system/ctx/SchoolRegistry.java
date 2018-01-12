package school.management.system.ctx;

import school.management.system.model.School;

import java.util.ArrayList;
import java.util.List;

public class SchoolRegistry {

    private static List<School> schoolObjectList = new ArrayList<>();

    public static void add(School school) {
        schoolObjectList.add(school);
    }

    public static List<School> getSchoolObjectList() {
        return schoolObjectList;
    }

    public static void setSchoolObjectList(List<School> schoolObjectList) {
        SchoolRegistry.schoolObjectList = schoolObjectList;
    }
}