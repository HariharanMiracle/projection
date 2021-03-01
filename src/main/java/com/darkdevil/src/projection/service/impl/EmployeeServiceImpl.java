package com.darkdevil.src.projection.service.impl;

import com.darkdevil.src.projection.model.Employee;
import com.darkdevil.src.projection.dto.EmployeeBasicDetailsDTO;
import com.darkdevil.src.projection.repository.EmployeeRepository;
import com.darkdevil.src.projection.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Entity Projection
    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id);
    }

    // Variable Projection
    @Override
    public List<String> findAllEmployeeNames() {
        return employeeRepository.findAllEmployeeNames();
    }

    // Scalar Projection
    @Override
    public List<Object[]> findAllEmployeeNamesAndTitle() {
        return employeeRepository.findAllEmployeeNamesAndTitle();
    }
}
