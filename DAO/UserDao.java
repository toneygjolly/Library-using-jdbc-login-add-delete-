package com.training.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.pojo.*;
import com.training.connection.DataConnect;
//import com.training.service.Admin;

public class UserDao {
private Connection con;
private PreparedStatement stat;
Scanner sc;
private List<Admin>admincheck;


public UserDao()
{
	con=DataConnect.getConnection();
	sc=new Scanner(System.in);
	admincheck=new ArrayList<Admin>();
}
public void adminlogin(List<Admin>admincheck) throws SQLException
{
	System.out.println("ADMIN");
	stat=con.prepareStatement("insert into user values(?,?,?)");
	for(Admin a:admincheck)
	{
		stat.setInt(1,a.getAdmin_id());
		stat.setString(2,a.getAdmin_name());
		stat.setString(3,a.getAdmin_password());
	}
	int result=stat.executeUpdate();
	if(result>0)
	{
		System.out.println("Inserted suessfully");
	}
	else {
		System.out.println("invalid");
	}
	
}
}
