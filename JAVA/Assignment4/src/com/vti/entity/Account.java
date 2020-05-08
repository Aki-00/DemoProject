package com.vti.entity;

import java.util.Date;

import com.vti.backend.Ex1;

public class Account {
	private int accountId;
	private String email;
	private String userName;
	private String fullName;
	private Position position;

	
	private Date createDate;
	private Date joinDate;
	
	public Account (){
		
	}
	
	public Account (int accountId, String email, String userName, String fullName){
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
	}
	
	public Account (int accountId, String email, String userName, String fullName, Position position){
    	this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.position = position;
		createDate = new Date();
	}
	
	public Account (int accountId, String email, String userName, String fullName, Position position,Date createDate){
    	this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.position = position;
		this.createDate = createDate;
	}
	
	public Account(String userName) {
		this.userName = Ex1.
	}
	
	public int getID() {
		return accountId;				
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	

	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position=position;
	}
	

	public Date getCreateDate() {
		return createDate;
	}

	public Date getJoinDate() {
		return joinDate;
	}
	
}


