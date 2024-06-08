package com.ust.Employee_info.controller;

import com.ust.Employee_info.model.EmployeeDetails;
import com.ust.Employee_info.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;

@RestController
@RequestMapping("/employeedetails")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/addDetail")
    public EmployeeDetails addDetail(@RequestBody EmployeeDetails employeeDetails)
    {
     return employeeService.addDetail(employeeDetails);
    }
@GetMapping("/getdetail/{id}")
    public EmployeeDetails getDetails(@PathVariable int id)
{
    return employeeService.getDetails(id);
}
@PostMapping("/addDetails")
    public List<EmployeeDetails> addDetails(@RequestBody List<EmployeeDetails> employeeDetails){
return employeeService.listdetails();
}

}
