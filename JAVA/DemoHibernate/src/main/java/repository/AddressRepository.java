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

import entity.Address;
import utils.HibernateUtils;

/**
 * This class is AddressRepository entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 26, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 26, 2020
 */
public class AddressRepository {
	
	private HibernateUtils hibernateUtils;

	public AddressRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<Address> getAllAddresss() {
		Session session = null;
		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Address> query = session.createQuery("FROM Address");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Address getAddressByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get Address by id
			Address Address = session.get(Address.class, id);

			return Address;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public Address getAddressByName(String name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Address> query = session.createQuery("FROM Address WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			Address Address = query.uniqueResult();

			return Address;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createAddress(Address Address) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(Address);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void updateAddress(short id, String newName) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get Address
			Address Address = (Address) session.load(Address.class, id);

			// update
			Address.setName(newName);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void updateAddress(Address Address) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(Address);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteAddress(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get Address
			Address Address = (Address) session.load(Address.class, id);

			// delete
			session.delete(Address);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isAddressExistsByID(short id) {

		// get Address
		Address Address = getAddressByID(id);

		// return result
		if (Address == null) {
			return false;
		}

		return true;
	}

	public boolean isAddressExistsByName(String name) {
		Address Address = getAddressByName(name);

		if (Address == null) {
			return false;
		}
		return true;
	}
}
