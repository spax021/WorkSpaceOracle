package l6Objects;

import java.util.Random;

public class Main {
//	Consider the following class:
    public static int x = 7; 
    public int y = 3; 
	
//    What are the class variables?  	PUBLIC STATIC INT X
//    What are the instance variables?	PUBLIC INT Y
    
   public static void main(String[] args) {
//		What is the output from the following code:
//	   Main a = new Main();
//	   Main b = new Main();
//	   a.y = 5;
//	   b.y = 6;
//	   a.x = 1;
//	   b.x = 2; //HERE X BECOMES STATIC FOR THE WHOLE CLASS AND EVERY X EVER INVOKED
//	   System.out.println("a.y = " + a.y);	//5
//	   System.out.println("b.y = " + b.y);	//6
//	   System.out.println("a.x = " + a.x);	//2
//	   System.out.println("b.x = " + b.x);	//2
//	   System.out.println("Main.x = " + Main.x);//2
	   
	   
	   
//	   Random random = new Random();	//izvuci jednu kartu
//	   int znak = random.nextInt(3);
//	   int broj = random.nextInt(12);
//	   Karta karta = new Karta(znak, broj);
	   
	   Spil spil = new Spil();
	   spil.pokaziSpil();
	   
	}

}
