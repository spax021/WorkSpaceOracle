package source;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsCode {

	private static Scanner input = new Scanner(System.in);
	private Random random = new Random();

	private String compChoice;
	private int compWin = 0;
	private int userWin = 0;
	
	public void gameName() {
		System.out.println("Rock, Paper and Scissors");
	}

	public void choiceText() {
		System.out.println("Option 1: Lets remind our selfs with the rules...");
		System.out.println("Option 2: Lets play...");
		System.out.print("You chose: ");
	}
	
	public void score(){
		System.out.println("Score is - You: " + userWin + " Computer: " + compWin);
	}
	
	public void rules() {
		System.out.println("Rules are underconstruction...");
	}
	//part where computer is chosing his weapon
	public void compChoice(){
		int choice = random.nextInt(3);

		if (choice == 0) {
			compChoice = "rock";
		} else if (choice == 1) {
			compChoice = "paper";
		} else {
			compChoice = "scissors";
		}
	}
	
	// actual game engine, comparing and counting wins
	public void game() {
		String userChoice;
		boolean win = false;
		
		do {
			//invoking method for computer
			compChoice();
			
			System.out.print("Chose your weapon: ");
			userChoice = input.nextLine();
			
			//speling checking
			if(!(userChoice.equals("rock")) && !(userChoice.equals("paper")) && !(userChoice.equals("rock"))){
				System.out.println("Check your speling");
				System.out.println("You typed " + userChoice);
				System.out.println();
			}else{
			
				
			if		(userChoice.equalsIgnoreCase("rock") && compChoice.equals("rock")) 
					System.out.println("Computer chosed " + compChoice + " It is a tie\n");
			
			else if (userChoice.equals("rock") && compChoice.equals("paper")) {
					compWin++;
					score();
					System.out.println("Computer chosed " + compChoice + " Computer wins\n");
			}
			else if (userChoice.equals("rock") && compChoice.equals("scissors")) {
					userWin++;	
					score();
					System.out.println("Computer chosed " + compChoice + " You win\n");
			}
			else if (userChoice.equalsIgnoreCase("paper") && compChoice.equals("paper")) 
					System.out.println("Computer chosed " + compChoice + " It is a tie\n");
			else if (userChoice.equalsIgnoreCase("paper") && compChoice.equals("scissors")) {
					compWin++;	
					score();
					System.out.println("Computer chosed " + compChoice + " Computer wins\n");
					} 
			else if(userChoice.equalsIgnoreCase("paper") && compChoice.equals("rock")){
					userWin++;	
					score();
					System.out.println("Computer chosed " + compChoice + " You win\n");
					}
			else if (userChoice.equalsIgnoreCase("scissors") && compChoice.equals("scissors")) 
					System.out.println("Computer chosed " + compChoice + " It is a tie\n");
			else if (userChoice.equalsIgnoreCase("scissors") && compChoice.equals("rock")) {
					compWin++;
					score();
					System.out.println("Computer chosed " + compChoice + " Computer wins\n");
					} 
			else {	userWin++;
					score();
					System.out.println("Computer chosed " + compChoice + " You win\n");
					}
			}
			
			//counting part
			if(compWin == 3){
				win = true;
				System.out.println("COMPUTER IS THE ULTIMATE CHAMPION");
				playAgain();
			}
			else if(userWin == 3){
				win = true;
				System.out.println("YOU ARE THE ULTIMATE CHAMPION");
				playAgain();
			}
			
		} while (!win);
		
	
	}
	//checking if the user wants to play again
	public void playAgain(){
		String lucky;
		boolean entry = false;
		do{
			System.out.println();
			System.out.print("Would you like to play again? [yes/no]");
			lucky = input.nextLine();
			
			if (lucky.equalsIgnoreCase("yes") || lucky.equalsIgnoreCase("y")) {
				entry = true;
				game();
			} 
			else if(lucky.equalsIgnoreCase("no") || lucky.equalsIgnoreCase("n")){
				entry = true;
				System.out.println("Bye Bye");
			}
			else{
				System.out.println("Invalid entry, you can try with only first letter...");
			}			
		}while(!entry);
	}
	
	
	
	// simple choice betwen rules and playing game
	public void choice() {
		
			choiceText();
			int inp;
			boolean entry = false;
			
			do{
			inp = input.nextInt();
			
				if (inp == 1) {
					entry = true;
					rules();
				} else if (inp == 2) {
					entry = true;
					game();
				} else {
					System.out.println("Invalid input, must be a number 1 or 2");
					System.out.print("You chose: ");
				}
					}while(!entry);
	}
}
