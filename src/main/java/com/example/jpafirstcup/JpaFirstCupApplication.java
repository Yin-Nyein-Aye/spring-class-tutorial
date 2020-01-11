package com.example.jpafirstcup;

import com.example.jpafirstcup.domain.Gender;
import com.example.jpafirstcup.domain.Student;
import com.example.jpafirstcup.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class JpaFirstCupApplication {
    @Autowired
    private StudentRepository studentRepository;
    public static void main(String[] args) {
        SpringApplication.run(JpaFirstCupApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(){

        return args -> {
            Student s1 = new Student("Yin Nyein",LocalDate.of(1996,1,14), Gender.FEMALE);
            Student s2 = new Student("Yee Mon",LocalDate.of(1996,10,7), Gender.FEMALE);
            Student s3 = new Student("Yadanar",LocalDate.of(1996,1,29), Gender.FEMALE);

            this.studentRepository.save(s1);
            this.studentRepository.save(s2);
            this.studentRepository.save(s3);

        };
    }

}
