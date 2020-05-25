package com.vti.entity;

import java.util.HashMap;
import java.util.Map;

public class Myphone<K, V> extends MyMap<K, V> {

	Integer number;
	String name;
	String email;
	String phoneNumber;
	
	@Override
	public V getValue(K key) {
		// TODO Auto-generated method stub
		return super.getValue(key);
	}
	
	public static void main(String[] args) {
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(1,"012345678");
		getValue(1);
		
	}
	
}
