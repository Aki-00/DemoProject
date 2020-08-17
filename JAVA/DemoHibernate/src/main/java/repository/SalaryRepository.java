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

import entity.Salary;
import entity.ennuminate.SalaryName;
import utils.HibernateUtils;

/**
 * This class is SalaryRepository entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 26, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 26, 2020
 */
public class SalaryRepository {
	
	private HibernateUtils hibernateUtils;

	public SalaryRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<Salary> getAllSalarys() {
		Session session = null;
		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Salary> query = session.createQuery("FROM Salary");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Salary getSalaryByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get Salary by id
			Salary Salary = session.get(Salary.class, id);

			return Salary;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public Salary getSalaryByName(String name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Salary> query = session.createQuery("FROM Salary WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			Salary Salary = query.uniqueResult();

			return Salary;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createSalary(Salary Salary) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(Salary);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void updateSalary(short id, SalaryName newName) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get Salary
			Salary Salary = (Salary) session.load(Salary.class, id);

			// update
			Salary.setName(newName);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void updateSalary(Salary Salary) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(Salary);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteSalary(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get Salary
			Salary Salary = (Salary) session.load(Salary.class, id);

			// delete
			session.delete(Salary);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isSalaryExistsByID(short id) {

		// get Salary
		Salary Salary = getSalaryByID(id);

		// return result
		if (Salary == null) {
			return false;
		}

		return true;
	}

	public boolean isSalaryExistsByName(String name) {
		Salary Salary = getSalaryByName(name);

		if (Salary == null) {
			return false;
		}
		return true;
	}
}
