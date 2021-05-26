package com.examcommando.repo;

import com.examcommando.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {

    public User findByUsername (String usernme);
}
//interface ka object ni milta implementes cllases ka object miljega


