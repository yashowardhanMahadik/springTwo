package com.springTwo.SpringBootImpl.controller;

import com.springTwo.SpringBootImpl.entity.Department;
import com.springTwo.SpringBootImpl.service.Dept_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class Dept_controller {

    @Autowired
    private Dept_service dept_service;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
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
}
