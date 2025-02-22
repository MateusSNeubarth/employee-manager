package com.mateusneubarth.employeemanager.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateusneubarth.employeemanager.exceptions.UserNotFoundException;
import com.mateusneubarth.employeemanager.model.Employee;
import com.mateusneubarth.employeemanager.repository.IEmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private final IEmployeeRepository employeeRepository;

    public EmployeeService() {
        this.employeeRepository = null;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepository.findEmployeeById(id)
            .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteEmployeeById(id);
    }
}
