package sec01.exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("홍길동");
		set.add("이순신");
		set.add("김유신");
		set.add("홍길동");
		set.add("강감찬");
		set.add("홍길동");
		
		System.out.println(set.size());
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		/////////////////////////////////////////////
		System.out.println("--------------------------------------");
		
		MemberDto memberDto1 = new MemberDto("이은찬", 50, "서울 성동구", "01086384832", "chani74@gmail.com");
		MemberDto memberDto2 = new MemberDto("이창주", 20, "서울 종로구", "01049504835", "nicejoo21@gmail.com");
		MemberDto memberDto3 = new MemberDto("이형주", 18, "서울 강남구", "01064394832", "kindjoo21@gmail.com");
	
		Set<MemberDto> memberDtos = new HashSet<MemberDto>();
		
		memberDtos.add(memberDto1);
		memberDtos.add(memberDto2);
		memberDtos.add(memberDto3);
		memberDtos.add(memberDto1);
		memberDtos.add(memberDto2);
		memberDtos.add(memberDto3);
		
		Iterator<MemberDto> iterator2 = memberDtos.iterator();
		
		// iterator를 통한 반복문
		while(iterator2.hasNext()) {
			MemberDto M = iterator2.next();
			
			String name = M.getMname();
			int age = M.getMage();
			String addr = M.getMaddr();
			String phone = M.getMphone();
			String email = M.getMemail();
						
			System.out.println(name + "/" + age + "/" + addr + "/" +  phone + "/" + email );
		}
		
		
		System.out.println("--------------------------------------");
		memberDtos.remove(memberDto1);
		
		
		// 향상된 for문 
		for (MemberDto mem : memberDtos) {
			String name = mem.getMname();
			int age = mem.getMage();
			String addr = mem.getMaddr();
			String phone = mem.getMphone();
			String email = mem.getMemail();
						
			System.out.println(name + "/" + age + "/" + addr + "/" +  phone + "/" + email );
		}
		
		System.out.println("--------------------------------------");

		memberDtos.clear();
		
		if (memberDtos.isEmpty()) {
			System.out.println("비었음"+memberDtos.size());
		}
		
		
	}

}
