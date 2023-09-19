package com.tutorial.app.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDto {
    private String firstName;
    private String lastName;
    private String sex;
    private String type;
}
