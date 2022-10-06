package com.bala.edate.repo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bala.edate.model.Interest;
@Repository
//@Qualifier("interest")
public interface InterestRepo extends JpaRepository<Interest, Integer> {

}
