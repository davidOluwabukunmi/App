package com.tutorial.app.repo;

import com.tutorial.app.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface UserRepo extends JpaRepository<Users, Long> {

}
