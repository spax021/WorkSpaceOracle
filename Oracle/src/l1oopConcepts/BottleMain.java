package l1oopConcepts;

public class BottleMain extends Bottle{

	public static void main(String[] args) {

		Bottle flasa = new Bottle();
		Bottle flasa2 = new Bottle();
		Bottle flasa3 = new Bottle();
		
		flasa.napuni(1);
		flasa.napuni(2);
		flasa.napuni(3);
		flasa.isprazni(6);
		flasa.ispis();
		
		flasa.napuni(2);
		flasa.napuni(3);
		flasa.napuni(4);
		flasa.isprazni(6);
		flasa.ispis();
		
		flasa.napuni(3);
		flasa.napuni(4);
		flasa.napuni(5);
		flasa.isprazni(6);
		flasa.ispis();

	}

//	Real-world objects contain STATE and BEHAVIOR.
//	A software object's state is stored in CLASS. WRONG/CORECT IS: FIELDS
//	A software object's behavior is exposed through METHOD.
//	Hiding internal data from the outside world, 
//	and accessing it only through publicly exposed methods is known as data ENCAPSULATION.
//	A blueprint for a software object is called a CLASS.
//	Common behavior can be defined in a SUPERCLASS and inherited into a SUBCLASS using the EXTENDS keyword.
//	A collection of methods with no implementation is called an INTERFACE.
//	A namespace that organizes classes and interfaces by functionality is called a PACKAGE.
//	The term API stands for APPLICATION PROGRAMING INTERFACE?
	
}
