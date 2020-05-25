package com.vti.backend.businesslayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.User;

public class UserService implements IUserService {
	private IUserRepository repository;

	public UserService() {
		repository = new UserRepository();
	}

	public List<User> getListUsers() throws ClassNotFoundException, SQLException {
		// logic service
		return repository.getListUsers();
	}

	public List<User> getUserByID(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void createUser(String username) throws ClassNotFoundException, SQLException {
		repository.createUser(username);
		
	}

	public void updateAccountByID(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	public void deleteAccount(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	public boolean isAccountExists(String username) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAccountExists(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}
}
