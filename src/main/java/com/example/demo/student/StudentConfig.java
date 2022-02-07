package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student(
                    1L,
                    "John",
                    "john.krasinski@gmail.com",
                    LocalDate.of(1980, Month.MAY, 14)
            );

            Student alex = new Student(
                    "Alex",
                    "alex.smith@gmail.com",
                    LocalDate.of(1981, Month.JUNE, 21)
            );

            repository.saveAll(List.of(john, alex));
        };
    }
}
