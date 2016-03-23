package l11CharAndStrings;

public class Main {

	public static void main(String[] args) {
		char uniChar = '\u03A9';
		System.out.println(uniChar);
		
		//najobicniji string
		String string = "U d o v i c a B a c i V o d u";
		//odredimo njegovu duzinu
		int len = string.length();
		//niz koji cemo napuniti karakterima iz stringa
		char[] tempCharString = new char[len];
		//niz koji cemo napuniti karakterima iz string u obrnutom smeru
		char[] charString = new char[len];
		
		//petljom prodjemo kroz string
		for(int i=0; i<len; i++){
								//sa charAt() rasclanimo string i dodamo ga u prvi niz
			tempCharString[i] = string.charAt(i);
		}
		
		//petljom prolazimo kroz niz i punimo ga karakterima u obrnutom nizu
		for(int j=0; j<len; j++){
			charString[j] = tempCharString[len - 1 - j];
		}
		
		//objekat string i od niza karaktera pravimo opet string
		String palindrom = new String(charString);
		System.out.println(palindrom);
	}

}
