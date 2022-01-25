package test.member.dao;
/*
 *  회원정보(member 테이블) 의 내용을
 *  select
 *  insert
 *  update
 *  delete 
 *  작업을 할 객체를 생성할 클래스 설계하기 
 *  
 *  - 필요한 객체를 담을 지역변수를 선언하는 위치도 중요하다.
 *  - 필요한 객체를 생성하는 위치도 중요하다.
 *  
 *  Data Access Object (DAO)
 *  
 *  - DB 에 INSERT, UPDATE, DELETE, SELECT 작업을 수행하는 객체
 *  - Table 마다 하나의 DAO 혹은  주제(카테고리) 마다 하나의 DAO 를 작성하게 된다.
 *  - DAO 를 만들기 위해서는 DTO 클래스를 미리 설계를 하고 만들어야 한다.
 *  - 주제(카테고리) 에 관련된 DAO 는 여러개의 Table 의 join 이 일어 날수도 있다.
 *    따라서 하나의 Table 당 하나의 DAO 는 아닌것이다. 
 *    예를 들어 사원정보를 출력한다고 가정을 해 보면
 *    emp, dept, salgrade 3개의 테이블의 join 이 일어날수도 있다.  
 * 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.member.dto.MemberDto;
import test.util.DBConnect;

public class StudyDao {
	//모든 회원의 정보를 SELECT 해서 리턴하는 메소드
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	
	
	public List<MemberDto> selectAll(){
		List<MemberDto> list= new ArrayList<>();
		
		
		try {
			conn= new DBConnect().getConn();
			String sql= "select num, name, addr from memeber";
			pstmt=conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			
			int num= rs.getInt("num");
			String name= rs.getString("name");
			String addr= rs.getString("addr");
			
			while(rs.next()) {
				MemberDto dto=new MemberDto();
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
				list.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
	public MemberDto select(int num) {
		MemberDto dto=null;
		try {
			
			conn=new DBConnect().getConn();
			String sql= "Select name, addr from member where num=?";
			pstmt= conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				dto= new MemberDto();
				dto.setNum(num);
				dto.setName(rs.getNString("name"));
				dto.setAddr(rs.getString("addr"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		return dto;
	}
}
