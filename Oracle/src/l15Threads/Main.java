package l15Threads;

public class Main {

	public static void main(String[] args) {
		
		//this is how you make object thread
		//class name, name = new object(new object from class where the thread is(argument));
		Thread t1 = new Thread(new Niti("Spale"));
		Thread t2 = new Thread(new Niti("Cvija"));
		Thread t3 = new Thread(new Niti("Sima"));
		Thread t4 = new Thread(new Niti("Bane"));
		
//		Threads are sometimes called lightweight processes
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}

}