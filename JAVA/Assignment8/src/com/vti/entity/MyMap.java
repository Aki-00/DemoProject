package com.vti.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap<K, V> {
	private Map<K, V> maps = new HashMap<>();

	public V getValue(K key) {
		return maps.get(key);
	}

	public K getKey(V value) {
		K result = null;
		Set<K> set = maps.keySet();
		for (K k : set) {
			if (maps.get(k).equals(value)) {
				result = k;
			}
		}
		return result;
	}

}
