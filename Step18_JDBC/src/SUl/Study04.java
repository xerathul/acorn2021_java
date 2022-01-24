package SUl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import test.util.DBConnect;

public class Study04 {
	/*
	 *  member 테이블에서 
	 * 
	 *  num 이 804 번인 회원의 
	 *  
	 *  addr 을 노량진으로 수정하는 코드를 작성해 보세요.
	 *   
	 */
	public static void main(String[] args) {
		Connection conn= new DBConnect().getConn();
		PreparedStatement pstmt=null;
		int flag= 0;
		Scanner scan= new Scanner(System.in);
		System.out.println("몇번째 회원정보를 수정하시겠습니까?");
		int num=scan.nextInt();
		
		String addr="노량진";
		
		try {
			String sql="update member set addr=? where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setNString(1, addr);
			pstmt.setInt(2, num);
			
			flag=pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
				try {
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		if(flag>0) {
			System.out.println("수정 성공!");
		}else {
			System.out.println("수정실패ㅠ");
		}
		
	}
}
