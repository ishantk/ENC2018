class WhatsAppGroup{
	
	static String groupTitle;
	static int participants;
	
	void showGroupDetails(){
		System.out.println(groupTitle+" has "+participants+" participants");
	}
	
}

public class WhatsAppDemmo {

	public static void main(String[] args) {
		
		WhatsAppGroup group1 = new WhatsAppGroup();
		WhatsAppGroup group2 = new WhatsAppGroup();
		WhatsAppGroup group3 = new WhatsAppGroup();
		
		//WhatsAppGroup group4 = group1;
		
		group1.groupTitle = "Auribises CMP";
		group1.participants = 25;
		
		group2.groupTitle = "Auribises AI";
		group2.participants = 35;
		
		group3.groupTitle = "Auribises CC";
		group3.participants = 45;
		
		group1.showGroupDetails();
		group2.showGroupDetails();
		group3.showGroupDetails();
		//group4.showGroupDetails();
		
		

	}

}
