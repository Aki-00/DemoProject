/**
 * 
 */
package com.vti.DemoHibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mysql.cj.xdevapi.SessionFactory;

import entity.Account;
import entity.Group;
import entity.GroupAccount;
import repository.AccountRepository;
import repository.GroupAccountRepository;
import repository.GroupRepository;

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
public class GroupTest {
	
	public static void main(String[] args) {
		GroupRepository repository = new GroupRepository();
		AccountRepository accountRepository = new AccountRepository();
		GroupAccountRepository groupAccountRepository = new GroupAccountRepository();
		
		
//		System.out.println("---Get all Group----");
//		List<Group> groups = repository.getAllGroups();
//		for (Group group : groups) {
//			System.out.println(group);
//		}
		
		
//		System.out.println("---Get Group by id----");
//		Group group = repository.getGroupByID((short) 1);
//		System.out.println(group.getAccounts());
		
		
//		System.out.println("---Get Group by name----");
//		Group Group = repository.getGroupByName("Testing System");
//		System.out.println(Group);
//		
		
//		System.out.println("---create Group");
//		Group group = new Group();
//		group.setName("Waitting");
//		group.setCreator(accountRepository.getAccountByID((short)1));
//		repository.createGroup(group);	
//		GroupAccount groupAccount = new GroupAccount(group.getId(), (short) 9) ;
//		groupAccountRepository.createGroupAccount(groupAccount);
// 		System.out.println(group);
		
//		System.out.println("---update Group");
//		repository.updateGroup((short)11, "Test");
		
		
		System.out.println("---delete GroupAccount");
		GroupAccount groupAccount = groupAccountRepository.getGroupAccountByID((short)11, (short)10);
		System.out.println(groupAccount);
		groupAccountRepository.deleteGroupAccount(groupAccount);
	}





}
