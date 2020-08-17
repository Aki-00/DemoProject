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
import entity.Department;
import entity.DetailDepartment;
import repository.AddressRepository;
import repository.DepartmentRepository;
import repository.DetailDepartmentRepository;

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
public class DetailDepartmentTest {
	
	public static void main(String[] args) {
		DetailDepartmentRepository repository = new DetailDepartmentRepository();
		AddressRepository addressRepository = new AddressRepository();
		DepartmentRepository departmentRepository = new DepartmentRepository();
		
//		System.out.println("---Get all DetailDepartment----");
//		List<DetailDepartment> departments = repository.getAllDetailDepartments();
//		for (DetailDepartment department : departments) {
//			System.out.println(department);
//		}
		
		
//		System.out.println("---Get Department by id----");
//		Department department = repository.getDetailDepartmentByID((short) 5);
//		System.out.println(department);
		
//		System.out.println("---Get Department by name----");
//		Department department = repository.getDepartmentByName("Sale");
//		System.out.println(department);
//		
//		
//		System.out.println("---create Department");
//		DetailDepartment department = new DetailDepartment();
//		department.setAddress(new Address("P1000"));
//		department.setName("Waitting2");
//		department.setEmulationPoint((short)3);
//		repository.createDepartment(department);
//		System.out.println(department);
		
//		System.out.println("---update Department");
//		DetailDepartment department = repository.getDetailDepartmentByID((short) 13);
//		department.setName("Waiiting Test");
//		department.setAddress(addressRepository.getAddressByID((short)2));
//		repository.updateDepartment(department);
//		System.out.println(department);
		
		System.out.println("---delete Department");
		addressRepository.deleteAddress((short)1);
	}





}
