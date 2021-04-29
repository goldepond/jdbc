package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcSelect {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "JSP";
		String upw = "JSP";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from members";
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			System.out.println(conn);

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) 
			{
				String id = rs.getString("id");
				String pw = rs.getNString("pw");
				String email = rs.getNString("email");
				String name = rs.getString("name");

				System.out.println(id);
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				conn.close();
				pstmt.close();
				rs.close();

			} catch (Exception e2)
			{
				// TODO: handle exception
			}
		}
	}
}
