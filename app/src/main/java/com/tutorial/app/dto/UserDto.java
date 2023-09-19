package com.tutorial.app.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import java.util.Date;

@Data
@Builder
public class UserDto {
    private String firstName;
    private String lastName;
    private String sex;
    private String type;
}
