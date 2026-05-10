package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public static Connection getConnection() {
		
		Connection con=null;
		
		try {
			String URL="jdbc:mysql://localhost:3306/libraryManagement";
			String user="root";
			String password="vetri@1234";
			
			// Loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Getting connection
			con=DriverManager.getConnection(URL, user, password);
			
			//System.out.print("Db connected");
			
		}	
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
