package com.HMS.HotelManagementSystem.service;

import com.HMS.HotelManagementSystem.model.HMSLoginDetails;

public interface ServiceManager {
	
	public String addEntry();
	
	public HMSLoginDetails validateUser(String email, String pass);
}