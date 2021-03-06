package com.springbootcrud.SpringBootCRUDMySQl.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springbootcrud.SpringBootCRUDMySQl.model.User_Account;
import com.springbootcrud.SpringBootCRUDMySQl.model.UserRepository;

@Service
@Transactional
public class UserService {
	 @Autowired
	    private UserRepository repo;
	     
	    public List<User_Account> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(User_Account user) {
	        repo.save(user);
	    }
	     
	    public User_Account get(Integer id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(Integer id) {
	        repo.deleteById(id);
	    }

}
