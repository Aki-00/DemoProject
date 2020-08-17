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

import entity.Answer;
import repository.AnswerRepository;

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
public class AnswerTest {
	
	public static void main(String[] args) {
		AnswerRepository repository = new AnswerRepository();
		
//		System.out.println("---Get all Answer----");
//		List<Answer> Answers = repository.getAllAnswers();
//		for (Answer Answer : Answers) {
//			System.out.println(Answer);
//		}
		
		
//		System.out.println("---Get Answer by id----");
//		Answer Answer = repository.getAnswerByID((short) 5);
//		System.out.println(Answer);
		
//		System.out.println("---Get Answer by name----");
//		Answer Answer = repository.getAnswerByName("Sale");
//		System.out.println(Answer);
//		
		
		System.out.println("---create Answer");
		repository.createAnswer("BBBB", (short)2);
//		
//		System.out.println("---update Answer");
//		repository.updateAnswer((short)2, "Test");
	}





}
