package com.auribises;

public class App {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setRoll(1);
		s1.setName("Sia");
		s1.setAge(27);
		s1.setAddress("Country Homes");

		Student s2 = new Student(6, "George Watson", 37, "Eastern Shores");
		
		System.out.println(s1);
		System.out.println("----------------------------------------------------------");
		System.out.println(s2);
		
		//1. Load the Driver
		JDBCHelper helper = new JDBCHelper();
		
		//2. Open the Connection
		helper.openConnection();
		
		//3. Write SQL Statement
		//4. Execute SQL Statement
		
		//helper.insertStudent(s1);
		//helper.insertStudent(s2);
		
		//helper.retrieveStudents();
		
		//helper.updateStudent(s2);
		
		helper.deleteStudent(3);
		helper.deleteStudent(5);
		
		//5. Close the Connection
		helper.closeConnection();
		
	}

}
