package com.java.practice.PracticeJava.Repository;

import com.java.practice.PracticeJava.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long>{
}