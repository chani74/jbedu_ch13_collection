package sec01.exam;

import java.util.HashMap;
import java.util.Map;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동", 27);
		map.put("이순신", 35);
		map.put("김유신", 45);
		map.put("홍길동", 29);
		
		System.out.println(map.get("홍길동"));
		System.out.println(map.size());
		
		map.remove("김유신");
		
		for (String key : map.keySet()) {
			System.out.println("key: " + key + ", value : " + map.get(key));
		}
	}

}
