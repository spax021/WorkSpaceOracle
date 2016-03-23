package l10Numbers;

public class Domaci {

	public static void main(String[] args) {
		
		int ii = 65;
		
		System.out.println(Integer.toHexString(ii));
		
		String s = "230";
		
		System.out.println(Integer.valueOf(s, 5));
//		What Double method can you use to detect whether a floating-point number has the special value Not a Number (NaN)?
//		isNaN
		
//		System.out.println(Integer.valueOf(1).equals(Long.valueOf(1)));
//		False, cant compare 2 diferent types, Integer and Long
//		================================================================================
//		Change next code to show minimum values instead of maximum values. 
//		You can delete all code related to the variables aChar and aBoolean. What is the output?
//		It would still be the same
		
		//integers
        byte largestByte = Byte.MIN_VALUE;
        short largestShort = Short.MIN_VALUE;
        int largestInteger = Integer.MIN_VALUE;
        long largestLong = Long.MIN_VALUE;

        //real numbers
        float largestFloat = Float.MIN_VALUE;
        double largestDouble = Double.MIN_VALUE;

        //other primitive types
        char aChar = 'S';
        boolean aBoolean = true;

        //Display them all.
        System.out.println("The largest byte value is "
                           + largestByte + ".");
        System.out.println("The largest short value is "
                           + largestShort + ".");
        System.out.println("The largest integer value is "
                           + largestInteger + ".");
        System.out.println("The largest long value is "
                           + largestLong + ".");

        System.out.println("The largest float value is "
                           + largestFloat + ".");
        System.out.println("The largest double value is "
                           + largestDouble + ".");

        if (Character.isUpperCase(aChar)) {
            System.out.println("The character " + aChar
                               + " is uppercase.");
        } else {
            System.out.println("The character " + aChar
                               + " is lowercase.");
        }
        System.out.println("The value of aBoolean is "
                           + aBoolean + ".");
        
//        ======================================================================
        
        int niz = 6;
        
        if(niz < 2){
        	System.out.println("min 2 broja");
        }
        else{
        	int sum = 0;
        	
        	for(int i = 0; i<niz; i++){
        		sum += i;
        	}
        	System.out.println(sum);
        }
        System.out.println("\n");
        double nizz = 4;
        
        if(nizz < 2){
        	System.out.println("min 2 broja");
        }
        else{
        	double sum = 0;
        	
        	for(double i = 0; i<nizz; i+=0.3){
        		sum += i;
        	}
        	System.out.printf("%.2f", sum);
        }
        
        
		
	}

}
