package com.ss.main;

import java.sql.*;

public class Main {

	public static void main(String[] args)  {

		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_company", "root", "root");
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("select * from city");
			while (myRs.next()){
				System.out.println(myRs.getString(1) + " , " 
						+ myRs.getString("country_id") + " , " + myRs.getString("city_name"));}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}