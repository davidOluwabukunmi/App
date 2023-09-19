package com.tutorial.app.response;

import lombok.Data;

import java.util.Date;

@Data
public class UserResponse {
    private String firstName;
    private String lastName;
    private String sex;
    private String type;
    private Long id;
    private Date dateCreated;
}
