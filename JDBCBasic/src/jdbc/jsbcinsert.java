package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class jsbcinsert 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "JSP";
		String upw = "JSP";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into members values(?,?,?,?)";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ID>");
		String id =scan.next();
		System.out.println("pw>");
		String pw =scan.next();
		System.out.println("name>");
		String name =scan.next();
		System.out.println("email>");
		String email =scan.next();
		
		try 
		{
			//=================================================
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			//==============================================
			System.out.println(conn);

			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			int result = pstmt.executeUpdate();
			
			if(result ==1)
			{
				System.out.println("정상처리");
			}
			else
			{
				System.out.println("insert실패");
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
			

			} catch (Exception e2)
			{
				// TODO: handle exception
			}
		}
	}

}
