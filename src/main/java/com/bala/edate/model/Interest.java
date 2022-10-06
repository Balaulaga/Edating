package com.bala.edate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="interest")
public class Interest {

	@Id

	private int id;
	@Column(name="likes")
	private String likes;
	@Column(name="dislikes")
	private String dislikes;
	@Column(name="hobbies")
	private String hobbies;
	@Column(name="profile_url")
	private String profile_url;
	@Column(name="about")
	private String about;
	@Transient
	private int userAccountId;
	@OneToOne
	@JoinColumn(name="user_id")
	@JsonIgnore
	private User_account user_account;
}
