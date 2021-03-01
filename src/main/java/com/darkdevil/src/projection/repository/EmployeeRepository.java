package com.darkdevil.src.projection.repository;

import com.darkdevil.src.projection.model.Employee;
import com.darkdevil.src.projection.dto.EmployeeBasicDetailsDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    // Entity Projection
    Employee findById(int id);

    // Variable Projection
    @Query(value = "SELECT e.name FROM employee e", nativeQuery = true)
    List<String> findAllEmployeeNames();

    // Scalar Projection
    @Query(value = "SELECT e.name, e.title FROM employee e", nativeQuery = true)
    List<Object[]> findAllEmployeeNamesAndTitle();
}
