package com.HMS.HotelManagementSystem.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.HMS.HotelManagementSystem.model.HMSLoginDetails;
import com.HMS.HotelManagementSystem.service.ServiceManager;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private ServiceManager serviceMgr;

	//@ResponseBody
	@GetMapping("/")
	public String homePage()
	{
		System.out.println("Inside home page");
		String result = serviceMgr.addEntry();
		return "/index";
	}
	
			@GetMapping("/login")
	public String login()
	{
		System.out.println("Inside login page");
		//String result = serviceMgr.addEntry();
		return "/login";
	}
		
	@PostMapping("/login")
	public String processLoginForm(@RequestParam String loginId, 
			@RequestParam(name = "password") String password, Model map,HttpSession session)
	{
		System.out.println("***** Inside processLoginForm *****");
		try {
			
		System.out.println("loginId: "+loginId+" pass: "+password);
		HMSLoginDetails user = serviceMgr.validateUser(loginId,password);
		System.out.println("user obtained is "+user.getMobileNo());
		session.setAttribute("user_details", user);
		System.out.println("***** Exited processLoginForm *****");
		}catch (Exception e) {
			System.out.println("***** Inside catch block *****");
			map.addAttribute("message","Invalid Login !!! Retry again");
			e.printStackTrace();
			return "/login";
		}
		return "/home";
	}
	
private String getEncryptedPwd(String pwd){		
		
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
				if(hex.length() == 1){hexString.append(0);}
				hexString.append(hex);				
			}			
			encryptedPwd = hexString.toString();
		}
		catch(NoSuchAlgorithmException nse){
			System.out.println(nse.getLocalizedMessage());}
		 
		System.out.println("Returning from getEncryptedPwd ::");
		return encryptedPwd;
	}
			
}