package com.example.useremployeev1.model;

import com.example.useremployeev1.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserTest {

    @Autowired
    EmployeeRepository employeeRepository;
    @Test
    void testGin() {
        assertEquals(true,employeeRepository.findByName("Gin").isPresent());
    }

    @Test
    void testvalidemail() {
        assertEquals(true, employeeRepository.findByName("Gin").orElse(new Employee()).isValidEmail());
    }
}
