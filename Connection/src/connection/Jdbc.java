package connection;
import java.sql.*;

public class Jdbc {
 public static void main(String args[]) {
	 try {
		 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Aspire@123");
		 Statement stmt=conn.createStatement();
		 ResultSet rs=stmt.executeQuery("select * from student");
		 
		 
		 while(rs.next()) {
			 System.out.println("\nName: \t"+rs.getString("name"));
			 System.out.println("\nId: \t"+rs.getInt("Id"));
		 }
	 }
	 catch(SQLException e) {
		 e.printStackTrace();
	 }
 }

}
