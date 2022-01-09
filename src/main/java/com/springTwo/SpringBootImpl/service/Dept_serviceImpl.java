package com.springTwo.SpringBootImpl.service;

import com.springTwo.SpringBootImpl.entity.Department;
import com.springTwo.SpringBootImpl.repository.Dept_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Dept_serviceImpl implements Dept_service{

    @Autowired
    private Dept_repository dept_repository;

    public Department saveDepartment(Department department) {
        return dept_repository.save(department);
    }
}
