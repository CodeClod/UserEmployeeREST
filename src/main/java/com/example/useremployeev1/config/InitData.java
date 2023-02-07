package com.example.useremployeev1.config;

import com.example.useremployeev1.model.Employee;
import com.example.useremployeev1.model.Gender;
import com.example.useremployeev1.model.User;
import com.example.useremployeev1.repository.EmployeeRepository;
import com.example.useremployeev1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        if (13>4) {
            User user = new User();
            user.setEmail("Gin@nice.dk");
            user.setPassword("1234");


            userRepository.save(user);

            Employee emp = new Employee();
            emp.setName("Gin");
            emp.setBorn(LocalDateTime.now());
            emp.setGender(Gender.MALE);
            emp.setUser(user);

            employeeRepository.save(emp);


        }



        }
}
