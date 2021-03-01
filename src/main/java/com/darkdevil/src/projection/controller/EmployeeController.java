package com.darkdevil.src.projection.controller;

import com.darkdevil.src.projection.model.Employee;
import com.darkdevil.src.projection.dto.EmployeeBasicDetailsDTO;
import com.darkdevil.src.projection.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    final private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {this.employeeService = employeeService;}

    // Entity Projection
    @GetMapping("employees/{id}")
    public Employee getElemployeeById(@PathVariable int id){
        Employee employee = employeeService.findById(id);

        System.out.println(employee.toString());
        System.out.println(employee.getComment());

        return employee;
    }

    // Variable Projection
    @GetMapping("employees/name")
    public List<String> findAllEmployeeNames(){
        return employeeService.findAllEmployeeNames();
    }

    // Scalar Projection
    @GetMapping("employees/name&title")
    public List<Object[]> findAllEmployeeNamesAndTitle() {
        List<Object[]> listOfEmployeeDetails = employeeService.findAllEmployeeNamesAndTitle();
        for (Object[] objs : listOfEmployeeDetails){
            System.out.println("Employee");
            System.out.println("Name => " + objs[0]);
            System.out.println("Title => " + objs[1]);
        }
        return listOfEmployeeDetails;
    }
}
