package com.example.employeeapi.Repositories;

import com.example.employeeapi.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>, JpaSpecificationExecutor {
}
