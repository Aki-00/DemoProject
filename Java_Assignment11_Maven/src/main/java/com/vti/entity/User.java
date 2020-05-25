package com.vti.entity;

public class User {
private int id;
private String username;
public int getId() {
	return id;
}

public String getUsername() {
	return username;
}

public User(int id, String username) {
	this.id = id;
	this.username = username;
}

@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + "]";
}



}
