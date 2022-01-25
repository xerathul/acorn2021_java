package SUl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.member.dto.MemberDto;
import test.util.DBConnect;

public class Study08 {
	/*
	 *  member 테이블에 있는 회원 목록을 SELECT 하고  
	 *  num 에 대해서 오름차순 정렬을 해서
	 *  List<MemberDto> 형태로 만들어 보세요.
	 */
	public static void main(String[] args) {
		List<MemberDto> list =new ArrayList<>();
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs =null;
		
		try {
			conn=new DBConnect().getConn();
			String sql="Select num, name, addr"
					+ " from member"
					+ " order by num asc";
			pstmt= conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			//로우가 여러개니까 반복문 돌면서 rs에 담긴 내용 추출
			while(rs.next()) {
				int num=rs.getInt("num");
				String name=rs.getNString("name");
				String addr=rs.getString("addr");
				MemberDto dto=new MemberDto();
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
				list.add(dto);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)rs.close();
				if(conn!=null)rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
