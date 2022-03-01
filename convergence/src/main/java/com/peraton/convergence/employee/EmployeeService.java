package com.peraton.convergence.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> employeeList() {
        return employeeRepository.findAll();

    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
