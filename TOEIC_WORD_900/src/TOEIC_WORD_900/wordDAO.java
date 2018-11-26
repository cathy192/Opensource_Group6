package TOEIC_WORD_900;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class wordDAO {
	public static File file;
	public static FileReader filereader;
	public static BufferedReader bufReader;
	static final String id = "root";
	static final String pass = "1234";
	static String url = "jdbc:mysql://127.0.0.1:3306/java?serverTimezone=UTC";

public wordDAO() {
	System.out.println("MySQL JDBC 드라이버 로딩중...");
	try {
		///////////////////////////////////////
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("MySQL JDBC 드라이버 로딩 성공...");
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static void insert(int unit,String word,String mean) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	try {
		
		conn = DriverManager.getConnection(url,id,pass);
		String query = "insert into words(unit,word,mean) values (?,?,?)";
		pstmt = conn.prepareStatement(query);	
		pstmt.setInt(1, unit);
		pstmt.setString(2, word);
		pstmt.setString(3, mean);
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
