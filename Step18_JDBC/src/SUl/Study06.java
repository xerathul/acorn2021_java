package SUl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import test.util.DBConnect;

public class Study06 {
	/*
	 *   Scanner 객체를 이용해서 검색할 회원의 번호를 입력 받아서
	 *   DB 에서 SELECT 하고 
	 *   결과 값이 있으면 해당 회원의 정보를 콘솔창에 출력하고
	 *   결과 값이 없으면 해당 회원은 존재 하지 않습니다. 라고 출력되는 프로그래밍을 해 보세요
	 *   hint : String sql="SELECT num,name,addr FROM member WHERE num=?";
	 *   예)
	 *   검색할 회원번호 입력:
	 *   801
	 *   801 번 회원은 존재 하지 않습니다.
	 *   
	 *   예)
	 *   검색할 회원번호 입력:
	 *   850
	 *   번호 : 850, 이름 : 톰캣, 주소 : 건물 옥상
	 *   
	 */
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("몇번째 회원을 검색하시겠습니까?");
			
		int memNum=scan.nextInt();
		
		Connection conn=null;
		PreparedStatement pstmt= null;
		ResultSet rs=null;
			
		
		try {
			conn=new DBConnect().getConn();
			String sql="select * from member where num=?";
			//실행할 sql문을 전달하면서 PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			//미완성인 sql문 완성 시키기
			pstmt.setInt(1, memNum);
			//셀렉트 문=executeQuery 
			//Select 문 수행하고 결과값을 resultset 으로 받아오기
			rs= pstmt.executeQuery();
			if(rs.next()) {
				//커서가 위치한 곳의 데이터 추출하기
				int num=rs.getInt("num");
				String name= rs.getString("name");
				String addr= rs.getString("addr");
				System.out.println(num+"|"+name+"|"+addr);
			}else {
				System.out.println(memNum+" 번 회원은 존재하지 않습니다.");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//닫을때는 역순으로
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
