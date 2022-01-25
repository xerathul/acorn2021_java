package SUl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;




import test.member.dto.MemberDto;
import test.util.DBConnect;

public class Study07 {
	/*
	 *  Scanner 객체를 이용해서 검색할 회원의 번호를 입력 받아서
	 *  입력받은 숫자를 이용해서 SELECT 문을 수행하고 
	 *  결과값을 MemberDto 객체를 생성해서 담아 보세요.
	 *  
	 *  결과가 없다면 MemberDto 객체를 생성하지 마세요 ( null 인 상태로 두기 )
	 */
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("검색할 번호 입력");
		int num= scan.nextInt();
		
		MemberDto dto=null;
		Connection conn= null;
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		
		try {
			conn=new DBConnect().getConn();
			String sql= "Select name, addr from member where num=?";
			pstmt=conn.prepareStatement(sql);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
