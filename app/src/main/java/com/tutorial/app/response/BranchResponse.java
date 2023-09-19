package com.tutorial.app.response;

import lombok.Data;

import java.util.Date;

@Data
public class BranchResponse {
    private String branchName;
    private String location;
    private String product;
    private int truckNumber;
    private Long id;
    private Date dateCreated;
}
