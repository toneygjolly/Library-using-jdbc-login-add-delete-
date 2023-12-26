package com.training.client;

import java.util.Scanner;

import com.training.DAO.UserDao;

public class mainswitch {
Scanner sc;
public mainswitch()
{
	sc=new Scanner(System.in);
}
public void Switch()
{
String choice="Y";
while(choice.equals("Y"))
{
	System.out.println("1.Admin");
	System.out.println("2.EXIT");
	int ch=sc.nextInt();
	UserDao mm=new UserDao();
	
}
}
}
