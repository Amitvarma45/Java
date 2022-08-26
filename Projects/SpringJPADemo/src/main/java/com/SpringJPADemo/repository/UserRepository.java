package com.SpringJPADemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringJPADemo.entity.User;


// User repository using jparepository
public interface UserRepository extends JpaRepository<User, Integer>{

}
