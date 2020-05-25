package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.DepartmentDao;
import com.vti.entity.Department;

public class Ex3_CRUDDemo {
public static void main(String[] args) throws Exception {
	DepartmentDao dao = new DepartmentDao();
	dao.getDepartments();
	
	//Q1. Get department
//	List<Department> departments = DepartmentDao.getDepartment();
//	for (Department department : departments) {
//		System.out.println(department);
//	}
	
//	//Q3. Get department by id
//	List<Department> departments1 = DepartmentDao.getDepartmentByID();
//	for (Department department : departments1) {
//		System.out.println(department);
//	}
	
//	//Q4.Check data exist
//	System.out.println(DepartmentDao.isDepartmentNameExists("Sale"));
	
//	//Q5. Create department
//	DepartmentDao.createDepartment("d020", "Purchase");
//	
//	//Q6.
//	DepartmentDao.updateDepartment("d030", "AAA");
	
//	//Q7.
//	DepartmentDao.deleteDepartment("d001");
	
//	//Ex4. Procedure
//	DepartmentDao.deleteDepartmentUsingProcedure("d002");
	
	//Ex5. Transaction
	dao.deleteDepartmentTransaction("d003");
}
}
