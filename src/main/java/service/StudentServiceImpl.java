package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.management.system.model.Money;
import school.management.system.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Money getStipend(String schoolId, String studentId) {
        return studentRepository.getStipend(schoolId, studentId);
    }

    @Override
    public String getName(String schoolId, String studentId) {
        return studentRepository.getName(schoolId, studentId);
    }

    @Override
    public String getId(String schoolId, String name, String surname) {
        return studentRepository.getId(schoolId, name, surname);
    }

}