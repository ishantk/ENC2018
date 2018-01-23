package com.auribises;

interface DataPlan{
	void setDataPlan();
	void showDataPlan();
}

class DataPlan2G implements DataPlan{
	
	int price;
	int data;
	
	public void setDataPlan(){
		price = 200;
		data = 3;
	}
	
	public void showDataPlan(){
		System.out.println(data+"GB, 2G data is avaliable for \u20b9"+price);
	}
}

class DataPlan3G implements DataPlan{
	
	int price;
	int data;
	
	public void setDataPlan(){
		price = 300;
		data = 5;
	}
	
	public void showDataPlan(){
		System.out.println(data+"GB, 3G data is avaliable for \u20b9"+price);
	}
}

class DataPlan4G implements DataPlan{
	
	int price;
	int data;
	
	public void setDataPlan(){
		price = 500;
		data = 10;
	}
	
	public void showDataPlan(){
		System.out.println(data+"GB, 4G data is avaliable for \u20b9"+price);
	}
}

class PlanFactory{
	
	static DataPlan getPlan(int type){
		
		DataPlan dp = null;
		
		switch(type){
			case 2:
				dp = new DataPlan2G();
				break;
				
			case 3:
				dp = new DataPlan3G();				
				break;
				
			case 4:
				dp = new DataPlan4G();
				break;
		}
		
		dp.setDataPlan();
		return dp;
		
	}
	
}

public class FactoryDemo {

	public static void main(String[] args) {
		
		/*DataPlan dp = PlanFactory.getPlan(2);
		dp.showDataPlan();
		
		dp = PlanFactory.getPlan(3);
		dp.showDataPlan();
		
		dp  = PlanFactory.getPlan(4);
		dp.showDataPlan();*/
		
		PlanFactory.getPlan(2).showDataPlan();
		PlanFactory.getPlan(3).showDataPlan();
		PlanFactory.getPlan(4).showDataPlan();
	}

}
