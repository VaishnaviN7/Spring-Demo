package com.niit.model;




public class Login {

	// two instance variables

	private String name1, password1;

	public String getName() {
		return name1;
	}

	public void setName(String name1) {
		this.name1 = name1;
	}

	public String getPassword() {
		return password1;
	}

	public void setPassword(String password1) {
		this.password1 = password1;
	}

	// business logic

/*
	public boolean checkInput() throws SQLException, Exception {

		LoginDao loginDAO=new LoginDao();
		ResultSet rs=loginDAO.getData();
		int flag=0;
		
		while(rs.next())
		{
			if(name1.equals(rs.getString(1)) && password1.equals(rs.getString(2)))
			{
				flag=1;
				break;
			}
		}
		
	
		if(flag==1)
			
		{
			return true;
		}
		else 
			return false;
		

	}*/

}
