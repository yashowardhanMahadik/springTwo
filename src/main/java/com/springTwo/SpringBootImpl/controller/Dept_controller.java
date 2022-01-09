package com.springTwo.SpringBootImpl.controller;

import com.springTwo.SpringBootImpl.entity.Department;
import com.springTwo.SpringBootImpl.service.Dept_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class Dept_controller {

    @Autowired
    private Dept_service dept_service;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
        return dept_service.saveDepartment(department);
    }
}
