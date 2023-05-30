package com.HMS.HotelManagementSystem.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.HMS.HotelManagementSystem.model.HMSLoginDetails;
import com.HMS.HotelManagementSystem.model.UrlAcess;




@Service
@Transactional
public class ServiceManagerBean implements ServiceManager {
	
	
	@Autowired
	private EntityManager manager;

	public String addEntry() 
	{
		System.out.println("Inside dao manager");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		System.out.println("Test 1");
		Date date = new Date();  
		System.out.println("Test 2");
		System.out.println(formatter.format(date));  
		System.out.println("Test 3");
		UrlAcess url = new UrlAcess();
		url.setRequestSentTime(date);
		System.out.println("Test 3.1");
		manager.persist(url);
		System.out.println("Test 4");
		return "success";    
	}

	
	public HMSLoginDetails validateUser(String email, String pass) 
	{
		System.out.println("----- Inside validateUser -----");
		
		HMSLoginDetails loginDetails = null;
		Query query = manager.createQuery("select u from HMSLoginDetails u where u.loginId=:loginId and u.password=:pass");
		query.setParameter("loginId", email);
		query.setParameter("pass", pass);
		loginDetails = (HMSLoginDetails) query.getSingleResult();
		System.out.println("loginDetails : "+loginDetails);
		
		System.out.println("----- Exited validateUser -----");
		return loginDetails;
	}
}