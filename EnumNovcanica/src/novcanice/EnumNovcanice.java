package novcanice;

public class EnumNovcanice {
	public enum Novcanice{
		deset, dvadeset, pedeset, sto, dvesta, petsto, hiljadu, dvoiljadarka, petoiljadarka
	}
	
	Novcanice lik;
	public EnumNovcanice(Novcanice lik) { this.lik = lik; }
	
	public void opis(){
		
		switch (lik) {
		case deset: System.out.println("Na novcanici od deset dinara nalazi se VUK STEFANOVIC KARADzIC\n");
			break;
		case dvadeset: System.out.println("Na novcanici od dvadeset dinara nalazi se PETAR II PETROVIC NjEGOS\n");
			break;
		case pedeset: System.out.println("Na novcanici od pedeset dinara nalazi se STEVAN STOJANOVIC MOKRANjAC\n");
			break;
		case sto: System.out.println("Na novcanici od sto dinara nalazi se NIKOLA TESLA\n");
			break;		
		case dvesta: System.out.println("Na novcanici od dvesta dinara nalazi se NADEZDA PETROVIC\n");
			break;
		case petsto: System.out.println("Na novcanici od petsto dinara nalazi se JOVAN CVIJIC\n");
			break;
		case hiljadu: System.out.println("Na novcanici od hiljadu dinara nalazi se DjORDjE VAJFERT\n");
			break;
		case dvoiljadarka: System.out.println("Na novcanici od dve hiljade dinara nalazi se MILUTIN MILANKOVIC\n");
			break;
		case petoiljadarka: System.out.println("Na novcanici od pet hiljada dinara nalazi se SLOBODAN JOVANOVIC\n");
			break;
		}
	}
	
	
	public static void main(String[] args) {

//		for(Novcanice n : Novcanice.values()){
//			System.out.println(n + ", " + n.ordinal() + ". po redu.");
//		}
		
		EnumNovcanice
			deset = new EnumNovcanice(Novcanice.deset),
			dvadeset = new EnumNovcanice(Novcanice.dvadeset),
			pedeset = new EnumNovcanice(Novcanice.pedeset),
			sto = new EnumNovcanice(Novcanice.sto),
			dvesta = new EnumNovcanice(Novcanice.dvesta),
			petsto = new EnumNovcanice(Novcanice.petsto),
			hiljadu = new EnumNovcanice(Novcanice.hiljadu),
			dvoiljadarka = new EnumNovcanice(Novcanice.dvoiljadarka),
			petoiljadarka = new EnumNovcanice(Novcanice.petoiljadarka);
		
		deset.opis();
		dvadeset.opis();
		pedeset.opis();
		sto.opis();
		dvesta.opis();
		petsto.opis();
		hiljadu.opis();
		dvoiljadarka.opis();
		petoiljadarka.opis();
	}
	
}
