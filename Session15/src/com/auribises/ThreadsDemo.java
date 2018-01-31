package com.auribises;

/*class MyJob{
	void executeJob(){
		for(int i=1;i<=10;i++){
			System.out.println("**MyJob** "+i);
		}
	}
}*/

class MyJob extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			System.out.println("**MyJob** "+i);
		}
	}
}

class A{
	
}

class YourJob extends A implements Runnable{
	public void run(){
		
		Thread.yield();
		
		for(int i=1;i<=10;i++){
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			System.out.println("##YourJob## "+i);
		}
	}
}

public class ThreadsDemo {

	// Execution Context
	public static void main(String[] args) {
		System.out.println("Main Started");

		MyJob mRef = new MyJob();
		//YourJob yRef = new YourJob();
		//mRef.executeJob();
		
		Runnable r = new YourJob();
		Thread th = new Thread(r);
		
		mRef.setPriority(Thread.MAX_PRIORITY);
		th.setPriority(Thread.MIN_PRIORITY);
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		
		
		//mRef.setDaemon(true);
		mRef.start();
		
		/*try {
			mRef.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		//yRef.start();
		th.start();
		
		for(int i=1;i<=10;i++){
			
			/*try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			
			System.out.println("==Main Thread== "+i);
		}
		
		mRef.setName("Alpha");
		th.setName("Beta");
		Thread.currentThread().setName("Charlie");
		
	
		
		System.out.println("mRef Name "+mRef.getName());
		System.out.println("th Name "+th.getName());
		System.out.println("Main Name "+Thread.currentThread().getName());
		
		
		System.out.println("mRef Priority "+mRef.getPriority());
		System.out.println("th Priority "+th.getPriority());
		System.out.println("Main Priority "+Thread.currentThread().getPriority());
		
		System.out.println("Main Finished");
	}

}
