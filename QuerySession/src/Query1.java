
public class Query1 {
	
	
	int addNums1(int n1, int n2){
		int n3 = n1+n2;
		System.out.println("Sum of "+n1+" and "+n2+" is "+n3);
		return n3;
	}
	
	float calArea(int radius){
		return 3.14F * radius * radius;
	}
	
	static void addNums2(int n1, int n2){ // passing the value
		int n3 = n1+n2;
		System.out.println("Sum of "+n1+" and "+n2+" is "+n3);
	}
	
	int getMaxPopulation(int[] pop){ // Passing the reference
		
		int max = 0;
		
		System.out.println("pop is: "+pop);
		System.out.println("pop length is: "+pop.length);
		
		//int i = 0;
		for(int elm : pop){
			System.out.println(elm);
			//i++;
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		Query1 q1 = new Query1();
		int result = q1.addNums1(10, 21);
		
		if(result%2==0){
			System.out.println("Its an Even Result");
		}else{
			System.out.println("Its an Odd Result");
		}
		
		Query1.addNums2(30, 40);
		
		int[] population = {1234,1213,6434,4547,74332,1235,2356,344,1345};
		int[] a1 = {1234,1213,643423,12,43,12,34,62,12};
		
		System.out.println("population is: "+population);
		System.out.println("population length is: "+population.length);
		
		int max = q1.getMaxPopulation(population);
		System.out.println("Max Population is at index: "+max);
		
		max = q1.getMaxPopulation(a1);
		System.out.println("Max Population is at index: "+max);
	}

}
