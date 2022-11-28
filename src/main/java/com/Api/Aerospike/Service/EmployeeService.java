package com.Api.Aerospike.Service;
import com.Api.Aerospike.Model.Emp;
import com.Api.Aerospike.Repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Emp registerEmployee(Emp employee) {
        return employeeRepository.save(employee);
    }

    public List<Emp> getAllEmployee() {
        List<Emp> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }
}