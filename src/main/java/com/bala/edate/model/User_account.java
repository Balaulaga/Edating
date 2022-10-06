package com.bala.edate.model;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.annotation.Generated;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

//import org.hibernate.annotations.Cascade;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user_account")
public class User_account {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Column(name="user_name")
	private String user_name;
	@Column(name="password")
	private String password;
	@Column(name="age")
	private int age;
	@Column(name="email")
	private String email;
	//@Column(name="gender")
	//private String gender;
	@Column(name="phone_number")
	private String phoneNumber;
	@Column(name="city")
	private String city;
	@Column(name="country")
	private String country;
	@OneToOne( mappedBy = "user_account")
	
	private Interest interest;
}
