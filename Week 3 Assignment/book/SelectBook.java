package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectBook {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

	      
	      final String url = "jdbc:mysql:///Bookshop";
	      final String user = "root";
	      final String password = "Saran@31";

	      
	      Connection con = DriverManager.getConnection(url, user, password);
	   
	      Statement st = con.createStatement();

	      
	      String query = "SELECT * FROM book WHERE bookId = '1' OR bookName = 'Introduction to Java'";

	      
	      ResultSet rs = st.executeQuery(query);

	
	      boolean flag = false;
	      while (rs.next()) {
	         flag = true;
	         System.out.println(rs.getInt(1) + " " + rs.getString(2) + 
	        		 " " + rs.getString(3)+ " " +rs.getString(4));

	      }

	      if (flag == true) {
	         System.out.println("\nRecords retrieved and displayed");
	      } else {
	         System.out.println("Record not found");
	      }
	 
	      rs.close();
	      st.close();
	      con.close();

	}

}


