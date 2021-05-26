package com.examcommando.service;

import com.examcommando.model.User;
import com.examcommando.model.UserRole;

import java.util.Set;

public interface UserService {

    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    public User getUser(String username);  //get user
    public User updateUser(String username);  // update user
    public Void deleteUser(Long userId);    //delete user

}
