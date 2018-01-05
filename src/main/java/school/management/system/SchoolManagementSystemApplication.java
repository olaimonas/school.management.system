package school.management.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import school.management.system.exception.InsufficientProfitException;

@SpringBootApplication
public class SchoolManagementSystemApplication {

    public static void main(String[] args) {

    	SpringApplication.run(SchoolManagementSystemApplication.class, args);
    	throw new InsufficientProfitException();
    }
}