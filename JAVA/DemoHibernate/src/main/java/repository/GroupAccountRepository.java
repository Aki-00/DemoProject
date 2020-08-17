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

import entity.Account;
import entity.Group;
import entity.GroupAccount;
import utils.HibernateUtils;

/**
 * This class is GroupAccountRepository entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 26, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 26, 2020
 */
public class GroupAccountRepository {
	
	private HibernateUtils hibernateUtils;

	public GroupAccountRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<GroupAccount> getAllGroupAccounts() {
		Session session = null;
		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<GroupAccount> query = session.createQuery("FROM GroupAccount");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public GroupAccount getGroupAccountByID(short groupId, short accountId) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<GroupAccount> query = session.createQuery("FROM GroupAccount WHERE GroupID = :groupId AND AccountID = :accountId");
			// set parameter
			query.setParameter("groupId", groupId);
			query.setParameter("accountId", accountId);

			// get result
			GroupAccount groupAccount = query.uniqueResult();

			return groupAccount;


		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public GroupAccount getGroupAccountByName(String name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<GroupAccount> query = session.createQuery("FROM GroupAccount WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			GroupAccount GroupAccount = query.uniqueResult();

			return GroupAccount;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createGroupAccount(GroupAccount groupAccount) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(groupAccount);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	public void updateGroupAccount(short id, String newName) {
//
//		Session session = null;
//
//		try {
//
//			// get session
//			session = hibernateUtils.openSession();
//			session.beginTransaction();
//
//			// get GroupAccount
//			GroupAccount GroupAccount = (GroupAccount) session.load(GroupAccount.class, id);
//
//			// update
//			GroupAccount.setName(newName);
//
//			session.getTransaction().commit();
//
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}

	public void updateGroupAccount(GroupAccount GroupAccount) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(GroupAccount);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteGroupAccount(GroupAccount groupAccount) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// delete
			session.delete(groupAccount);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	public boolean isGroupAccountExistsByID(short id) {
//
//		// get GroupAccount
//		GroupAccount GroupAccount = getGroupAccountByID(id);
//
//		// return result
//		if (GroupAccount == null) {
//			return false;
//		}
//
//		return true;
//	}

	public boolean isGroupAccountExistsByName(String name) {
		GroupAccount GroupAccount = getGroupAccountByName(name);

		if (GroupAccount == null) {
			return false;
		}
		return true;
	}
}
