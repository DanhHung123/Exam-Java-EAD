package com.example.employeeapi.Controller;

import com.example.employeeapi.Entity.Employee;
import com.example.employeeapi.Entity.ResponseObject;
import com.example.employeeapi.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("")
    List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping("")
    ResponseEntity<ResponseObject> createEmployee(@RequestBody Employee newEmployee) {
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("ok", "Create Employee successfully", employeeRepository.save(newEmployee))
        );
    }
}
