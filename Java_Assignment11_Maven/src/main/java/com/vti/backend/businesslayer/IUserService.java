package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

public interface IUserService {
	public List<User> getListUsers() throws ClassNotFoundException,
	SQLException;
	
	public List<User> getUserByID(int id) throws ClassNotFoundException,
	SQLException;
	
	public void createUser(String username) throws ClassNotFoundException,
	SQLException;
	
	public void updateAccountByID(int id) throws ClassNotFoundException,
	SQLException;
	
	public void deleteAccount(int id) throws ClassNotFoundException,
	SQLException;
	
	public boolean isAccountExists(String username) throws ClassNotFoundException,
	SQLException;
	
	public boolean isAccountExists(int id) throws ClassNotFoundException,
	SQLException;
}
