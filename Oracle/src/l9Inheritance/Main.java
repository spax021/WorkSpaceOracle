package l9Inheritance;

import java.lang.*;

public class Main {

	public static void main(String[] args) {
		
		Bicycle bike1, bike2, bike3, bike11;
		
		bike1 = new Bicycle(10, 20, 30);
		bike11 = new Bicycle(10, 20, 30);
		bike2 = new MountainBike(20, 30, 40, 50, "Dual");
		bike3 = new RoadBike(30, 40, 50, 60);
		
		MountainBike bike4 = new MountainBike(10, 10, 10, 10, "front");
		
		bike1.printDescription();
		System.out.println();
		bike2.printDescription();
		System.out.println();
		bike3.printDescription();
		System.out.println();
		bike4.printDescription();
		
		if(bike1.equals(bike11))
			System.out.println("True");
		else
			System.out.println("False");
	
		System.out.println();
		System.out.println(bike11.toString());
		
	}

}
