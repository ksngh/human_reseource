package util;

import java.sql.*;
import java.util.HashMap;

public class DBConnection {
	static final String DB_URL = "jdbc:mysql://192.168.0.37/human_resource";   // container name
	static final String USER = "human_resource";
	static final String PASS = "1234";
	Connection conn = null;
	Statement stmt = null;
	HashMap<Integer, HashMap<String, Object>> data = new HashMap<>();
	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("데이터베이스에 성공적으로 연결되었습니다.");
			stmt = conn.createStatement();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾을 수 없습니다.");
			throw new RuntimeException(e);
		}
    }

	public void close() {
		try {
			conn.close();
			stmt.close();
		} catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
	public Connection getConn() {
		return conn;
	}

	public Statement getStmt() {
		return stmt;
	}
}
