package com.cntmgr.contactmanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cntmgr.contactmanager.entities.User;


public interface UserRepo extends JpaRepository<User,Integer>{
    public void findById(int id);

    @Query("select u from User u where u.email = :email")
    public User getUserByUserName(@Param("email") String email);
}
