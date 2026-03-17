package com.example.demogithubacton;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(StudentRepository studentRepository) {
        return args -> {
            // Add some sample students
            studentRepository.save(new Student(null, "Nadila Nawod", "ABC High School"));
            studentRepository.save(new Student(null, "John Doe", "XYZ Academy"));
            studentRepository.save(new Student(null, "Jane Smith", "Springfield School"));
            studentRepository.save(new Student(null, "Michael Brown", "Riverdale High"));
            System.out.println("Sample students data initialized.");
        };
    }
}
