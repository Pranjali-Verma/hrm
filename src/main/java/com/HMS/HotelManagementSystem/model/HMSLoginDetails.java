package com.HMS.HotelManagementSystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hms_login_details")
public class HMSLoginDetails {

	private String loginId;
	private String password;
	private String type;
	private Date createdDate;
	private String name;
	private int age;
	private String gender;
	private long mobileNo;
	private String emailId;
	private String address;
	
	public void setLoginId(String loginId)
	{
		this.loginId = loginId;
	}
	@Id
	@Column(name ="login_id",length = 30)
	public String getLoginId()
	{
		return loginId;
	}

	@Column(name ="password",length = 30)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name ="type", length = 5)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Column(name ="created_date",length = 30)
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name ="name",length = 30)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name ="age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(name ="gender",length = 10)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name ="mob_no",length = 10)
	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Column(name ="email_id",length = 30)
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name ="address",length = 500)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
