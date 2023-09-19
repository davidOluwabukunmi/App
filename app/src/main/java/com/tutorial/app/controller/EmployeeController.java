package com.tutorial.app.controller;

import com.tutorial.app.dto.EmployeeDto;
import com.tutorial.app.response.EmployeeResponse;
import com.tutorial.app.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company/")
@RequiredArgsConstructor
public class EmployeeController {
    private  final EmployeeService employeeService;


    @PostMapping("employee")
    public EmployeeResponse addEmployee(@RequestBody EmployeeDto request){
        return employeeService.addEmployee(request);

    }

}
