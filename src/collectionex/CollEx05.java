package collectionex;

import java.util.*;

public class CollEx05 {
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("one", "하나");
		map.put("two", "둘");
		map.put("three", "셋");
		map.put("four", "넷");
		map.put("five", "다섯");
		map.put("six", "하나");
		
		Set<String> keys = map.keySet(); //"one","two","three","four","five"
		for(String s  : keys) {
			System.out.printf("key : %s\t value: %s\n", s, map.get(s));
		}
		System.out.println("\n=======================\n");
		
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.printf("key : %s\t value: %s\n", key, map.get(key));
		}
		System.out.println("\n=======================\n");
		
		Collection<String> value = map.values();
		for(String s  : value) {
			System.out.printf("value : %s\n",s);
		}
		System.out.println("\n=======================\n");
		
		iter = value.iterator();
		while (iter.hasNext()) {
			System.out.printf("value : %s\n",iter.next());
		}
	}
}




