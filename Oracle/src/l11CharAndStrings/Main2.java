package l11CharAndStrings;

public class Main2 {

	public static void main(String[] args) {
		  
		String[] args1 = new String[2];
		args1[0] = "4.5";
		args1[1] = "87.2";
		// this program requires two 
        // arguments on the command line 
        if (args1.length == 2) {
            // convert strings to numbers
            float a = (Float.valueOf(args1[0])).floatValue(); 
            float b = (Float.valueOf(args1[1])).floatValue();

            // do some arithmetic
            System.out.println("a + b = " +
                               (a + b));
            System.out.println("a - b = " +
                               (a - b));
            System.out.println("a * b = " +
                               (a * b));
            System.out.println("a / b = " +
                               (a / b));
            System.out.println("a % b = " +
                               (a % b));
        } else {
            System.out.println("This program " +
                "requires two command-line arguments.");
        }
        
        String ime = "aleksandar";
        StringBuilder sb = new StringBuilder(ime);
        sb.reverse();
        System.out.println(sb);
        
//		There is also a StringBuffer class that is exactly the same as the StringBuilder class, 
//		that it is thread-safe by virtue of having its methods synchronized.
        
        
        
	}

}
