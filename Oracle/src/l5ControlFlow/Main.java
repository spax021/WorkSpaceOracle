package l5ControlFlow;

public class Main {

	public static void main(String[] args) {

//		The most basic control flow statement supported by the Java programming language is the IF THEN statement.
//		The SWITCH statement allows for any number of possible execution paths.
//		The DO WHILE statement is similar to the while statement, but evaluates its expression at the BOTTOM of the loop.
//		How do you write an infinite loop using the for statement?
//		for(int i=0; i>0; i++)
//		How do you write an infinite loop using the while statement?
//		int i=0;
//		while(i>0){
//		}
		
//		Consider the following code snippet.
		int aNumber = 3;

		if (aNumber >= 0)
		    if (aNumber == 0)
		        System.out.println("first string");
		else System.out.println("second string");
		System.out.println("third string");
		
//		What output do you think the code will produce if aNumber is 3? SECOND AND THIRD SRING
//		Write a test program containing the previous code snippet; make aNumber 3. What is the output of the program? 
//		Is it what you predicted? Explain why the output is what it is; in other words, what is the control 
//		flow for the code snippet?
		/*YES, BECAUSE WE HAVE NESTED IF-THEN-ELSE STATMENT INSIDE A IF-THEN STATMENT, IN NESTED STATMENT
		 * NUMBER IS NOT ZERO SO IT PRINTED ELSE, AND WHEN IT FINISHED IT, IT STIL HAVE IF-THEN STATMENT THAT IT NEEDS
		 * TO BE COMPLETED BECAUSE aNumber IS GREATER THAN ZERO*/
		
//		Using only spaces and line breaks, reformat the code snippet to make the control flow easier to understand.
//		Use braces, { and }, to further clarify the code
		
		if(aNumber >= 0){
			if(aNumber == 0){
				System.out.println("first string");
			}else{
				System.out.println("second string");
			}
		}
		
		System.out.println("third string");
		
	}

}
