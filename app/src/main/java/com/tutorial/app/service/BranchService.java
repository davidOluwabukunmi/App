package com.tutorial.app.service;

import com.tutorial.app.dto.BranchDto;
import com.tutorial.app.model.Branch;
import com.tutorial.app.repo.BranchRepo;
import com.tutorial.app.response.BranchResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.Basic;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class BranchService {
    private final BranchRepo branchRepo;
    private final ModelMapper mapper;

    public  BranchResponse addBranch(BranchDto request){
        Branch branch = new Branch();
        branch.setBranchName(request.getBranchName());
        branch.setLocation(request.getLocation());
        branch.setProduct(request.getProduct());
        branch.setTruckNumber(request.getTruckNumber());
        branch.setDateCreated(new Date());
        branchRepo.save(branch);
        return mapper.map(branch,BranchResponse.class);

    }
}
