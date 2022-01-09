package com.springTwo.SpringBootImpl.repository;

import com.springTwo.SpringBootImpl.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dept_repository extends JpaRepository<Department,Long> {

}
