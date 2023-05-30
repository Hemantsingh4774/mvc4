package com.example.mvc4.mvcmodel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// for performing crud operations

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

}
