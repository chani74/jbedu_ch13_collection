package sec02.exam;

import java.util.Stack;

import sec01.exam.MemberDto;

public class MainClass1 {

	public static void main(String[] args) {
		Stack<MemberDto> stack = new Stack<MemberDto>();
		
		MemberDto memberDto1 = new MemberDto("이은찬", 50, "서울 성동구", "0108***^^^^", "cha****@gmail.com");
		MemberDto memberDto2 = new MemberDto("이창주", 20, "서울 종로구", "0104***^^^^", "nice****@gmail.com");
		MemberDto memberDto3 = new MemberDto("이형주", 18, "서울 강남구", "0106***^^^^", "kind****@gmail.com");
		MemberDto memberDto4 = new MemberDto("김윤경", 50, "서울 성동구", "0108***^^^^", "ch****@gmail.com");
		
		stack.push(memberDto1);
		stack.push(memberDto2);
		stack.push(memberDto3);
		stack.push(memberDto4);
		
		MemberDto memberDto_1 = stack.pop(); // 강감찬
		System.out.println(memberDto_1.getMname());
		
		while(!stack.isEmpty()) {
			MemberDto memDto = stack.pop();
			System.out.println(memDto.getMname());
					
		}
	}

}
