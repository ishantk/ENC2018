class Student{
	int rollNum;
	String name;
	char gender;
	int age;
	String address;
}

public class ArrayOfObjects {

	public static void main(String[] args) {
		
		Student s1;
		Student s2;
		Student s3;
		
		s1 = new Student();
		s2 = new Student();
		s3 = new Student();
		
		Student[] stArr = new Student[3];
		stArr[0] = new Student();
		stArr[1] = new Student();
		stArr[2] = new Student();
		
		stArr[0].name = "John";
		stArr[1].name = "Jennie";
		stArr[2].name = "Jack";
		
		/*int i1;
		int i2;
		int i3;
		
		i1 = 10;
		i2 = 20;
		i3 = 30;
		
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;*/

	}

}
