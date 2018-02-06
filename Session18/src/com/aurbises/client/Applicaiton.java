package com.aurbises.client;

import java.util.ArrayList;

import com.aurbises.model.Employee;
import com.auribises.db.JDBCHelper;

public class Applicaiton {

	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		e1.setId(5);
		e1.setName("Mike Watson");
		e1.setEmail("mike.w@example.com");
		e1.setSalary(67700);
		e1.setAddress("Country Homes South");
		
		System.out.println(e1);
		
		// 1. Load The Driver
		JDBCHelper helper = new JDBCHelper();
		// 2. Create the Connection
		helper.openConnection();
		// 3. 4. Write and Execute SQL Statement
		//helper.insertEmployee(e1);
		
		//helper.updateEmployee(e1);
		
		//helper.deleteEmployee(5);
		
		ArrayList<Employee> empList = helper.retieveEmployees();
		
		for(Employee e : empList){
			System.out.println(e);
		}
		
		// 5. Close the Connection
		helper.closeConnection();
	}

}
