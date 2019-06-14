package com.java.practice.PracticeJava.Resource;

import com.java.practice.PracticeJava.Entity.Employee;
import com.java.practice.PracticeJava.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeResource {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeRepo.save(employee);
    }

}
