/**
 * 
 */
package com.vti.DemoHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mysql.cj.xdevapi.SessionFactory;

import entity.Account;
import repository.AccountRepository;

/**
 * This class is TestHibernate entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 23, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 23, 2020
 */
public class AccountTest {
	
	public static void main(String[] args) {
		AccountRepository repository = new AccountRepository();
		
//		System.out.println("---Get all Account----");
//		List<Account> accounts = repository.getAllAccounts();
//		for (Account account : accounts) {
//			System.out.println(account);
//		}
		
//		
//		System.out.println("---Get Account by id----");
//		Account account = repository.getAccountByID((short) 5);
//		System.out.println(account);
		
		System.out.println("---Get Account by name----");
		Account account = repository.getAccountByName("Thang Nguyen Chien");
		System.out.println(account);
		
		
//		System.out.println("---create Account");
//		Account Account = new Account();
//		Account.setName("Waiting");
//		repository.createAccount(Account);
//		System.out.println(Account);
		
//		System.out.println("---update Account");
//		repository.updateAccount((short)2, "Test");
	}





}
