package com.examcommando.controller;

import com.examcommando.model.Role;
import com.examcommando.model.User;
import com.examcommando.model.UserRole;
import com.examcommando.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")    //is api access krne ke liye ye/user likhna padhega
public class UserController {

    @Autowired
    private UserService userService;

    //creating user
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {


     Set<UserRole> roles = new HashSet<>();

     Role role = new Role();
     role.setRoleId(45L);
     role.setRoleName("NORMAL");

     UserRole userRole = new UserRole();
     userRole.setUser(user);
     userRole.setRole(role);


     roles.add(userRole);


    return  this.userService.createUser(user,roles);

    }
    //get user
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username)
    {
            return this.userService.getUser(username);
    }

    //update user
    @PutMapping("/{username}")
    public User updateUser(@PathVariable("username") String username){
        return this.userService.updateUser(username);
    }

    //delete user
    @DeleteMapping("/{userId}")
    public Void deleteUser(@PathVariable("userId")Long userId){
        return this.userService.deleteUser(userId);
    }
}
