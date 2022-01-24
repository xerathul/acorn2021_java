package SUl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class Study05 {

/*
 *  member  테이블에서 
 *  회원번호가 801 번 회원의 정보를 삭제하는 기능을 완성해 보기 
 *  hint  
 *  new DBConnect().getConn();
 */
	public static void main(String[] args) {
		Connection conn= new DBConnect().getConn();
		PreparedStatement pstmt=null;
		int flag=0;
		int num=3;
		
		
		try {
			String sql="delete from member where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			flag=pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		if(flag>0) {
			System.out.println("회원정보를 삭제하였습니다.");
		}else {
			System.out.println("회원정보 삭제 실패하였습니다.");
		}
	}
	
}
