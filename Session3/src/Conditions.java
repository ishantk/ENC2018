public class Conditions {

	public static void main(String[] args) {
		
		System.out.println("Welcome");

		// Single Value Container | Pritive Types
		int a = 200;
		int b = 200;
		int c = 200;
		
		boolean isInternetConnected = true;
		boolean isGPSConnected = true;
		
		/*if(a>b){
			System.out.println("a is greatest: "+a);
		}else{
			System.out.println("b is greatest: "+b);
		}
		
		if(isInternetConnected){
			System.out.println("Please continue");
		}else{
			System.out.println("Please connect to Internet and Try Again");
		}*/
		
		// Nested if/else
		if(a>b){
			if(a>c){
				System.out.println("a is greatest: "+a);
			}else{
				System.out.println("c is greatest: "+c);
			}
		}else{
			if(b>c){
				System.out.println("b is greatest: "+b);
			}else{
				System.out.println("c is greatest: "+c);
			}
		}
		
		if(isInternetConnected){
			System.out.println("Please continue");
		}else{
			System.out.println("Please connect to Internet and Try Again");
		}

		if(isInternetConnected && isGPSConnected){
			
		}else{
			
		}
		
		if(!isGPSConnected){
			
		}
		
		int ph = 80;
		int ch = 70;
		int mt = 90;
		
		int avg = (ph+ch+mt)/3;
		
		if(avg >= 80){
			System.out.println("Grade A is awarded : "+avg);
		}else if(avg >=70 && avg<80){
			System.out.println("Grade B is awarded: "+avg);
		}else if(avg >=60 && avg<70){
			System.out.println("Grade C is awarded: "+avg);
		}else if(avg >=50 && avg<60){
			System.out.println("Grade D is awarded: "+avg);
		}else{
			System.out.println("Grade E is awarded: "+avg);
		}
		
		final int microCab = 1;
		final int miniCab = 2;
		final int auto = 3;
		final int bike = 4;
		final int outStation = 5;
		
		int cab = miniCab;
		
		switch(cab){
		
			case microCab:
				System.out.println("You have booked a micro cab");
				break;

			case miniCab:
				System.out.println("You have booked a mini cab");
				//break;
				
			case auto:
				System.out.println("You have booked an auto");
				break;
				
			case bike:
				System.out.println("You have booked a bike");
				break;
				
			case outStation:
				System.out.println("You have booked an outstation cab");
				break;
				
			default:
				System.out.println("Please select a cab");
				break;
		
		}
		
	}

}
