package l6Objects;

public class Karta {

	public static int znak;
	public static int broj;

	public Karta(int znak, int broj) {
		this.znak = znak;
		this.broj = broj;
	}

//	public int getZnak() {
//		return znak;
//	}
//
//	public int getBroj() {
//		return broj;
//	}

	public static String kartaZnak(){
		
		switch (znak) {
		case 1:
			return "Karo";
		case 2:
			return "Pik";
		case 3:
			return "Herc";
		case 4:
			return "Tref";
		default:
			return "Nepostojeci znak";
		}
	}

	public static String kartaBroj() {

		switch (broj) {
		case 1:
			return "Kec";
		case 2:
			return "Dvojka";
		case 3:
			return "Trojka";
		case 4:
			return "Cetvorka";
		case 5:
			return "Petica";
		case 6:
			return "Sestica";
		case 7:
			return "Sedmica";
		case 8:
			return "Osmica";
		case 9:
			return "Devetka";
		case 10:
			return "Desetka";
		case 11:
			return "Zandar";
		case 12:
			return "Dama";
		case 13:
			return "Kralj";
		default:
			return "Nepostojeci broj";
		}

	}

}
