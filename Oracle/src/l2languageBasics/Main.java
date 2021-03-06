package l2languageBasics;
import java.lang.String;

public class Main {

//	In the program you created in Exercise 1, try leaving the fields uninitialized and print out their values. 
//	Try the same with a local variable and see what kind of compiler errors you can produce
	
	int a = 1;
	int b;
	
	public void program(){
		int b1 = 2;
		int c;
		
		System.out.println("Method program");
		System.out.println(b);
		b = b1;
		System.out.println(b);
//		System.out.println(c);		//The local variable c may not have been initialized
	}
	
	public static void main(String[] args) {
	
		
//	Exercise 1: Create a small program that defines some fields. 
//	Try creating some illegal field names and see what kind of error the compiler produces	
		
//	int int = 0;					// invalid Variable declarator Id
	int _num = 0;	
		
		Main mejn = new Main();
		mejn.program();
//		System.out.println(c);		//c cannot be resolved to a variable
		
	}
	
//	The term "instance variable" is another name for NON STATIC FIELDS.
//	The term "class variable" is another name for STATIC FIELDS.
//	A local variable stores temporary state; it is declared inside a METHOD.
//	A variable declared within the opening and closing parenthesis of a method signature is called a PARAMETER.
//	What are the eight primitive data types supported by the Java programming language?
//	BYTE, SHORT, FLOAT, INT, LONG, DOUBLE, BOOLEAN, CHAR
//	Character strings are represented by the class ___. WRONG/CORECT IS: JAVA.LANG.STRING
//	An ARRAY is a container object that holds a fixed number of values of a single type.

}
