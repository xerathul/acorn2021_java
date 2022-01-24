package SUl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.util.DBConnect;

public class Study03 {
	//아래의 정보를 member  테이블에 저장하고자 한다.
	
	public static void main(String[] args) {
		String name="톰캣";
		String addr="건물 옥상";
		Connection conn=new DBConnect().getConn();
		PreparedStatement pstmt=null;
		int flag=0;
		
		try {
			String sql="insert into member values (member_seq.nextval,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			flag= pstmt.executeUpdate();
			System.out.println(flag);
			System.out.println("회원정보를 저장했습니다.");
			
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
			if(flag>0) {
				System.out.println("작업성공");
			}else {
				System.out.println("작업실패");
			}
			
		}
	}
}
