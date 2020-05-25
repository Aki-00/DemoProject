package com.vti.frontend;

import com.vti.entity.CPU;

public class InnerClass {
public static void main(String[] args) {
	//Q1
	
	CPU cpu = new CPU();
	CPU.Processor processor = cpu.new Processor();
	float cache  = processor.getCache();
	CPU.Ram ram =  cpu.new Ram();
	float clockSpeed = ram.getClockSpeed();
	
	
	
	
}
}
