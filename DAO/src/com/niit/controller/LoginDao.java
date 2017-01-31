package com.niit.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
	private Connection con=null;
	private static final String username="user1";
	private static final String password="user1";
	

	public LoginDao() throws SQLException,Exception
	{
	
		Class.forName("org.h2.Driver");
		con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test",username,password);
		
	}
	
	public ResultSet getData() throws Exception
	{
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Customer1");
		return rs;
	}


	

	}



