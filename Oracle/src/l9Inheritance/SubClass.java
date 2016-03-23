package l9Inheritance;

public class SubClass extends SuperClass{

	public void printMe(){
		super.printMe();
		System.out.println("Printed in SubClass.");
	}
	
	public static void main(String[] args) {

		SubClass s = new SubClass();
		s.printMe();
		
	}

}
