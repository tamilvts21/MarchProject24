package org.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Load the driver 
	Class.forName("oracle.jdbc.driver.OracleDriver");
	// Driver Manager - Predefined class & get connection 
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","tamil@123");
	//Write the Queryxd6
	String s = "Select * from Employees";
	PreparedStatement prepareStatement = connection.prepareStatement(s);
	//Execute Query
	ResultSet executeQuery = prepareStatement.executeQuery();
	//Java Representation of table - Result Set
	while (executeQuery.next()) {
		String string = executeQuery.getString("first_name");
		System.out.println(string);
	}
	
	

	}

}



