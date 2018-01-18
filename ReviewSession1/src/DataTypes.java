public class DataTypes {

	public static void main(String[] args) {
		
		System.out.println("This is Awesome");
		
		int n1 = 10;
		int n2 = 20;
		int n3 = n1+n2;
		
		System.out.println("n3 is: "+n3);
		
		byte a = 10;
		
		short s = 10;
		
		int i = 100;
		
		long l = 200L;
		
		a = 20;
		
		byte age = (byte)129;
		System.out.println("age is "+age);
		
		a = (byte)i; // downcasting
		
		// int num = 10,20; error
		
		float f = 2.2f;
		double d = 2.2;
		
		//float f1 = 2.2f,2.3f; error
		
		char ch = 'A';
		System.out.println(ch);
		ch = 66;
		System.out.println(ch);
		ch = '\u0916';
		System.out.println(ch);
		
		boolean flag = true;
		flag = false;
		
		String str = "Hello";
		
	}

}
