package listArrayProject;

import java.sql.*;
import java.util.*;

public class ListArray {
	
	public  static List<dataBase> drzava(){
		List<dataBase> listDb = new ArrayList();
		Connection c=null;
		
		try {
			
		c=MyConnection.getCon();
		Statement s=c.createStatement();
		ResultSet rez=s.executeQuery("select drzava from us");
		
		while(rez.next()) {
			String r=rez.getString("drzava");
			
			dataBase data=new dataBase(r);
			
			listDb.add(data);
		}	
		}catch(Exception e) {
			
		}
		return listDb;		
	}
}
