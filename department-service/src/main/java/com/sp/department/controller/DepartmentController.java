package com.sp.department.controller;

import com.sp.department.client.EmployeeClient;
import com.sp.department.model.Department;
import com.sp.department.repository.DepartmentRepository;
import lombok.extern.log4j.Log4j2;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@Log4j2
public class DepartmentController {

    @Autowired
    EmployeeClient employeeClient;

    @Autowired
    private DepartmentRepository repository;

    @PostMapping
    public Department add(@RequestBody Department department){
        log.info("Department add : {}",department);
        return repository.addDepartment(department);
    }

    @GetMapping
    public List<Department> findAll(){
        log.info("Department find All");
        return  repository.findAll();
    }

    @GetMapping("/{id}")
    public  Department getById(@PathVariable Long id){
        log.info("Get Department By id : {}",id);
        return repository.findById(id);
    }

    @GetMapping("/with-employee")
    public List<Department> findAllWithEmployee(){
        log.info("Department find All");
        List<Department> departments
                = repository.findAll();
        departments.forEach(department ->
                department.setEmployees(
                        employeeClient.getByDepartmentId(department.getId())));
        return  departments;
    }




}
