package sec01.exam;

import java.util.ArrayList;
import java.util.List;

public class MainClass1 {

	public static void main(String[] args) {
		
		MemberDto memberDto1 = new MemberDto("이은찬", 50, "서울 성동구", "010*******", "ch*****@gmail.com");
		MemberDto memberDto2 = new MemberDto("이창주", 20, "서울 종로구", "010****4835", "ni*****@gmail.com");
		MemberDto memberDto3 = new MemberDto("이형주", 18, "서울 강남구", "010****4832", "ki*****@gmail.com");
		
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();
		
		memberDtos.add(memberDto1);
		memberDtos.add(memberDto2);
		memberDtos.add(memberDto3);
		memberDtos.add(new MemberDto("김윤경",50,"서울 성동구","0108*****3","jo*****@gmail.com"));
		
		MemberDto memberDto = memberDtos.get(3)	;
		System.out.println(memberDto.getMname());
		
		for(int i=0;i<memberDtos.size();i++) {
			String name = memberDtos.get(i).getMname();
			int age = memberDtos.get(i).getMage();
			String addr = memberDtos.get(i).getMaddr();
			String phone = memberDtos.get(i).getMphone();
			String email = memberDtos.get(i).getMemail();
						
			System.out.println(name + "/" + age + "/" + addr + "/" +  phone + "/" + email );
		}
		
		
	}

}
