package com.sp.employeeservice.controller;

import com.sp.employeeservice.model.Employee;
import com.sp.employeeservice.repository.EmployeeRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Log4j2
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping
    public Employee add(@RequestBody Employee employee){
        log.info("employee add : {}",employee);
        return repository.addEmployee(employee);
    }

    @GetMapping()
    public List<Employee> findAll(){
        log.info("employee find All");
        return  repository.findAll();
    }

    @GetMapping("/{id}")
    public  Employee getById(@PathVariable Long id){
        log.info("Get employee By id : {}",id);
        return repository.findById(id);
    }

    @GetMapping("/department/{departmentId}")
    public  List<Employee> getByDepartmentId(@PathVariable Long departmentId){
        log.info("Get employees By department id : {}",departmentId);
        return repository.findByDepartmentId(departmentId);
    }
}
