package com.TW.Homework.Kata1213.SpringBoot.demo.week6_SpringBoot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {
    private List<Employee> employees;

    EmployeeController() {
        employees = Arrays.asList(
                new Employee(1, "小明", 20, "男"),
                new Employee(2, "小红", 19, "女"),
                new Employee(3, "小智", 15, "男"),
                new Employee(4, "小刚", 16, "男"),
                new Employee(5, "小霞", 15, "女")
        );
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getEmployees() {
        return employees;
    }
}
