package com.ds;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class db {
@PrimaryKey
@Persistent
private String email;
@Persistent
private String name;
@Persistent
private String address;
@Persistent
private String phone;

public db(String name,String address,String phone,String email)
{
	this.name=name;
	this.address=address ;
	this.phone=phone;
	this.email=email;
}

public void setname(String name)
{
	this.name=name;
}
@Override
public String toString() {
	return "db [email=" + email + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
}

public void setaddress(String address)
{
	this.address=address;
}
public void setphone(String phone)
{
	this.phone=phone;
}
public void setemail(String email)
{
	this.email=email;
}
public String getName()
{
	return name;
}
public String getaddress()
{
	return address;
}
public String getphone()
{
	return phone;
}
public String getemail()
{
	return email;
}

}
