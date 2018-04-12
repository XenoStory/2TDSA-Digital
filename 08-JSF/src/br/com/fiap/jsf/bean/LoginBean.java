package br.com.fiap.jsf.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean 
{
	String login;
	String password;
	
	public String getLogin() 
	{
		return login;
	}
	public void setLogin(String login) 
	{
		this.login = login;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public void login()
	{
		if(login.toUpperCase().equals("FIAP") && password.equals("FIAP2018")) 
		{
			System.out.println("Logged succesfully!");
		}
		else
		{
			System.out.println("Login or password doesn't exist.");
		}
	}
	
	
}
