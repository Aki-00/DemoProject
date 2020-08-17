/**
 * 
 */
package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import entity.Employee;
import entity.Employee;
import utils.HibernateUtils;

/**
 * This class is EmployeeRepository entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 26, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 26, 2020
 */
public class EmployeeRepository {
	
	private HibernateUtils hibernateUtils;

	public EmployeeRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {
		Session session = null;
		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Employee> query = session.createQuery("FROM Employee");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Employee getEmployeeByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get Employee by id
			Employee employee = session.get(Employee.class, id);

			return employee;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public Employee getEmployeeByName(String name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Employee> query = session.createQuery("FROM Employee WHERE fullName = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			Employee employee = query.uniqueResult();

			return employee;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createEmployee(Employee employee) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(employee);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	public void updatelDepartment(short id, String newName) {
//
//		Session session = null;
//
//		try {
//
//			// get session
//			session = hibernateUtils.openSession();
//			session.beginTransaction();
//
//			// get Employee
//			Employee Employee = (Employee) session.load(Employee.class, id);
//
//			// update
//			Employee.setName(newName);
//
//			session.getTransaction().commit();
//
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}

	public void updateEmployee(Employee employee) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(employee);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteEmployee(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get Employee
			Employee employee = (Employee) session.load(Employee.class, id);

			// delete
			session.delete(employee);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isEmployeeExistsByID(short id) {

		// get Employee
		Employee employee = getEmployeeByID(id);

		// return result
		if (employee == null) {
			return false;
		}

		return true;
	}

	public boolean isEmployeeExistsByName(String name) {
		Employee employee = getEmployeeByName(name);

		if (employee == null) {
			return false;
		}
		return true;
	}
}
