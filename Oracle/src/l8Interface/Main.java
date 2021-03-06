package l8Interface;

public class Main implements CharSequence  {

	/*
	 * What methods would a class that implements the java.lang.CharSequence interface have to implement?
	 * charAt, length, subSequence, toString
	 * 
	 * What is wrong with the following interface?
			public interface SomethingIsWrong {
    				void aMethod(int aValue){System.out.println("Hi Mom")}; String "Hi mom", abstract method cant have a body
    Fix the interface in question 2. // Just delete "{System.out.println("Hi Mom")}"
}

*Is the following interface valid?
public interface Marker {
}		YES
*
*
*/
	private String s;
	
	public Main(String s){
		this.s = s;
	}

	private int fromEnd(int i){
		return s.length() - 1 - i;
	}
	
	public char charAt(int i) {
		if((i<0)||(i>=s.length())){
			throw new StringIndexOutOfBoundsException();
		}
		return s.charAt(fromEnd(i));
	}

	public int length() {
		return s.length();
	}

	public CharSequence subSequence(int start, int end) {
		StringBuilder sub = new StringBuilder(s.subSequence(fromEnd(start), fromEnd(end)));
		return sub.reverse();
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder(this.s);
		return s.reverse().toString();
	}
	

	public static void main(String[] args) {

		Main s = new Main("Aleks-andar");
		Main a = new Main("Ana voli MilovanA");
		 for (int i = 0; i < s.length(); i++) {
	            System.out.print(s.charAt(i));
	        }
		 System.out.println();
		 for (int i = 0; i < a.length(); i++) {
	            System.out.print(a.charAt(i));
	        }
		
		
	}


}
