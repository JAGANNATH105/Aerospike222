package com.Api.Aerospike.Controller;

import com.Api.Aerospike.Model.Emp;
import com.Api.Aerospike.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public Emp registerEmployee(@RequestBody Emp employee) {
        return employeeService.registerEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Emp> getAllEmployees() {
        return employeeService.getAllEmployee();
    }
}