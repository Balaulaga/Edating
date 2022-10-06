package com.bala.edate.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

import com.bala.edate.model.User_account;


@Repository
//@Qualifier("user_account")
public interface User_accountRepo extends JpaRepository<User_account, Integer>  {

	@Query("FROM User_account WHERE age=:age and city=:city and id!=:id")
	
	public List<User_account> findMatches(@Param("age")int age,@Param("city")String city,@Param("id")int id);
}
