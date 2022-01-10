package com.springTwo.SpringBootImpl.service;

import com.springTwo.SpringBootImpl.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Dept_service {
    public Department saveDepartment(Department department);

    List<Department> fetchAllDept();

    void deleteDept(Long id);

    Department updateDept(Long id, Department department);
}
