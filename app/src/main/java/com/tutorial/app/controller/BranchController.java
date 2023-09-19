package com.tutorial.app.controller;

import com.tutorial.app.dto.BranchDto;
import com.tutorial.app.response.BranchResponse;
import com.tutorial.app.service.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company/")
@RequiredArgsConstructor
public class BranchController {
    private final BranchService branchService;

    @PostMapping("branch")
    public BranchResponse addBranch(@RequestBody BranchDto request){
        return branchService.addBranch(request);

    }


}
