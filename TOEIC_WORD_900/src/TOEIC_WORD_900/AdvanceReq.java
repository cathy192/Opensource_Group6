package TOEIC_WORD_900;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AdvanceReq {
	static final String id = "root";
	static final String pass = "1234";
	String url = "jdbc:mysql://127.0.0.1:3306/java?serverTimezone=UTC";
	
	AdvanceReq(){
		System.out.println("MySQL JDBC 드라이버 로딩중...");
		try {
			///////////////////////////////////////
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("MySQL JDBC 드라이버 로딩 성공...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertInfo(String usrid,int unit,int ansRatio,Boolean passf,String wrong) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			
			conn = DriverManager.getConnection(url,id,pass);
			String query = "insert into test(id,unit,ansRatio,pass,wrong) values (?,?,?,?,?)";
			pstmt = conn.prepareStatement(query);	
			pstmt.setString(1, usrid);
			pstmt.setInt(2, unit);
			pstmt.setInt(3, ansRatio);
			pstmt.setBoolean(4, passf);
			pstmt.setString(5, wrong);
			pstmt.executeUpdate();
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
