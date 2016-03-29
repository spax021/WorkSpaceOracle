package l15Threads;

import java.util.*;
//Runnable interface contains run() method, 
public class Niti implements Runnable { //if you want thread to be working, you need to implement it with Runnable

	String name;
	int time;
	Random r = new Random();
	
	public Niti(String s){
		this.name = s;
		//in threads, there is no seconds, only miliseconds
		this.time = r.nextInt(20000);
	}
	
	public void run(){
		try{
//			System.out.println(name + " is sleaping for " + time);
			Thread.sleep(time);								//if you want to display seconds, divide with 1000
			System.out.println(name + " was sleeping for " + (time/1000) + " seconds");
		}catch(Exception e){}
	}
}
