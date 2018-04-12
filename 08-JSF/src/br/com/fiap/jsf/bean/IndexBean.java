package br.com.fiap.jsf.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class IndexBean 
{
	private String name;
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}

	public void register()
	{
		System.out.println(name);
	}
}
