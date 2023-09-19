package com.tutorial.app.service;

import com.tutorial.app.dto.EmployeeDto;
import com.tutorial.app.model.Employee;
import com.tutorial.app.repo.EmployeeRepo;
import com.tutorial.app.response.EmployeeResponse;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    private final ModelMapper mapper;





    public EmployeeResponse addEmployee(EmployeeDto request){
        Employee employee = new Employee();
        employee.setType(request.getType());
        employee.setSex(request.getSex());
        employee.setLastName(request.getLastName());
        employee.setFirstName(request.getFirstName());
        employee.setDateCreated(new Date());
        employeeRepo.save(employee);



        return mapper.map(employee,EmployeeResponse.class);
    }

}
