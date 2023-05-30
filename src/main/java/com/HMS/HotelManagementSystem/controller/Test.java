package com.HMS.HotelManagementSystem.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Test {

	private static String getEncryptedPwd(String pwd){		
		
		System.out.println("Inside getEncryptedPwd ::");
		String encryptedPwd = "";		
		byte pwdBytes[] = pwd.getBytes();		
		try{
			
			MessageDigest algorithm = MessageDigest.getInstance("MD5");
			algorithm.reset();
			algorithm.update(pwdBytes);
			byte messageDigest[] = algorithm.digest();
			StringBuffer hexString = new StringBuffer();
			
			for(int i = 0 ; i < messageDigest.length ; i++){
				String hex = Integer.toHexString(0xFF & messageDigest[i]);
				if(hex.length() == 1){
					hexString.append(0);
					}
				hexString.append(hex);				
			}			
			encryptedPwd = hexString.toString();
		}
		catch(NoSuchAlgorithmException nse){
			System.out.println(nse.getLocalizedMessage());
			}
		 
		System.out.println("Returning from getEncryptedPwd ::");
		return encryptedPwd;
	}
	
	public static void main(String[] args) {
		
		System.out.println("start");
		String res = getEncryptedPwd("Pranjali");
		System.out.println("encrypt is "+res);
	}

	
	
}
