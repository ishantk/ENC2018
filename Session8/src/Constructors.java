class Student{
	
	// Attributes
	int roll;
	String name;
	char gender;
	
	// Methods
	
	// Default Constructor
	Student(){
		System.out.println("Construtor is Executed");
		roll = 0;
		name = "NA";
		gender = 'U';
	}
	
	// Paremetrized or Argument or Inputs Constructor
	Student(int r, String n, char g){
		System.out.println("Construtor is Executed");
		roll = r;
		name = n;
		gender = g;
	}
	
	
	void showStudentDetails(){
		System.out.println(roll+" belongs to "+name+" with gender "+gender);
	}
	
}

class PaintWindow{
	int width;
	int height;
	
//	PaintWindow(){
//		width = 1280;
//		height = 1024;
//	}
	
	void showDetails(){
		System.out.println("Width: "+width+" Height: "+height);
	}
}


public class Constructors {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.roll = 101;
		s1.name = "John";
		s1.gender = 'M';
		
		Student s2 = new Student(102,"Jennie",'F');
		
		s1.showStudentDetails();
		s2.showStudentDetails();
		
		PaintWindow window1 = new PaintWindow();
		window1.showDetails();

	}

}
