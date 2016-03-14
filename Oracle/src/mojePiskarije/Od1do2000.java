package mojePiskarije;
import java.util.Random;
import java.util.Scanner;

public class Od1do2000 {
	
	private static Scanner input = new Scanner(System.in);
	private static Random random = new Random();
	
	static int i = random.nextInt(2000);
	static int unos;
	static int brojac = 0;
	static boolean pogodio = false;
	
	private static void ispisNo(){
		System.out.println("Program je sam generisao broj izmedju 1 i 2000");
		System.out.println("Kad upisete broj i stisnete Enter, program ce Vam reci");
		System.out.println("da li je broj manji ili veci.");
		System.out.println("Imate 20 pokusaja da pogodite taj broj, srecno!");
	}
	
	private static void ispisYes(){
		System.out.println("Program je sam generisao broj izmedju 1 i 2000");
		System.out.println("Kad upisete broj i stisnete Enter, program ce Vam reci");
		System.out.println("da li je broj manji ili veci.");
		System.out.println("Imate 10 pokusaja da pogodite taj broj, srecno!");
	}
	
	private static void ispisVeci(){
		brojac();
		System.out.println("Broj je veci od upisanog");
	}
	
	private static void ispisManji(){
		brojac();
		System.out.println("Broj je manji od upisanog");
	}
	
	private static void brojac(){
		System.out.println(brojac + ". pokusaj");
	}
	
	private static void proveraNo(){
		
		do{
			brojac++;
			System.out.print("Vas broj: ");
			unos = input.nextInt();
			System.out.println();
			
			if(brojac == 20){
				pogodio = true;
				System.out.println("Zao mi je niste uspeli, trazeni broj je bio: " + i);
			}
			else if(i == unos){
				pogodio = true;
				System.out.println("Trazeni broj je: " + unos + " Svaka cast!");
			}
			else if(i > unos){
				ispisVeci();
			}
			else{
				ispisManji();
			}
			
			}while(!pogodio);
	}
	
	private static void proveraYes(){
		
		do{
			brojac++;
			System.out.print("Vas broj: ");
			unos = input.nextInt();
			System.out.println();
			
			if(brojac == 10){
				pogodio = true;
				System.out.println("Zao mi je niste uspeli, trazeni broj je bio: " + i);
			}
			else if(i == unos){
				pogodio = true;
				System.out.println("Trazeni broj je: " + unos + " Svaka cast!");
			}
			else if(i > unos){
				ispisVeci();
			}
			else{
				ispisManji();
			}
			
			}while(!pogodio);
	}
	
	private static void proveraLucky(){
		
		String lucky;
		
		System.out.print("Do you feel lucky? [yes/no]");
		lucky = input.nextLine();
		
		if(lucky.equalsIgnoreCase("yes")){
			ispisYes();
			proveraYes();
		}
		else{
			ispisNo();
			proveraNo();
		}
	}
	public static void main(String[] args) {
		
		proveraLucky();
		
	}

}
