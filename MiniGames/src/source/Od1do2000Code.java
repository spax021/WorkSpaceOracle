package source;

import java.util.Random;
import java.util.Scanner;

public class Od1do2000Code {
	private static Scanner input = new Scanner(System.in);
	private static Random random = new Random();

	private int i = random.nextInt(2000);
	private int unos;
	private int brojac = 0;
	private boolean pogodio = false;

	public void ispis() {
		System.out.println("Program automatically generates number betwen 1 and 2000");
		System.out.println("Try to guess the number. After every entry, program will");
		System.out.println("tell you if the number is greater or less than entered");
		}

	private void yes(){
		System.out.println("You have 10 tryouts to guess, good luck!");
	}
	
	private void no(){
		System.out.println("You have 20 tryouts to guess, good luck!");
	}

	private void brojac() {
		System.out.println(brojac + ". try");
	}
	
	private void ispisVeci() {
		brojac();
		System.out.println("Number is greater than entered");
	}

	private void ispisManji() {
		brojac();
		System.out.println("Number is less than entered");
	}

	private void proveraNo() {

		do {
			System.out.print("Your number is: ");
			unos = input.nextInt();
			System.out.println();

			if(unos < 0 || unos > 2000){
				System.out.println("Number is out of range, we forgive this count, be careful.");
			}else{
				brojac++;
				if (brojac == 20) {
					pogodio = true;
					System.out.println("We are sorry, number was: "+ i);
				} else if (i == unos) {
					pogodio = true;
					System.out.println("Number is: " + unos + " Congratulations!");
				} else if (i > unos) {
					ispisVeci();
				} else {
					ispisManji();
				}
			}
		} while (!pogodio);
	}

	private void proveraYes() {

		do {
			System.out.print("Your number is: ");
			unos = input.nextInt();
			System.out.println();

			if(unos < 0 || unos > 2000){
				System.out.println("Number is out of range, we forgive this count, be careful.");
			}else{
				brojac++;
				if (brojac == 10) {
					pogodio = true;
					System.out.println("We are sorry, number was: "+ i);
				} else if (i == unos) {
					pogodio = true;
					System.out.println("Number is: " + unos + " Congratulations!");
				} else if (i > unos) {
					ispisVeci();
				} else {
					ispisManji();
				}
			}
		} while (!pogodio);
	}

	public void proveraLucky() {

		String lucky;
		boolean entry = false;
		do{
			System.out.print("Do you feel lucky? [yes/no]");
			lucky = input.nextLine();
			
			if (lucky.equalsIgnoreCase("yes") || lucky.equalsIgnoreCase("y")) {
				entry = true;
				yes();
				proveraYes();
			} 
			else if(lucky.equalsIgnoreCase("no") || lucky.equalsIgnoreCase("n")){
				entry = true;
				no();
				proveraNo();
			}
			else{
				System.out.println("Invalid entry, you can try with only first letter...");
			}			
		}while(!entry);
	}
}
