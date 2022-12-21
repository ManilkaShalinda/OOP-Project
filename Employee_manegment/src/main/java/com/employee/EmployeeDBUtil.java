package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDBUtil {

	public static List<Employee> validate(String username, String password){
		
		ArrayList<Employee> emp = new ArrayList<>();
		
		//create database connection
		String url = "jdbc:mysql://localhost:3306/user_profile";
		String user = "root";
		String pass = "s1apooth11.";
		
		
		//validate 
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String sql = "select * from employee_details where username='"+username+"' and password='"+password+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String phone = rs.getString(4);
				String gender = rs.getString(5);
				String age = rs.getString(6);
				String department = rs.getString(7);
				String userU = rs.getString(8);
				String passU = rs.getString(9);
				
				Employee e = new Employee(id,name,address,phone,gender,age,department,userU,passU);
				emp.add(e);
						
			}
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		
		
		return emp;
	}
	
}
