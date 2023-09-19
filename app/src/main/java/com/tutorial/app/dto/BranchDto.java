package com.tutorial.app.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BranchDto {
    private String branchName;
    private String location;
    private String product;
    private int truckNumber;
}
