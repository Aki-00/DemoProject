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

import entity.Position;
import entity.ennuminate.PositionName;
import repository.PositionRepository;

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
public class PositionTest {
	
	public static void main(String[] args) {
		PositionRepository repository = new PositionRepository();
		
//		System.out.println("---Get all Position----");
//		List<Position> positions = repository.getAllPositions();
//		for (Position position : positions) {
//			System.out.println(position);
//		}
		
		
//		System.out.println("---Get Position by id----");
//		Position position = repository.getPositionByID((short) 2);
//		System.out.println(position);
		
		System.out.println("---Get Position by name----");
		Position position = repository.getPositionByName("Dev");
		System.out.println(position);
	
		
//		System.out.println("---create Position");
//		Position position = new Position();
//		position.setName(PositionName.PM);
//		repository.createPosition(position);
//		System.out.println(position);
		
//		System.out.println("---update Position");
//		repository.updatePosition((short)2, "Test");
	}





}
