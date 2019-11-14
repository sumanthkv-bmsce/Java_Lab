import java.util.*;

class NewThread implements Runnable{
	Thread t;
	
	NewThread(String name){
		t = new Thread(this, name);
	}
	
	public void run(){
		try{
			for(int i = 0;i< 10;i++){
				System.out.println("BMS College of Engineering");
				Thread.sleep(10000);
			}
		} catch(InterruptedException e){
			System.out.println("Child Thread interrupted.");
		}
		System.out.println("Exiting " + t);
	}
}

class ThreadMain{
	public static void main(String arg[]){
		NewThread nt = new NewThread("Bms Thread");
		nt.t.start();
		
		try{
			for(int i = 0;i< 10;i++){
				System.out.println("CSE");
				Thread.sleep(2000);
			}
		} catch(InterruptedException e){
			System.out.println("Main thread existing");
		}
		System.out.println("Main Thread exiting.");
	}
} 
		
