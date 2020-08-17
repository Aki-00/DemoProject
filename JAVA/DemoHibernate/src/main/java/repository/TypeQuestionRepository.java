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

import entity.TypeQuestion;
import entity.ennuminate.TypeName;
import utils.HibernateUtils;

/**
 * This class is TypeQuestionRepository entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 26, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 26, 2020
 */
public class TypeQuestionRepository {
	
	private HibernateUtils hibernateUtils;

	public TypeQuestionRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<TypeQuestion> getAllTypeQuestions() {
		Session session = null;
		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<TypeQuestion> query = session.createQuery("FROM TypeQuestion");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public TypeQuestion getTypeQuestionByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get TypeQuestion by id
			TypeQuestion TypeQuestion = session.get(TypeQuestion.class, id);

			return TypeQuestion;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public List<TypeQuestion> getTypeQuestionByName(TypeName name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			
			Query<TypeQuestion> query = session.createQuery("FROM TypeQuestion WHERE TypeName = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createTypeQuestion(TypeQuestion TypeQuestion) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(TypeQuestion);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	public void updateTypeQuestion(short id, TypeQuestionName newName) {
//
//		Session session = null;
//
//		try {
//
//			// get session
//			session = hibernateUtils.openSession();
//			session.beginTransaction();
//
//			// get TypeQuestion
//			TypeQuestion TypeQuestion = (TypeQuestion) session.load(TypeQuestion.class, id);
//
//			// update
//			TypeQuestion.setName(newName);
//
//			session.getTransaction().commit();
//
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}

	public void updateTypeQuestion(TypeQuestion TypeQuestion) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(TypeQuestion);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteTypeQuestion(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get TypeQuestion
			TypeQuestion TypeQuestion = (TypeQuestion) session.load(TypeQuestion.class, id);

			// delete
			session.delete(TypeQuestion);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isTypeQuestionExistsByID(short id) {

		// get TypeQuestion
		TypeQuestion TypeQuestion = getTypeQuestionByID(id);

		// return result
		if (TypeQuestion == null) {
			return false;
		}

		return true;
	}

//	public boolean isTypeQuestionExistsByName(String name) {
//		TypeQuestion TypeQuestion = getTypeQuestionByName(name);
//
//		if (TypeQuestion == null) {
//			return false;
//		}
//		return true;
//	}
}
