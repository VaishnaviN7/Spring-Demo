package com.niit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		String name, password;

		name = request.getParameter("uname");

		password = request.getParameter("password");
		
		
		try {
			LoginDao loginDAO=new LoginDao();
			
			ResultSet rs=loginDAO.getData();
			int flag=0;
			
			
			while(rs.next())
			{
				if(name.equalsIgnoreCase(rs.getString(2)) && password.equals(rs.getString(3)))
				{
					System.out.println(rs.getString(2)+ " " +rs.getString(3));
					flag=1;
					break;
				}
				
			}
			
			if(flag==1)
			{
			out.println("success");
			}
			else 
				
				out.println("failure");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	
	}




}
