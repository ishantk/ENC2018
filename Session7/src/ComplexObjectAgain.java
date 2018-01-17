class Employee{
	
	int eid;
	String name;
	int salary;
	String email;
	String compName;
	
	Certificate[] certis; // Array of Reference Variables
	
	
	void showEmployeeDetails(){
		System.out.println(name+" is working with "+compName);
		
		System.out.println(name+" has  "+certis.length+" certificates: ");
		for(int i=0;i<certis.length;i++){
			certis[i].showCertificateDetails();
		}
	}
}

class Certificate{
	int cid;
	String cname;
	
	void showCertificateDetails(){
		System.out.println(cid+" is "+cname);
	}
}

public class ComplexObjectAgain {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.eid = 1101;
		e1.name = "John Watson";
		e1.compName = "Auribises";
		e1.salary = 30000;
		e1.email = "john@auribises.com";
		
		
		Certificate c1 = new Certificate();
		Certificate c2 = new Certificate();
		Certificate c3 = new Certificate();
		
		c1.cid = 20012;
		c1.cname = "OCJP";
		
		c2.cid = 321452;
		c2.cname = "CCNA";
		
		c3.cid = 43567;
		c3.cname = "AWS";
		
		int[] arr = new int[5];
		
		// Array of Objects:
		Certificate[] cArr = new Certificate[3];
		cArr[0] = c1;
		cArr[1] = c2;
		cArr[2] = c3;
		
		e1.certis = cArr;
		
		e1.showEmployeeDetails();
	}

}
