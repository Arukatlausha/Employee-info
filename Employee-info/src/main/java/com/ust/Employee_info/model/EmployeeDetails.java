package com.ust.Employee_info.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDetails {
    @GeneratedValue
    @Id
    private int id;
private String name;
private String salary;
private char grade;


}
