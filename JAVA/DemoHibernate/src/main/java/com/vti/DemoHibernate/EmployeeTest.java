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
import entity.Employee;
import entity.Employee;
import repository.AccountRepository;
import repository.AddressRepository;
import repository.EmployeeRepository;
import repository.EmployeeRepository;

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
public class EmployeeTest {
	
	public static void main(String[] args) {
		EmployeeRepository repository = new EmployeeRepository();
		AccountRepository accountRepository = new AccountRepository();

//		System.out.println("---Get all Employee----");
//		List<Employee> employees = repository.getAllEmployees();
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
		
		
//		System.out.println("---Get Employee by id----");
//		Employee employee = repository.getEmployeeByID((short) 5);
//		System.out.println(employee);
		
//		System.out.println("---Get Employee by name----");
//		Employee employee = repository.getEmployeeByName("Sale");
//		System.out.println(employee);
//		
//		
//		System.out.println("---create Employee");
//		Employee employee = (Employee) accountRepository.getAccountByName("Dang NguyenHai");
//		employee.setWorkingNumberOfYear((short) 2);
//		System.out.println(employee);
		
		System.out.println("---update Employee");
		Employee employee = (Employee) accountRepository.getAccountByID((short)1);
		employee.setFirstName("Testing");
		repository.updateEmployee(employee);
		System.out.println(employee);
		
//		System.out.println("---delete Employee");
//		repository.deleteEmployee((short)1);
	}





}
