package l10Numbers;

import static java.lang.Math.*;

public class BeyondBasic {

	public static void main(String[] args) {
		//Moj kod
		int angle = 180;
		double something = 25.03;
		
		System.out.println(sin(angle));
		System.out.println(abs(something));
		System.out.println(floor(something));
		System.out.println(round(something));
		System.out.println(sin(something));
		System.out.println("\n");
		
		int i = 3;
		System.out.println("3 na 2 " + pow(i, 2));
		System.out.println("3 na 3 " + pow(i, 3));
		System.out.println("3 na 4 " + pow(i, 4));
		System.out.println("3 na 5 " + pow(i, 5));
		System.out.println("3 na 6 " + pow(i, 6));
		
		System.out.println("\n");
		
		double o = Math.random();
		int p = (int) (o * 10);
		System.out.printf("random() broj je: %.2f%n", o);
		System.out.println("random() * 10: " + p);
		
		System.out.println("\n");
		//Oracle
		double a = -191.635;
        double b = 43.74;
        int c = 16, d = 45;

        System.out.printf("The absolute value " + "of %.3f is %.3f%n", 
                          a, Math.abs(a));

        System.out.printf("The ceiling of " + "%.2f is %.0f%n", 
                          b, Math.ceil(b));

        System.out.printf("The floor of " + "%.2f is %.0f%n", 
                          b, Math.floor(b));

        System.out.printf("The rint of %.2f " + "is %.0f%n", 
                          b, Math.rint(b));

        System.out.printf("The max of %d and " + "%d is %d%n",
                          c, d, Math.max(c, d));

        System.out.printf("The min of of %d " + "and %d is %d%n",
                          c, d, Math.min(c, d));
		
		
	}

}
