
public class Loops {

	public static void main(String[] args) {

		int num = 5;
		int i = 100;
		/*System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));*/
		
		while(i<=10){ // Entry Control Loop
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}
		
		System.out.println("---------------------");
		
		num = 7;
		i = 100;
		
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}while(i<=10);  // Exit Control Loop
		
		System.out.println("---------------------");
		
		num = 9;
		for(int j=1;j<=10;j++){
			System.out.println(num+" "+j+"'s are "+(num*j));
		}
		
		System.out.println("---------------------");
		
		num = 11;
		i = 1;
		//for(i=1;i<=10;i++){
		for(;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
		
		System.out.println("---------------------");
		
		// Nesting of Loops
		outer:
		for(int p=1;p<=5;p++){
			System.out.println("p is: "+p);
			inner:
			for(int q=1;q<=5;q++){
				if(p==2 && q==3){
					break outer;
				}
				System.out.print(q+"  ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------------");
		
		for(int p=1;p<=5;p++){
			/*if(p>2){
				break;
			}else{
				System.out.print(p+" ");
			}*/
			
			if(p<3){
				continue;
			}
			
			System.out.print(p+"  ");
		}

	}

}
