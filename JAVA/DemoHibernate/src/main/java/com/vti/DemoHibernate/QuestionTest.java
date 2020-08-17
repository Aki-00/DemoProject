/**
 * 
 */
package com.vti.DemoHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mysql.cj.xdevapi.SessionFactory;

import entity.Question;
import entity.TypeQuestion;
import entity.ennuminate.TypeName;
import repository.QuestionRepository;
import repository.TypeQuestionRepository;

/**
 * This class is TestHibernate entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 23, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 23, 2020
 */
public class QuestionTest {
	
	public static void main(String[] args) {
		QuestionRepository repository = new QuestionRepository();
		TypeQuestionRepository typeQuestionRepository = new TypeQuestionRepository();
		
//		System.out.println("---Get all Question----");
//		List<Question> questions = repository.getAllQuestions();
//		for (Question question : questions) {
//			System.out.println(question);
//		}
//		
		
//		System.out.println("---Get Question by id----");
//		Question Question = repository.getQuestionByID((short) 5);
//		System.out.println(Question);
		
		
//		System.out.println("---Get Question by id----");
//		Question Question = repository.getQuestionByID((short)2);
//		System.out.println(Question);
		
		
//		System.out.println("---Get Question by name----");
//		List<Question> questions = repository.getQuestionByType((short)1);
//		for (Question question : questions) {
//			System.out.println(question);
//		}
		
		List<TypeQuestion> typeQuestions = typeQuestionRepository.getTypeQuestionByName(TypeName.MULTIPLECHOICE);
		for (TypeQuestion typeQuestion2 : typeQuestions) {
			System.out.println(typeQuestion2);
		}
		
		
//		System.out.println("---create Question");
//		Question Question = new Question();
//		Question.setName("Waiting");
//		repository.createQuestion(Question);
//		System.out.println(Question);
		
//		System.out.println("---update Question");
//		repository.updateQuestion((short)2, "Test");
	}





}
