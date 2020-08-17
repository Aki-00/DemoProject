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

import entity.Department;
import repository.DepartmentRepository;

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
public class DepartmentTest {
	
	public static void main(String[] args) {
		DepartmentRepository repository = new DepartmentRepository();
		
//		System.out.println("---Get all Department----");
//		List<Department> departments = repository.getAllDepartments();
//		for (Department department : departments) {
//			System.out.println(department);
//		}
		
		
//		System.out.println("---Get Department by id----");
//		Department department = repository.getDepartmentByID((short) 5);
//		System.out.println(department);
		
//		System.out.println("---Get Department by name----");
//		Department department = repository.getDepartmentByName("Sale");
//		System.out.println(department);
//		
		
//		System.out.println("---create Department");
//		Department department = new Department();
//		department.setName("Waiting");
//		repository.createDepartment(department);
//		System.out.println(department);
		
		System.out.println("---update Department");
		repository.updateDepartment((short)2, "Test");
	}





}
