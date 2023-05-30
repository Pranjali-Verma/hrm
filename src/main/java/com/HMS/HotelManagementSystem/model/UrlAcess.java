package com.HMS.HotelManagementSystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="url_access")
public class UrlAcess {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="request_sent_time")
	private Date requestSentTime;
	
	public UrlAcess() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside constructor of url access");
	}
	
	
	public UrlAcess(long id, Date requestSentTime) {
		super();
		this.id = id;
		this.requestSentTime = requestSentTime;
	}

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	public Date getRequestSentTime() {
		return requestSentTime;
	}
	public void setRequestSentTime(Date requestSentTime) {
		this.requestSentTime = requestSentTime;
	}
	@Override
	public String toString() {
		return "UrlAcess [id=" + id + ", requestSentTime=" + requestSentTime + "]";
	}
	
	
	
}
