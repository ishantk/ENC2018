class WhatsApp{
	
	String status;
	static String groupTitle;
	
	void showDetails(){
		System.out.println("status is: "+status);
		System.out.println("groupTitle is: "+groupTitle);
		
	}
}


public class StaticAgain {

	public static void main(String[] args) {
		
		WhatsApp user1 = new WhatsApp();
		WhatsApp user2 = new WhatsApp();
		WhatsApp user3 = new WhatsApp();
		
		user1.status = "Be Exceptional!!";
		user2.status = "Work Hard and get Luckier!!";
		user3.status = "Nothing!!";
		
		user1.groupTitle = "Auribises";
		user2.groupTitle = "Educational Group";
		
		user1.showDetails();
		user2.showDetails();
		user3.showDetails();

	}

}
