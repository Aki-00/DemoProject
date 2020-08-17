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

import entity.Salary;
import entity.ennuminate.SalaryName;
import repository.SalaryRepository;

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
public class SalaryTest {
	
	public static void main(String[] args) {
		SalaryRepository repository = new SalaryRepository();
		
//		System.out.println("---Get all Salary----");
//		List<Salary> salarys = repository.getAllSalarys();
//		for (Salary salary : salarys) {
//			System.out.println(salary);
//		}
		
		
//		System.out.println("---Get Salary by id----");
//		Salary salary = repository.getSalaryByID((short) 2);
//		System.out.println(salary);
		
		System.out.println("---Get Salary by name----");
		Salary Salary = repository.getSalaryByName("Dev");
		System.out.println(Salary);
	
		
//		System.out.println("---create Salary");
//		Salary salary = new Salary();
//		salary.setName(SalaryName.PM);
//		repository.createSalary(salary);
//		System.out.println(salary);
		
//		System.out.println("---update Salary");
//		repository.updateSalary((short)2, "Test");
	}





}
