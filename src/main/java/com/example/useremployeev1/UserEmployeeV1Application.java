package com.example.useremployeev1;

import com.example.useremployeev1.model.Employee;
import com.example.useremployeev1.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserEmployeeV1Application {

    public static void main(String[] args) {
        SpringApplication.run(UserEmployeeV1Application.class, args);
    }

    Employee employee;
    public void test() {
        employee.setUser(new User());
    }

}
