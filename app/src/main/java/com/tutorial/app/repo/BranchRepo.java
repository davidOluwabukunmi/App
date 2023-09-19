package com.tutorial.app.repo;

import com.tutorial.app.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BranchRepo extends JpaRepository<Branch, Long> {

}
