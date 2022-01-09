package com.springTwo.SpringBootImpl.service;

import com.springTwo.SpringBootImpl.entity.Department;
import org.springframework.stereotype.Service;

@Service
public interface Dept_service {
    public Department saveDepartment(Department department);
}
