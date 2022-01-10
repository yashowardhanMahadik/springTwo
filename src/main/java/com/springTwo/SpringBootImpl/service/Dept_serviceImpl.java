package com.springTwo.SpringBootImpl.service;

import com.springTwo.SpringBootImpl.entity.Department;
import com.springTwo.SpringBootImpl.repository.Dept_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Dept_serviceImpl implements Dept_service{

    @Autowired
    private Dept_repository dept_repository;

    public Department saveDepartment(Department department) {
        return dept_repository.save(department);
    }

    @Override
    public List<Department> fetchAllDept() {
        return dept_repository.findAll();
    }

    @Override
    public void deleteDept(Long id) {
        Department d = dept_repository.getById(id);
        dept_repository.delete(d);
    }

    @Override
    public Department updateDept(Long id, Department department) {
        Department d = dept_repository.findById(id).get();
        if(d.getDeptName()!=null && department.getDeptName()!=null){
            d.setDeptName(department.getDeptName());
        }
        if(d.getDeptAddress()!=null && department.getDeptAddress()!=null){
            d.setDeptAddress(department.getDeptAddress());
        }
        if(d.getDeptCode()!=null && department.getDeptCode()!=null){
            d.setDeptCode(department.getDeptCode());
        }
//        d.setDeptAddress(department.getDeptAddress());
        return dept_repository.save(d);
    }
}
