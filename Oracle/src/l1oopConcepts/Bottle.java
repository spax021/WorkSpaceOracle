package l1oopConcepts;

public class Bottle implements BottleInterface{
	
	private int zapremina = 10;
	private int voda = 0;

	public void napuni(int kolicina) {
		voda = voda + kolicina;
		if(voda > zapremina)
			voda = 10;
	}

	public void isprazni(int kolicina) {
		voda = voda - kolicina;
		if(voda < 0)
			voda = 0;
	}

	public void ispis() {
		System.out.println("U flasi ima " + voda + " litara vode.");
		
	}
	
	

}
