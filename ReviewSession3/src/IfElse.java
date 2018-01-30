
public class IfElse {

	public static void main(String[] args) {
		
		int balance = 10000;
		int minBalance = 3000;
		int amtToWithdraw = 8000;
		
		int trancation = balance - amtToWithdraw;
		
		if(trancation > minBalance){
			System.out.println("Withdraw Done");
		}else{
			System.out.println("Withdraw Cannot be Done");
		}
		
		int a = 100;
		int b = 100;
		int c = 100;
		
		if(a>b){
			if(a>c){
				System.out.println("a is greatest");
			}else{
				System.out.println("c is greatest");
			}
		}else{
			if(b>c){
				System.out.println("b is greatest");
			}else{
				System.out.println("c is greatest");
			}
		}
		
		int ph = 30;
		int ch = 20;
		int mt = 10;
		
		int avg = (ph+ch+mt)/3;
		
		System.out.println(avg);

		if(avg >= 80){
			System.out.println("Grade A");
		}else if(avg>=70 && avg<80){
			System.out.println("Grade B");
		}else if(avg>=60 && avg<70){
			System.out.println("Grade C");
		}else if(avg>=50 && avg<60){
			System.out.println("Grade D");
		}else if(avg>=40 && avg<50){
			System.out.println("Grade E");
		}else{
			System.out.println("Grade F");
		}
		
		
		char chr = 'a';
		char ch1 = 'e';
		
		switch(ch1){
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e':
			System.out.println("e is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		}
		
		switch(chr){
			case 'a':
				System.out.println("a is a vowel");
				break;
			case 'e':
				System.out.println("e is a vowel");
				break;
			case 'i':
				System.out.println("i is a vowel");
				break;
			case 'o':
				System.out.println("o is a vowel");
				break;
			case 'u':
				System.out.println("u is a vowel");
				break;
			default :
				System.out.println("Consonent");
				break;
		}
		
	}

}
