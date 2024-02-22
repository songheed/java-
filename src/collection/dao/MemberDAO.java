package collection.dao;

import java.util.ArrayList;

import collection.dto.MemberDTO;

public class MemberDAO { //dao가 저장소(dto)에 연락을 한다.
	//데이터베이스를 연동
	public static ArrayList<MemberDTO> arr; 
	//데이터 변동을 안했기 때문에 static추가(나중엔 안해도 된다.)
	static { //연산되는 코드를 추가할 수 있다.
		arr = new ArrayList<>();
//		arr.add(null);
		
	}
	public void register (MemberDTO dto) {
		System.out.println("dao register 연동");
//		System.out.println(dto.getName());
//		System.out.println(dto.getAddr());
		arr.add(dto);
	}
	public ArrayList<MemberDTO> getData() {
		return arr;
	}
	public MemberDTO search(String name) {
		for(MemberDTO d : arr) {
			if(name.equals(d.getName())) {
				return d;
			}
		}
		return null;
	}
}
