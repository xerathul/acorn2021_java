package test.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.util.DBConnect;

public class DeptDao {
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs= null;
	
	//모든 회원의 정보를 SELECT 해서 리턴하는 메소드
	public List<DeptDto> selectAll(){
		List<DeptDto> list= new ArrayList<DeptDto>();
		
		
		try {
			conn= new DBConnect().getConn();
			String sql="select deptno, dname, loc from dept";
			pstmt=conn.prepareCall(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				DeptDto dto= new DeptDto();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getNString("dname"));
				dto.setLoc(rs.getString("loc"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
	//회원 한명의 정보를 SELECT 해서 리턴하는 메소드
	public DeptDto select(int num) {
		
		DeptDto dto=null;
		
		try {
			conn= new DBConnect().getConn();
			String sql= "Select deptno, dname, loc from dept where deptno=?";
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				dto= new DeptDto();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getNString("dname"));
				dto.setLoc(rs.getNString("loc"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return dto;
	}
	
	//1. 회원 한명의 정보를 저장하는 메소드를 만들어 보세요.
		// 메소드명 : insert
		// 리턴 type : 알아서
		// 메소드에 전달하는 인자의 type : MemberDto 
	public boolean insert(DeptDto dto) {
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="insert into dept"
					+ " (deptno, dname, loc)"
					+ " values(dept_seq.nextval,?,?)";
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			
			flag=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
	
	//2. 회원 한명의 정보룰 수정하는 메소드를 만들어 보세요.
	// 메소드명 : update
	// 리턴 type : 알아서
	// 메소드에 전달하는 인자의 type : MemberDto 
	
	public boolean update (DeptDto dto) {
		int flag=0;
		try {
			conn= new DBConnect().getConn();
			String sql="update dept set dname=?, loc=? where deptno=?";
			pstmt= conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			pstmt.setInt(3, dto.getDeptno());
			
			flag=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//회원 한명의 정보를 삭제하는 메소드
	public boolean delete(int deptno) {
		int flag=0;
		try {
			conn= new DBConnect().getConn();
			String sql="delete from dept where deptno=?";
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			flag=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//마무리 작업
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
}
