package l14Exceptions;

public class Domaci {

	/*
	 * Is the following code legal? 
	 * try {
	 * } finally {
	 * } YES
	 * 
	 * What exception types can be caught by the following handler? 
	 * catch (Exception e) { EVERY EXCEOTION TYPE
	 * } 
	 * What is wrong with using this type of exception handler? 
	 * SOMETIMES YOU CANT REALY KNOW WHAT IS REALY WRONG
	 * 
	 * Is there anything wrong with the following exception handler as written? Will this
	 * code compile? 
	 * try {
	 * } catch (Exception e) {
	 * } catch (ArithmeticException a) {
	 * }
	 * NO, FIRST EXCEPTION IS HANDLING EVERYTHING, IT WILL NEVER GET TO THE
	 * SECOND EXCEPTION
	 * 
	 * 
	 */

	public static void main(String[] args) {

	}

}
