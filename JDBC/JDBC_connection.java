package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_connection {
public static void main(String[] args) throws SQLException {
	/*Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root" ,"root");
	
	
	if(connection.isClosed())
	{
		System.out.println("not connect");
	}
	else
	{
		System.out.println("succesufull connect");
		
	}*/
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Choure@123");
	
	
	Statement stmt = con.createStatement();
	//String s="SELECT EMPID,FN,LN FROM EMPLOYEES";
	String s="SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID=30";
	ResultSet rs = stmt.executeQuery(s);
	while(rs.next())
	{
		int eid = rs.getInt("EMPID");
		String fname = rs.getString("FN");
		String lname = rs.getString("LN");
		System.out.println(eid+"  "+fname+"    "+lname);
	}
	con.close();
	System.out.println("Query is Excuted");
}
}
