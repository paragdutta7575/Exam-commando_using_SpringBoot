package com.examcommando.service.implementation;

import com.examcommando.model.User;
import com.examcommando.model.UserRole;
import com.examcommando.repo.RoleRepository;
import com.examcommando.repo.UsersRepository;
import com.examcommando.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {



       User local = this.usersRepository.findByUsername(user.getUsername());
       if(local!=null)
       {
           System.out.println("User is already there");
           throw new Exception("User already present");
       }else
       {
           //user create
           for (UserRole ur:userRoles)
           {
               roleRepository.save(ur.getRole());
           }

           //user role ki relation apne aap save hojegi
           user.getUserRoles().addAll(userRoles);
           local = this.usersRepository.save(user);
       }

        return local;
    }

    //getting user by username
    @Override
    public User getUser(String username) {
        return this.usersRepository.findByUsername((username));
    }

    //updating user
    @Override
    public User updateUser(String username) {
        return this.usersRepository.findByUsername((username));
   }

   //deleting user
    @Override
    public Void deleteUser(Long userId) {

        this.usersRepository.deleteById(userId);
        return null;
    }
}
