package l6Objects;

public class SomethingIsWrong {

	public static void main(String[] args) {
        Rectangle myRect = new Rectangle(); // new Rectangle();  -- constructor was missing
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
        System.out.println();
        
        
        NumberHolder number = new NumberHolder();
    	number.anInt = 40;
    	number.aFloat = 35;
    	System.out.println("Int: " + number.anInt);
        System.out.println("Float: " + number.aFloat);
        
        
	}
	/*
	String[] students = new String[10];		one reference to students
	String studentName = "Peter Parker";	and one from students to Peter Parker
	students[0] = studentName;				not eligible for garbage collector
	studentName = null;
	
	*
	*/
	
	//How does a program destroy an object that it creates?
	//Program does not destroys objects, it can set them to null so carbage collector can collect them
	
	
	
}
