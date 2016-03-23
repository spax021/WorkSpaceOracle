package l11CharAndStrings;

public class Domaci {

	public static void main(String[] args) {
//		What is the initial capacity of the following string builder?  16
		StringBuilder sb = new StringBuilder("Able was I ere I saw Elba."); // 26

		String hannah = "Did Hannah see bees? Hannah did.";
		
//		What is the value displayed by the expression hannah.length()?  	//32
//		What is the value returned by the method call hannah.charAt(12)?	//e
//		Write an expression that refers to the letter b in the string referred to by hannah. .charAt(16)
		
//		"Was it a car or a cat I saw?".substring(9, 12)  "car", String is a object
		
		String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');

/*1*/   result.setCharAt(0, original.charAt(0));
/*2*/   result.setCharAt(1, original.charAt(original.length()-1));
/*3*/   result.insert(1, original.charAt(4));
/*4*/   result.append(original.substring(1,4));
/*5*/   result.insert(3, (original.substring(index, index+2) + " ")); 

        System.out.println(result);  //swear oft
		
        
//        Show two ways to concatenate the following two strings together to get the string "Hi, mom.":

        	String hi = "Hi, ";
        	String mom = "mom.";
        	System.out.println(hi + mom);
        	System.out.println(hi.concat(mom));
	}

}
