package com.springTwo.SpringBootImpl.controller;

import com.springTwo.SpringBootImpl.entity.Department;
import com.springTwo.SpringBootImpl.exceptions.DepartmentNotFoundException;
import com.springTwo.SpringBootImpl.service.Dept_service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
public class Dept_controller {

    @Autowired
    private Dept_service dept_service;

    private final Logger LOGGER = LoggerFactory.getLogger(Dept_controller.class);

    @PostMapping("/department")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside Save method");
        return dept_service.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getAllDept(){
        return dept_service.fetchAllDept();
    }

    @DeleteMapping("department/{id}")
    public String deleteDept(@PathVariable("id") Long id){
        dept_service.deleteDept(id);
        return "Department deleted successfully";
    }

    @PutMapping("department/{id}")
    public Department updateDept(@PathVariable("id") Long id, @RequestBody Department department){
        return dept_service.updateDept(id,department);
    }

    @GetMapping("/department/name/{name}")
    public Department getDeptByName(@PathVariable("name") String name){
        return dept_service.getDeptByName(name);
    }
    @GetMapping("/department/{id}")
    public Department findDeptById(@PathVariable("id") Long id) throws DepartmentNotFoundException {
        Department d = dept_service.getDeptById(id);

        return d;
    }
}
