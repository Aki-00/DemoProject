package com.vti.entity;

import java.util.Date;

public class Group {
	private int groupId;
	private String groupName;
	private Account creator;
	private Date createDate;
	private Account[] accounts;
	private String[] userNames;
	
	
	public Group() {
	}
	
	
	public Group(String groupName, Account creator, Account[] accounts, Date createDate) {
		this.groupName = groupName;
		this.creator = creator;
		this.accounts = accounts;
		this.createDate = createDate;
	}
	
	public Group(String groupName, Account creator, String[] userNames, Date createDate) {
		this.groupName = groupName;
		this.creator = creator;
		this.userNames = userNames;
		this.createDate = createDate;
	}
}
