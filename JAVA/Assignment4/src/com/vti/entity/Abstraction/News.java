package com.vti.entity.Abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {

	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;	
	private int[] Rates = new int[3];
	
	public int[] getRates() {
		return Rates;
	}
	
	public void setRates(int[] Rates) {
		this.Rates = Rates;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getAverageRate() {
		return averageRate;
	}
	
	public News() {
		
	}

	
	
	public void insert() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<News> newss = new ArrayList<News>() ;
		News news = new News();
		System.out.println("Moi nhap so tin tuc muon them");
		int n = scanner.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println();
			System.out.println("Moi ban nhap ID");
			setId(scanner.nextInt());
			System.out.println("Moi ban nhap Title");
			scanner.nextLine();
			setTitle(scanner.nextLine());
			System.out.println("Moi ban nhap ngay phat hanh");			
			setPublishDate(scanner.next());			
			System.out.println("Moi ban nhap ten tac gia");
			scanner.nextLine();
			setAuthor(scanner.nextLine());
			System.out.println("Moi ban nhap noi dung");
			setContent(scanner.nextLine());
			System.out.println("Moi ban nhap 3 danh gia");
			for (int j=0;j<3;j++) {
				int rate =scanner.nextInt();
				Rates[j]=rate;
			}
			setRates(Rates);
			newss.add(news);			
		}
	}
	
	public void display() {
		System.out.println("ID: "+this.getId());		
		System.out.println("Content: "+this.getContent());
		System.out.println("Author: "+this.getAuthor());
		System.out.println("Publish Date: "+this.getPublishDate());
		System.out.println("Title: "+this.getTitle());
		System.out.println("AverageRate: "+this.getAverageRate());
		
	}
	

	@Override
	public float calculate() {
			averageRate = (Rates[0]+Rates[1]+Rates[2])/3;
			return averageRate;
	}
	
	
}
