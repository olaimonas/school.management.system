package service;

import org.springframework.beans.factory.annotation.Autowired;
import school.management.system.model.Subject;
import school.management.system.repository.TeacherRepositoryImpl;

public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherRepositoryImpl teacherRepositoryImpl;

    public Subject getSubject(String schoolId, String teacherId) {
        return teacherRepositoryImpl.getSubject(schoolId, teacherId);
    }

    public String getName(String schoolId, String teacherId) {
        return teacherRepositoryImpl.getName(schoolId, teacherId);
    }

    public String getId(String schoolId, String name, String surname) {
        return teacherRepositoryImpl.getId(schoolId, name, surname);
    }

}