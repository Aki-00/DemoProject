package com.vti.entity.Abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Examinee  {
	private int sbd;
	private String name;
	private String address;
	private Priority priority;
	private Block block;
	
	public Examinee(){
		
	}

	public Examinee(int sbd, String name, Block block) {
		super();
		this.sbd = sbd;
		this.name = name;
		this.block = block;
		this.address = address;
		this.priority = priority;
	}

	public int getSbd() {
		return sbd;
	}

	public void setSbd(int sbd) {
		this.sbd = sbd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}
	
	
}
