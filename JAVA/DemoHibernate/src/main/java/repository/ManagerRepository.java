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

import entity.Manager;
import entity.Manager;
import utils.HibernateUtils;

/**
 * This class is ManagerRepository entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 26, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 26, 2020
 */
public class ManagerRepository {
	
	private HibernateUtils hibernateUtils;

	public ManagerRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<Manager> getAllManagers() {
		Session session = null;
		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Manager> query = session.createQuery("FROM Manager");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Manager getManagerByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get Manager by id
			Manager manager = session.get(Manager.class, id);

			return manager;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public Manager getManagerByName(String name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Manager> query = session.createQuery("FROM Manager WHERE fullName = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			Manager manager = query.uniqueResult();

			return manager;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createManager(Manager manager) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(manager);

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
//			// get Manager
//			Manager Manager = (Manager) session.load(Manager.class, id);
//
//			// update
//			Manager.setName(newName);
//
//			session.getTransaction().commit();
//
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}

	public void updateManager(Manager manager) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(manager);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteManager(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get Manager
			Manager manager = (Manager) session.load(Manager.class, id);

			// delete
			session.delete(manager);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isManagerExistsByID(short id) {

		// get Manager
		Manager Manager = getManagerByID(id);

		// return result
		if (Manager == null) {
			return false;
		}

		return true;
	}

	public boolean isManagerExistsByName(String name) {
		Manager Manager = getManagerByName(name);

		if (Manager == null) {
			return false;
		}
		return true;
	}
}
