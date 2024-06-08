package com.ust.Employee_info.service;

import com.ust.Employee_info.model.EmployeeDetails;
import com.ust.Employee_info.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private  EmployeeRepository repo;
    public EmployeeDetails addDetail(EmployeeDetails employeeDetails) {
    return repo.save(employeeDetails);
    }

    public EmployeeDetails getDetails(int id) {
        return repo.findById(id).orElse(null);
    }

    public List<EmployeeDetails> listdetails() {
        return repo.findAll();
    }
}
