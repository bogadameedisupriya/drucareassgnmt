package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(value="prototype")
public class home {
	private String owner;
	private int doorNo;
	
	public home() {
		System.out.println("hello home");
	}
	public String getowner() {
		return owner;
	}
	public void setowner(String owner) {
		this.owner=owner;
	}
	public int getdoorNo() {
		return doorNo;
	}
	public void setgetdoorNo(int doorNo) {
		this.doorNo=doorNo;
	}
   public void internetconnection() {
		System.out.println("connect to internet");	
}
}
