class Library{
	
	// Attribute
	String name;
	int bookCount;
	Faculty faculty;
	Book[] books;
	
	void showLibraryDetails(){
		System.out.println(name+" Library has "+bookCount+" books");
		System.out.println("****************");
		faculty.showFacultyDetails();
		System.out.println("****************");
		for(Book b : books){
			b.showBookDetails();
			System.out.println("-----------------");
		}
	}
	
}

class Faculty{
	
	// Attributes
	private String name;
	private String email;
	private int age;
	
	void showFacultyDetails(){
		System.out.println(name+" is "+age+" years old and can be emailed at "+email);
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}
	
	
}

class Book{
	
	// Attributes
	String name;
	int bookNum;
	String author;
	
	void showBookDetails(){
		System.out.println(bookNum+" is "+name+" written by "+author);
	}
}


public class OneToMany {

	public static void main(String[] args) {

		Faculty f1 = new Faculty(); // Object
		
		// Write the data in Object
		/*f1.name = "John";
		f1.email = "john@example.com";
		f1.age = 30;*/
		
		f1.setName("John");
		f1.setEmail("john@example.com");
		f1.setAge(30);
		
		//f1.showFacultyDetails();
		//System.out.println(f1.getName());
		
		Book[] bkArr = new Book[5];
		
		// 5 objects of type Book are created
		for(int i=0;i<bkArr.length;i++){
			bkArr[i] = new Book();
		}
		
		bkArr[0].bookNum = 101;
		bkArr[0].name = "Programming With Java";
		bkArr[0].author = "Jennie";
		
		bkArr[1].bookNum = 102;
		bkArr[1].name = "Programming With Python";
		bkArr[1].author = "Jack";
		
		bkArr[2].bookNum = 103;
		bkArr[2].name = "Programming With Swift";
		bkArr[2].author = "Jim";
		
		bkArr[3].bookNum = 104;
		bkArr[3].name = "Programming With Perl";
		bkArr[3].author = "Joe";
		
		bkArr[4].bookNum = 105;
		bkArr[4].name = "Programming With Ruby";
		bkArr[4].author = "Jimmy";
		
		
		Library lib = new Library();
		lib.name = "Common Students";
		lib.bookCount = bkArr.length;
		lib.faculty = f1; // reference copy
		lib.books = bkArr; // reference copy
		
		lib.showLibraryDetails();
		
		
	}

}
