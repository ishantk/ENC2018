class Outer{
	
	void show(){
		System.out.println("Show of Outer Object");
	}
	
	class Inner{
		
		void show(){
			System.out.println("Show of Inner Object");
		}
		
	}
}


public class NestingOfObjects {

	public static void main(String[] args) {

		Outer out = new Outer();
		Outer.Inner inner = out.new Inner();
		
		Outer out1 = new Outer();
		Outer.Inner inner1 = out1.new Inner();
		
	}

}
