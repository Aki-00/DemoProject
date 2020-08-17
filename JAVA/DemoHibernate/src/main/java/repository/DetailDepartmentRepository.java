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

import entity.DetailDepartment;
import utils.HibernateUtils;

/**
 * This class is DetailDepartmentRepository entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 26, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 26, 2020
 */
public class DetailDepartmentRepository {
	
	private HibernateUtils hibernateUtils;

	public DetailDepartmentRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<DetailDepartment> getAllDetailDepartments() {
		Session session = null;
		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<DetailDepartment> query = session.createQuery("FROM DetailDepartment");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public DetailDepartment getDetailDepartmentByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get DetailDepartment by id
			DetailDepartment detailDepartment = session.get(DetailDepartment.class, id);

			return detailDepartment;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public DetailDepartment getDetailDepartmentByName(String name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<DetailDepartment> query = session.createQuery("FROM DetailDepartment WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			DetailDepartment detailDepartment = query.uniqueResult();

			return detailDepartment;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createDepartment(DetailDepartment department) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(department);

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
//			// get DetailDepartment
//			DetailDepartment DetailDepartment = (DetailDepartment) session.load(DetailDepartment.class, id);
//
//			// update
//			DetailDepartment.setName(newName);
//
//			session.getTransaction().commit();
//
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}

	public void updateDepartment(DetailDepartment department) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(department);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteDetailDepartment(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get DetailDepartment
			DetailDepartment DetailDepartment = (DetailDepartment) session.load(DetailDepartment.class, id);

			// delete
			session.delete(DetailDepartment);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isDetailDepartmentExistsByID(short id) {

		// get DetailDepartment
		DetailDepartment DetailDepartment = getDetailDepartmentByID(id);

		// return result
		if (DetailDepartment == null) {
			return false;
		}

		return true;
	}

	public boolean isDetailDepartmentExistsByName(String name) {
		DetailDepartment DetailDepartment = getDetailDepartmentByName(name);

		if (DetailDepartment == null) {
			return false;
		}
		return true;
	}
}
