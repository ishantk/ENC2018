class Point{
	
	private int x;
	private int y;
	
	private static int z;
	
	void show(){
		System.out.println("Point is: "+x+" : "+y+" : "+z);
	}
	
	static void showAgain(){
		System.out.println("z is: "+z);
	}
	
	void setPoint(int p, int q){
		x = p;
		y = q;
	}
	
	void setX(int p){
		x = p;
	}
	
	void setY(int q){
		y = q;
	}
	
	static void setZ(int a){
		z = a;
	}
}


public class PrivateDemo {

	public static void main(String[] args) {
		
		int i = 10;
		Point p1 = new Point();

		System.out.println("i is: "+i);
		System.out.println("p1 is: "+p1);
		
		//p1.x = 10;
		//p1.y = 20;
		
		//p1.setPoint(10, 20);
		p1.setX(10);
		p1.setY(20);
		
		p1.show();
		
		//Point.z = 100;
		Point.setZ(100);
	}

}
