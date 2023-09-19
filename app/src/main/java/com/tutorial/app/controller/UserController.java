package com.tutorial.app.controller;

import com.tutorial.app.dto.UserDto;
import com.tutorial.app.model.Users;
import com.tutorial.app.response.UserResponse;
import com.tutorial.app.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company/")
@RequiredArgsConstructor

public class UserController {
    private final UsersService usersService;

    @PostMapping("add")
    public UserResponse addUser(@RequestBody UserDto request){
        return usersService.addUser(request);
    }


    @PutMapping("update")
    public UserResponse updateUser(@RequestBody UserDto request, @RequestParam("id")Long id){
        return usersService.updateUser(id, request);
    }
    @GetMapping("get")
    public List<Users> getUser(){
        return usersService.getUser();
    }

    @DeleteMapping("delete")
    public String deleteUser(@RequestParam("id")Long id){
        return usersService.deleteUser(id);
    }
}
