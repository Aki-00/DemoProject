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

import entity.Address;
import repository.AddressRepository;

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
public class AddressTest {
	
	public static void main(String[] args) {
		AddressRepository repository = new AddressRepository();
		
//		System.out.println("---Get all Address----");
//		List<Address> addresss = repository.getAllAddresss();
//		for (Address address : addresss) {
//			System.out.println(address);
//		}
		
		
//		System.out.println("---Get Address by id----");
//		Address Address = repository.getAddressByID((short) 5);
//		System.out.println(Address);
		
//		System.out.println("---Get Address by name----");
//		Address Address = repository.getAddressByName("Sale");
//		System.out.println(Address);
//		
		
		System.out.println("---create Address");
		Address Address = new Address();
		Address.setName("Waiting");
		repository.createAddress(Address);
		System.out.println(Address);
		
//		System.out.println("---update Address");
//		repository.updateAddress((short)2, "Test");
	}





}
