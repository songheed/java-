package file.serivce;

import java.util.Scanner;

import file.dao.MemberDAO;
import file.dto.MemberDTO;

public class ServiceMemberImpl implements ServiceMember{ //serviceMember상속후 override진행
	private MemberDAO dao;
	public ServiceMemberImpl() {
		dao = new MemberDAO();
	}

	@Override
	public void register() {
		MemberDTO dto = new MemberDTO();
		Scanner input = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		dto.setId(input.next());
		System.out.println("이름 입력");
		dto.setName(input.next());

		dao.register(dto);
	}	
	public void list() {
		String[] listFile = dao.getList();
		if(listFile.length == 0) {
			System.out.println("저장된 목록이 없습니다.");
		}else {
			for(int i=0 ; i<listFile.length; i++) {
				System.out.println( i+1+"." +listFile[i]);
			}
		}
	}
	
	public void delete() {
		Scanner input = new Scanner(System.in);
		String id ;
		System.out.println("삭제할 id입력");
		id = input.next();
		dao.delete(id);
	}
	
	public void search() {
		Scanner input = new Scanner(System.in);
		String id ;
		System.out.println("검색할 id입력");
		id = input.next();
		MemberDTO d = dao.search(id);
		if(d != null) {
			System.out.println("id : "+ d.getId());
			System.out.println("name : "+ d.getName());
			
		}
		
	}
}
