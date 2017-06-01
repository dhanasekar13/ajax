package com.ds;


import org.codehaus.jackson.annotate.JsonProperty;

public class pojo {
	
	private String email;

	private String address;
	
	private String phone;
	
	private String name;
	
	public void setn(String name)
	{
		this.name=name;
	}
	public void seta(String address)
	{
		this.address=address;
	}
	public void setp(String phone)
	{
		this.phone=phone;
	}
	public void sete(String email)
	{
		this.email=email;
	}

@JsonProperty("name")
	public String getn()
	{
		return name;
	}

@JsonProperty("address")
	public String geta()
	{
		return address;
	}

@JsonProperty("phone")
	public String getp()
	{
		return phone;
	}

@JsonProperty("email")
	public String gete()
	{
		return email;
	}
	public String toString()
	{
		return "name:"+name+"address:"+address+"phoneno:"+phone+"email:"+email;
	}
}
