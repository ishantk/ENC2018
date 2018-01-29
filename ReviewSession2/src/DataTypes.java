
public class DataTypes {

	public static void main(String[] args) {
		
		int i = 10; // 32 bits
		byte b = 8; // 8 bits
		
		long num = 99l;
		
		short s = 10;
		
		System.out.println("i is: "+i);
		System.out.println("b is: "+b);
		
		
		float f = 2.2f;
		double d = 2.2;
		
		//char ch = 'A';
		//char ch = '1';
		//char ch = 65; // ASCII Code
		char ch = '\u20b9';
		System.out.println("ch is: "+ch);
		
		boolean flag = true;
		flag = false;
		
		String str = "Hello";
		System.out.println("str is: "+str);

		int i1 = 10;
		long l1 = i1;  // Upcasting
		
		long l2 = 10;
		int i2 = (int)l2; // Downcasting
		
		byte b1 = (byte)256;
		System.out.println("b1 is: "+b1);
		
	}

}
