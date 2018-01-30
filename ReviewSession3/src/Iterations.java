
public class Iterations {

	public static void main(String[] args) {
		
		int num = 5;
		int i = 1;
		
		/*System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i = i+1;
		System.out.println(num+" "+i+"'s are "+(num*i));*/
		
		
		while(i<=10){ // Entry Control Loop
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}
		
		System.out.println("===================");
		
		num = 7;
		i = 1;
		
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}while(i<=10); // Exit Control Loop

		System.out.println("===================");
		
		num = 9;
		for(int j=1;j<=10;j++){
			System.out.println(num+" "+j+"'s are "+(num*j));
		}
		
		System.out.println("===================");
		
		for(int p=1;p<=5;p++){
			for(int q=1;q<=p;q++){
				System.out.print(q+"  ");
			}
			System.out.println();
		}
	}

}
