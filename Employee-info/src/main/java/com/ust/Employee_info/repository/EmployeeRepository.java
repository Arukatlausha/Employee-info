package com.ust.Employee_info.repository;

import com.ust.Employee_info.model.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails,Integer> {


}
