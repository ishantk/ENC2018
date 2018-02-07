package com.auribises.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.auribises.model.Employee;

/*
 * Procedure | java.sql package
		1. Load the Driver
			1.1 Configure Build Path i.e. link your .jar file in your java project
			1.2 Use API Class.forname()

		2. Create the Connection
			2.1 URL 	 : jdbc:mysql://localhost/ENC2018
			2.2 Username : root	
			2.3 Password : 
			2.4 Use API's Connection and DriverManager

		3. Write SQL Statement
		
		4. Execute SQL Statement
			4.1 Use API either Statement or PreparedStatement

		5. Close the Connection	
			5.1 Use API Connection
 */


public class JDBCHelper {
	
	Connection con;
	
	Statement stmt;
	PreparedStatement pStmt;
	
	// 1. Load the Driver
	public JDBCHelper() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("==Driver Loaded==");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	//2. Create the Connection
	public void openConnection(){
		try {
			
			String url = "jdbc:mysql://localhost/ENC2018";
			String user = "root";	
			String password = ""; 
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("==Connection Opened==");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	//3. 4. 
	public void insertEmployee(Employee emp){
		try {
			// 3. Write SQL Statement
			//String sql = "insert into Employee values(null,'"+emp.getName()+"',"+emp.getSalary()+",'"+emp.getEmail()+"','"+emp.getAddress()+"')";
			
			String sql = "insert into Employee values(null,?,?,?,?)";
			
			//4. Execute SQL Statement
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql);
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, emp.getName());
			pStmt.setInt(2, emp.getSalary());
			pStmt.setString(3, emp.getEmail());
			pStmt.setString(4, emp.getAddress());
			
			int i = pStmt.executeUpdate();
			
			if(i>0)
				System.out.println("=="+emp.getName()+" Inserted: "+i+"==");
			else
				System.out.println("Insertion Failure");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void updateEmployee(Employee emp){
		try {
			// 3. Write SQL Statement
			
			String sql = "update Employee set name = ?, salary = ?, email = ?, address = ? where id = ?";
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, emp.getName());
			pStmt.setInt(2, emp.getSalary());
			pStmt.setString(3, emp.getEmail());
			pStmt.setString(4, emp.getAddress());
			pStmt.setInt(5, emp.getId());
			
			int i = pStmt.executeUpdate();
			
			if(i>0)
				System.out.println("=="+emp.getName()+" Updated: "+i+"==");
			else
				System.out.println("Insertion Failure");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void deleteEmployee(int id){
		try {
			// 3. Write SQL Statement
			
			String sql = "delete from Employee where id = ?";
			
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1,id);
			
			int i = pStmt.executeUpdate();
			
			if(i>0)
				System.out.println("==Employee Deleted: "+i+"==");
			else
				System.out.println("Insertion Failure");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public ArrayList<Employee> retieveEmployees(){
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		try {
			
			// 3. Write SQL Statement
			String sql = "select * from Employee";
			pStmt = con.prepareStatement(sql);
			
			ResultSet rs = pStmt.executeQuery();
			int i=0,s=0;
			String n="",e="",a="";
			
			while(rs.next()){
				
				i = rs.getInt(1);
				n = rs.getString(2);
				s = rs.getInt(3);
				e = rs.getString(4);
				a = rs.getString(5);
				
				Employee emp = new Employee(i,n,s,e,a);
				//System.out.println(emp); 
				//System.out.println("===============================================================");
				empList.add(emp);
			}
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return empList;
	}
	
	//5. Close the Connection
	public void closeConnection(){
		try {
			con.close();
			System.out.println("==Connection Closed==");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
}
