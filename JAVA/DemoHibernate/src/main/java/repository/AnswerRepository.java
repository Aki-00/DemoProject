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

import entity.Answer;
import utils.HibernateUtils;

/**
 * This class is AnswerRepository entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 26, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 26, 2020
 */
public class AnswerRepository {
	
	private HibernateUtils hibernateUtils;

	public AnswerRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<Answer> getAllAnswers() {
		Session session = null;
		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Answer> query = session.createQuery("FROM Answer");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Answer getAnswerByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get Answer by id
			Answer Answer = session.get(Answer.class, id);

			return Answer;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public Answer getAnswerByName(String name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Answer> query = session.createQuery("FROM Answer WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			Answer Answer = query.uniqueResult();

			return Answer;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createAnswer(String content, short questionId) {

		Session session = null;
		QuestionRepository repository = new QuestionRepository();

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			Answer answer = new Answer(content, repository.getQuestionByCreator(questionId));
			session.save(answer);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	public void updateAnswer(short id, String newName) {
//
//		Session session = null;
//
//		try {
//
//			// get session
//			session = hibernateUtils.openSession();
//			session.beginTransaction();
//
//			// get Answer
//			Answer Answer = (Answer) session.load(Answer.class, id);
//
//			// update
//			Answer.setName(newName);
//
//			session.getTransaction().commit();
//
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}

	public void updateAnswer(Answer Answer) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(Answer);

			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteAnswer(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get Answer
			Answer Answer = (Answer) session.load(Answer.class, id);

			// delete
			session.delete(Answer);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isAnswerExistsByID(short id) {

		// get Answer
		Answer Answer = getAnswerByID(id);

		// return result
		if (Answer == null) {
			return false;
		}

		return true;
	}

	public boolean isAnswerExistsByName(String name) {
		Answer Answer = getAnswerByName(name);

		if (Answer == null) {
			return false;
		}
		return true;
	}
}
