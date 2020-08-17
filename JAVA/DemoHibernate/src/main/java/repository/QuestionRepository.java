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

import entity.Question;
import entity.TypeQuestion;
import entity.ennuminate.TypeName;
import utils.HibernateUtils;

/**
 * This class is QuestionRepository entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 26, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 26, 2020
 */
public class QuestionRepository {
	
	private HibernateUtils hibernateUtils;

	public QuestionRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<Question> getAllQuestions() {
		Session session = null;
		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Question> query = session.createQuery("FROM Question");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Question getQuestionByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get Question by id
			Question Question = session.get(Question.class, id);

			return Question;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public Question getQuestionByCreator(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Question> query = session.createQuery("FROM Question WHERE CreatorID = :creatorId");

			// set parameter
			query.setParameter("creatorId", id);

			// get result
			Question question = query.uniqueResult();

			return question;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Question> getQuestionByType(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Question> query = session.createQuery("FROM Question WHERE TypeID = :typeId");

			// set parameter
			query.setParameter("typeId", id);

			// get result
			List<Question> questions = query.list();

			return questions;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
//	@SuppressWarnings("unchecked")
//	public List<Question> getQuestionByTypeName(TypeName name) {
//
//		Session session = null;
//
//		try {
//
//			// get session
//			session = hibernateUtils.openSession();
//
//			
//		    //get typeID
//			
//			TypeQuestion type = 
//			short id = type.getId();
//			
//			// create hql query
//			Query<Question> query = session.createQuery("FROM Question WHERE TypeID = :typeId");
//
//			// set parameter
//			query.setParameter("typeId", id);
//
//			// get result
//			List<Question> questions = query.list();
//
//			return questions;
//
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}

	public void createQuestion(Question Question) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(Question);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	public void updateQuestion(short id, String newName) {
//
//		Session session = null;
//
//		try {
//
//			// get session
//			session = hibernateUtils.openSession();
//			session.beginTransaction();
//
//			// get Question
//			Question Question = (Question) session.load(Question.class, id);
//
//			// update
//			Question.setName(newName);
//
//			session.getTransaction().commit();
//
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}

	public void updateQuestion(Question Question) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(Question);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteQuestion(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get Question
			Question Question = (Question) session.load(Question.class, id);

			// delete
			session.delete(Question);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isQuestionExistsByID(short id) {

		// get Question
		Question Question = getQuestionByID(id);

		// return result
		if (Question == null) {
			return false;
		}

		return true;
	}

//	public boolean isQuestionExistsByName(String name) {
//		Question Question = getQuestionByName(name);
//
//		if (Question == null) {
//			return false;
//		}
//		return true;
//	}
}
