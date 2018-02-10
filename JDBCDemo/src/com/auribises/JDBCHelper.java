package com.auribises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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
			String url = "jdbc:mysql://localhost/AuriWeekend";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("--Connection Opened--");
			
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
	}
	
	//3. 4.
	public void insertStudent(Student stu){
		try {
			
			//3. Create SQL Statement
			/*String sql = "insert into Student values(null,'"+stu.getName()+"',"+stu.getAge()+",'"+stu.getAddress()+"')";
			
			//4. Execute SQL Statement
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);*/
			
			String sql = "insert into Student values(null,?,?,?)";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, stu.getName());
			pStmt.setInt(2, stu.getAge());
			pStmt.setString(3, stu.getAddress());
			
			int i = pStmt.executeUpdate();
			
			System.out.println(i+" Row(s) inserted");
			
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
	}
	
	public void updateStudent(Student stu){
		try {
			
			String sql = "update Student set name = ?, age = ?, address = ? where roll = ?";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, stu.getName());
			pStmt.setInt(2, stu.getAge());
			pStmt.setString(3, stu.getAddress());
			pStmt.setInt(4, stu.getRoll());
			
			int i = pStmt.executeUpdate();
			
			System.out.println(i+" Row(s) Updated");
			
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
	}
	
	public void deleteStudent(int roll){
		try {
			
			String sql = "delete from Student where roll = ?";
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, roll);
			
			int i = pStmt.executeUpdate();
			
			System.out.println(i+" Row(s) Deleted");
			
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
	}
	
	public void retrieveStudents(){
		try {
			
			String sql = "select * from Student";
			pStmt = con.prepareStatement(sql);
			
			ResultSet rs = pStmt.executeQuery();
			
			int r=0,a=0;
			String n="",ad="";
			
			while(rs.next()){
				r = rs.getInt(1);
				n = rs.getString(2);
				a = rs.getInt(3);
				ad = rs.getString(4);
				
				System.out.println(r+"\t"+n+"\t"+a+"\t"+ad);
				System.out.println("-------------------------------------------");
			}
			
			
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
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
