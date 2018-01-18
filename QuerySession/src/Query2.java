class Student{
	int roll;
	String name;
	int age;
	int std;
	
	void showStudent(){
		System.out.println("Name: "+name);
	}
}


public class Query2 {

	public static void main(String[] args) {
		
		/*int hi = 90;
		int eng;
		int mat;
		int sci;
		int spo = 80;
		
		int[] subjectMarks = new int[5];
		subjectMarks[0] = 90;
		//...
		subjectMarks[4] = 80;*/
		//int[] subjectMarks = {90,60,70,80,80}; // Multi Value Container
		// Which is containing Single Values
		
		Student s1,s2,s3,s4,s5;
		
		s1 = new Student();
		
		s2 = new Student();
		
		s3 = new Student();
		s4 = new Student();
		s5 = new Student();
		
		Student[] stuArr = new Student[5]; // Array of Reference Variables
		
		stuArr[0] = new Student();
		stuArr[1] = new Student();
		stuArr[2] = new Student();
		stuArr[3] = new Student();
		stuArr[4] = new Student();
		
		
		stuArr[0].name = "John";
		stuArr[1].name = "Jennie";
		stuArr[2].name = "Jim";
		stuArr[3].name = "Jack";
		stuArr[4].name = "Joe";
		
		for(Student s : stuArr){
			s.showStudent();
		}
		
	}

}
