package hashing;

import java.util.*;

public class HashMap1 {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("India", 140);
		map.put("US", 30);
		map.put("China", 180);
		System.out.println(map);
		map.put("India", 150);
		System.out.println(map);
		System.out.println(map.get("India"));
		System.out.println(map.get("Indonesia"));
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		Set<String> keys = map.keySet();
		for (String Key : keys) {
			System.out.println(Key + ": " + map.get(keys));
		}
		map.remove("China");
		System.out.println(map);
	}
}
