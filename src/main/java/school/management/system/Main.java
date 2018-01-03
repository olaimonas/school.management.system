package school.management.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import school.management.system.model.Administration;
import school.management.system.model.School;
import school.management.system.model.Student;
import school.management.system.model.Teacher;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

    	SpringApplication.run(Main.class, args);
    	
        // Test
        Administration administration = new Administration();
        System.out.println(administration.getId());
        
        Student student = new Student("Jacob", "Adkinsson");
        System.out.println(student.getId());
        
        Teacher teacher = new Teacher("Eva", "Asplund");
        System.out.println(teacher.getId());
        
        School school = new School("JavaSchool");
        System.out.println(school.getId());
        // Test
    }
}