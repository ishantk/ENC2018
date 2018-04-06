package com.auribises.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.jws.soap.SOAPBinding.Use;

import com.auribises.model.User;

public class JDBCHelper {
	
	Connection con;
	
	Statement stmt;
	PreparedStatement pStmt;
	
	// 1. Load the Driver
	public JDBCHelper() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
	}
	
	//2. Create the Connection
	public void openConnection(){
		try {
			String url = "jdbc:mysql://localhost/auribises";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("--Connection Opened--");
			
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
	}
	
	//3. 4.
	public int registerUser(User user){
		
		int i = 0;
		
		try {
			
			String sql = "insert into User values(null,?,?,?)";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.name);
			pStmt.setString(2, user.email);
			pStmt.setString(3, user.password);
			
			i = pStmt.executeUpdate();
			
			System.out.println(i+" Row(s) inserted");
			
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
		
		return i;
	}
	
	public ArrayList<User> retrieveUsers(){
		
		ArrayList<User> userList = new ArrayList<User>();
		
		try {
			
			String sql = "select * from User";
			pStmt = con.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				
				User user = new User();
				
				user.id = rs.getInt(1);
				user.name = rs.getString(2);
				user.email = rs.getString(3);
				user.password = rs.getString(4);
				
				userList.add(user);
			}
			
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
		
		return userList;
	}
	
	public boolean loginUser(User user){
		
		boolean check = false;
		
		try {
			
			String sql = "select * from User where email = ? and password = ?";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.email);
			pStmt.setString(2, user.password);
			
			ResultSet rs = pStmt.executeQuery();
			
			check = rs.next();
			
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
		
		return check;
	}
	
	
	// 5. Close the Connection
	public void closeConnection(){
		try {
			con.close();
			System.out.println("--Connection Closed--");
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
	}

}
