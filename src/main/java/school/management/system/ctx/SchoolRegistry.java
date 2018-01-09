package school.management.system.ctx;

import java.util.ArrayList;
import java.util.List;

import school.management.system.model.School;

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