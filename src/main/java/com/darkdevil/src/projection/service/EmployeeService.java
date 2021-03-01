package com.darkdevil.src.projection.service;

import com.darkdevil.src.projection.model.Employee;
import com.darkdevil.src.projection.dto.EmployeeBasicDetailsDTO;

import java.util.List;


public interface EmployeeService {
    // Entity Projection
    Employee findById(int id);

    // Variable Projection
    List<String> findAllEmployeeNames();

    // Scalar Projection
    List<Object[]> findAllEmployeeNamesAndTitle();
}
