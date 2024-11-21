package sec02.exam;

import java.util.LinkedList;
import java.util.Queue;

import sec01.exam.MemberDto;

public class MainClass2 {

	public static void main(String[] args) {
		Queue<MemberDto> queue = new LinkedList<MemberDto>();	// 큐 구현

		MemberDto memberDto1 = new MemberDto("이은찬", 50, "서울 성동구", "0108***^^^^", "cha****@gmail.com");
		MemberDto memberDto2 = new MemberDto("이창주", 20, "서울 종로구", "0104***^^^^", "nice****@gmail.com");
		MemberDto memberDto3 = new MemberDto("이형주", 18, "서울 강남구", "0106***^^^^", "kind****@gmail.com");
		MemberDto memberDto4 = new MemberDto("김윤경", 50, "서울 성동구", "0108***^^^^", "ch****@gmail.com");
		
		queue.offer(memberDto1);
		queue.offer(memberDto2);
		queue.offer(memberDto3);
		queue.offer(memberDto4);
		
		while(!queue.isEmpty()) {
			MemberDto mDto = queue.poll();
			
			String name = mDto.getMname();
			int age = mDto.getMage();
			String addr = mDto.getMaddr();
			String phone = mDto.getMphone();
			String email = mDto.getMemail();
						
			System.out.println(name + "/" + age + "/" + addr + "/" +  phone + "/" + email );
		}
	}

}
