package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

public interface IUserRepository {
	public List<User> getListUsers() throws ClassNotFoundException,
	SQLException;
	
	public List<User> getUserByID(int id) throws ClassNotFoundException,
	SQLException;
	
	void createUser(String username) throws ClassNotFoundException,
	SQLException, Exception;
	
	public void updateAccountByID(int id) throws ClassNotFoundException,
	SQLException;
	
	public void deleteAccount(int id) throws ClassNotFoundException,
	SQLException;
	
	public boolean isAccountExists(String username) throws ClassNotFoundException,
	SQLException;
	
	public boolean isAccountExists(int id) throws ClassNotFoundException,
	SQLException;
	
}
