package listArrayProject;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection implements MyProvider {
static Connection c=null;
	
	public static Connection getCon() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection(url,user,password1);
			
			
			
		}catch(Exception e) {
			System.out.println("Error"+e);
		}
		
		return c;

	}
}
