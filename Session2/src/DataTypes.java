
public class DataTypes {

	public static void main(String[] args) {
		
		System.out.println("Be Exceptional !!");

		byte age = (byte)255; // DownCasting
		short s = 200;
		int i = 1000;
		long l = 12456000000l;
		int a = 10;
		
		int num = -120;
		
		int n1 = (int)l;  // DownCasting | Thr might be loss of data
		
		
		long n2 = num;
		
		System.out.println("age is: "+age);
		System.out.println("s"+s);
		System.out.println("i is: "+i);
		System.out.println("l is: "+l);
		
		
		float f = 2.2f;
		double d = 2.2;
		
		System.out.println("f is: "+f);
		System.out.println("d is: "+d);
		
		char ch = 'A';
		ch = 67;
		ch = '\u0907';
		System.out.println("ch is: "+ch);
		
		
		boolean flag = true;
		flag = false;
		
		// errors : because SINGLE VALUE CONTAINERS | Primitive
		//int p = 10,20;
		//char cr = 'AB';
		
		// Multi Values Container |  Non Primitive |  Reference Type
		String name = "John Watson";
		
		System.out.println("Work Hard and Get Luckier !!");
		
	}

}
