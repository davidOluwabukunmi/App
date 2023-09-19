package com.tutorial.app.service;

import com.tutorial.app.dto.UserDto;
import com.tutorial.app.exception.BadRequestException;
import com.tutorial.app.model.Users;
import com.tutorial.app.repo.UserRepo;
import com.tutorial.app.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UserRepo userRepo;
    private final ModelMapper mapper;
    public UserResponse addUser(UserDto request){
//        Users users = Users.builder()
//                .sex(request.getSex())
//                .type(request.getType())
//                .build();
        Users users = new Users();
        users.setType(request.getType());
        users.setSex(request.getSex());
        users.setLastName(request.getLastName());
        users.setFirstName(request.getFirstName());
        users.setDateCreated(new Date());
        userRepo.save(users);
        return mapper.map(users,UserResponse.class);
    }
    public UserResponse updateUser(Long id, UserDto request){
        Optional<Users> usersOptional = userRepo.findById(id);
        if(usersOptional.isEmpty()){
            throw new BadRequestException("User not found");
        }else{
            Users users = usersOptional.get();
            users.setType(request.getType());
            users.setSex(request.getSex());
            users.setLastName(request.getLastName());
            users.setFirstName(request.getFirstName());
            users.setDateCreated(new Date());
            userRepo.save(users);
            return mapper.map(users,UserResponse.class);
        }
    }
    public List<Users> getUser(){
        List<Users> users = userRepo.findAll();
         return users;
    }
    public String deleteUser(Long id){
        Optional<Users> usersOptional = userRepo.findById(id);
        if(usersOptional.isEmpty()){
            return "User not found";
        }else{
            Users users = usersOptional.get();
           userRepo.delete(users);
            return "Record successfully deleted";
        }
    }

}
