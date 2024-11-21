package sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("이은찬", 90);
		map.put("홍길동", 95);
		map.put("강감찬", 80);
		map.put("이은찬", 100);
		
		System.out.println("total size() : " + map.size());
		
		System.out.println("\t 이은찬 : " + map.get("이은찬"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+ " : "+value);				
		}
		System.out.println();
		
		map.remove("이은찬");
		System.out.println("total size :" + map.size());
		
				
	}

}
