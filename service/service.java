package com.training.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Admin;
import com.training.DAO.UserDao;

public class service {
Scanner sc;
private List<Admin>admincheck;
private UserDao userDAO;
public service()
{
	
	sc=new Scanner(System.in);
	admincheck=new ArrayList<Admin>();
}

//Admin
public void Admin()
{
	System.out.println("enter the number of user want to add");
	int no=sc.nextInt();
	for(int i=0;i<no;i++) {
		UserDao user=new UserDao(); 
		Admin admin=new Admin();
	
	System.out.println("Enter the admin id");
	admin.setAdmin_id(sc.nextInt());
	System.out.println("Enter the admin name");
	admin.setAdmin_name(sc.next());
	System.out.println("Enter the password");
	admin.setAdmin_password(sc.next());
	admincheck.add(admin);
}
	//userDAO.Admin(admincheck);
}
}
