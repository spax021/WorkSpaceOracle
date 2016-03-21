package l6Objects;

public class Spil {

    public static int znakovi = 4;
    public static int brojevi = 13;
    
    private Karta karte;
    
    public void pokaziSpil(){
    	
    	for(int znak = 1; znak <= znakovi; znak++){
    		for(int broj = 1; broj <= brojevi; broj++){
    			karte = new Karta(znak, broj);
    			System.out.print(karte.kartaZnak());
       			System.out.println(karte.kartaBroj());
    		}
    	}
    }
 
}
