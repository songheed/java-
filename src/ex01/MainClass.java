package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

class DB_con{
	private Connection con;
	private PreparedStatement ps; //명령어 전송
	public ResultSet rs;
	public DB_con() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//먼저실생
			System.out.println("오라클 기능 사용가능(드라이브 로드)");
			
			//18버전 이전 : xe, 19이상: orcl
			String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
			String id = "c##sshjava";
			String pwd = "1234";
			con = DriverManager.getConnection(url, id, pwd); //오라클에 연동한다.
			System.out.println("db 연결 성공 : " +con);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<MemberDTO> select() {
		//con은 연결만 시켜줌
		String sql = "select * from member_test";
		ArrayList<MemberDTO> arr = new ArrayList<>();
		try {
			ps = con.prepareStatement(sql); //전송객체를 얻어온다
			rs = ps.executeQuery();
//			System.out.println(rs.next());
			while(rs.next()) {
			MemberDTO dto= new MemberDTO();
			dto.setId(rs.getString("id"));
			dto.setPwd(rs.getString("pwd"));
			dto.setName(rs.getString("name"));
			dto.setAge(rs.getInt("age"));
			
			arr.add(dto);
			
			
//			System.out.println(rs.getString("id"));
//			System.out.println(rs.getString("pwd"));
//			System.out.println(rs.getString("name"));
//			System.out.println(rs.getInt("age"));
//			System.out.println("-----------------");
			}
			
//			//ps는 명령어를 보내는 역할 exe는 실행하는 역할을 한다.
//			System.out.println(rs.next());
//			System.out.println(rs.getString("pwd"));
//			System.out.println(rs.getString("id"));
//			System.out.println(rs.getString("name"));
//			System.out.println(rs.getInt("age"));
//
//			System.out.println(rs.next());
//			System.out.println(rs.getString("pwd"));
//			System.out.println(rs.getString("id"));
//			System.out.println(rs.getString("name"));
//			System.out.println(rs.getInt("age"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arr;
	}
	public MemberDTO selectOne(String userId ) {
		String sql = "select * from member_test where id = "+"'"+userId +"'";
		System.out.println(sql); //작은따옴표가 없어  error발생
		
		MemberDTO dto = null;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			//while(rs.next()){
			if(rs.next()){	
				dto = new MemberDTO();
				dto.setAge(rs.getInt("age"));
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setPwd(rs.getString("pwd"));
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("pwd"));
				System.out.println(rs.getString("name")); 
				System.out.println(rs.getInt("age"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	
	public int delete(String delId) {
		String sql = "delete from member_test where id= ? ";
		//? =나중에 값을 채워 넣겠다.
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, delId); //1 은 첫번째 ?에다가 1을 넣겠다.
			//sql에서 성공적으로 삭제되면 삭제된 행을 보낸다.
			//query는 select만 사용
			result = ps.executeUpdate(); //select를 제외한 나머지는 update사용
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int insert(MemberDTO dto) {
		String sql = "insert into member_test(id,pwd,name,age) values(?,?,?,?)";
		//insert 는 값이 중복되면 error발생
		int result =0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPwd());
			ps.setString(3, dto.getName());
			ps.setInt(4, dto.getAge());
			
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
//자바에서 데이터베이스에 접근하려면 오라클에서 사용할수 있는 기능을 넣어야 한다.
public class MainClass {
public static void main(String[] args) {
	DB_con db = new DB_con();
	
	Scanner input = new Scanner(System.in);
	int num;
	while(true) {
		System.out.println("1. 모든 목록 보기");
		System.out.println("2. 특정 사용자 보기");
		System.out.println("3.데이터 추가");
		System.out.println("3.데이터 삭제");
		System.out.println(">>> : ");
		num = input.nextInt();
		switch(num) {
		case 1 : 
			ArrayList<MemberDTO> arr = db.select();
			System.out.println("---main---");
			for(MemberDTO dto : arr) {
				System.out.println("id :" +dto.getId());
				System.out.println("pwd :" +dto.getPwd());
				System.out.println("name :" +dto.getName());
				System.out.println("age :" +dto.getAge());
				System.out.println("----------------");
			}
			break;
		case 2 : 
			System.out.println("검색 id 입력");
			String userId = input.next();
//			db.selectOne(userId);
			MemberDTO dto = db.selectOne(userId);
//			System.out.println("dto : " +dto);
			if(dto== null)
				System.out.println("존재하지 않는 id입니다");
			else {
				System.out.println("---검색 결과---");
				System.out.println("id : " +dto.getId());
				System.out.println("pwd : " +dto.getPwd());
				System.out.println("name : " +dto.getName());
				System.out.println("age : " +dto.getAge());
			}
			break;
		case 3 : 
			MemberDTO d = new MemberDTO();
			while(true) {
				System.out.println("가입할 id 입력");
				d.setId(input.next());
				MemberDTO dd = db.selectOne(d.getId());
				if(dd == null) 
					break;
				System.out.println("존재하는 id 다시입력");
				
			}
			System.out.println("가입할 pwd 입력");
			d.setPwd(input.next());
			System.out.println("가입할 name 입력");
			d.setName(input.next());
			System.out.println("가입할 age 입력");
			d.setAge(input.nextInt());
			
			int res = db.insert(d);
			if(res == 1) {
				System.out.println("회원가입 성공");
			}else
				System.out.println("존재하는 id입니다.");
			break;
		case 4 : 
			System.out.println("삭제 id 입력");
			String delId = input.next();
			int re = db.delete(delId);
			if(re == 1) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("존재하지 않는 id입니다.");
			}
			break;
		
	}
	
	}
	
	
	
	
	
	
	
}
}
