package dbpkg;

import java.sql.*;

public class DBConnection {
	public DBConnection() {

	}

	public Connection getConnection() {
		String driver = "oracle.jdbc.OrcaleDriver";
		String url = "jdbc:oracle:thin:@localhost:1512:xe";
		String user = "scott";
		String password = "1234";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public void closeDBResource(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		if (rs != null) {
			try {
				rs.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void closeDBResource(PreparedStatement pstmt, Connection conn) {
		if (pstmt != null) {
			try {
				pstmt.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
