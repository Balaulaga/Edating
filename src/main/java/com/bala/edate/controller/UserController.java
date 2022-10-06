package com.bala.edate.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bala.edate.model.Interest;
import com.bala.edate.model.User_account;
import com.bala.edate.repo.InterestRepo;
import com.bala.edate.repo.User_accountRepo;

@RestController
//@EnableJpaRepositories
//@ComponentScan(basePackages= {"com.bala.edate.repo"})
//@EnableJpaRepositories

@RequestMapping("/api")
public class UserController {

	@Autowired
	private User_accountRepo repo;

	@Autowired
	private InterestRepo inRepo;

	@PostMapping("/user")
	public User_account upadate(@RequestBody User_account user) {
		User_account account = repo.save(user);

		return account;
	}

	@PostMapping("/interest")
	public Interest update(@RequestBody Interest interest) {
		User_account account = repo.findById(interest.getUserAccountId()).get();
		interest.setUser_account(account);
		return inRepo.save(interest);
	}

	@GetMapping("/get")
	public List<User_account> getAll() {
		 List<User_account> findAll = repo.findAll();
		return findAll;
	}

	@GetMapping("/findmatches/{id}")
	public List<User_account> findMatches(@PathVariable("id") int id) {
		User_account account = repo.findById(id).get();

		return repo.findMatches(account.getAge(), account.getCity(), account.getId());

	}
}
