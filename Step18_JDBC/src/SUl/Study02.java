package SUl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;

public class Study02 {
	/*
	 *   접속 ip 주소 : 14.63.164.99
	 *   아이디 : acorn01
	 *   비밀번호 : tiger01
	 *   
	 *   위의 DB 에 접속해서 
	 *   emp 테이블의 내용중 에서 사원번호(empno), 사원이름(ename), 부서번호(deptno)
	 *   를 select 해서 콘솔창에 출력해 보세요.
	 *   단, 사원번호에 대해서 오름차순 정렬해서... 
	 */
	public static void main(String[] args) {
		Connection conn=new DBConnect().getConn();
		PreparedStatement pstmt=null;
		ResultSet rs= null;
		
		try {
			String sql="select empno, ename, deptno from emp order by deptno asc";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while (rs.next()) {
				int empno= rs.getInt("empno");
				String ename= rs.getString("ename");
				int deptno= rs.getInt("deptno");
				System.out.println(empno+"|"+ename+"|"+deptno);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}
}
