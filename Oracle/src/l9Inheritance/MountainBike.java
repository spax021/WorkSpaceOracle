package l9Inheritance;

public class MountainBike extends Bicycle{

	private int seatHeight;
	private String suspension;
	
	public MountainBike(int startCadence, int startGear, int startSpeed, int startHeight, String suspensionType) {
		super(startCadence, startGear, startSpeed);
		seatHeight = startHeight;
		suspension = suspensionType;
	}
	
	public void setSeatHeight(int newValue){
		seatHeight = newValue;
	}
	
	public String getSuspension(){
		return this.suspension;
	}
	
	public void setSuspension(String suspensionType){
		this.suspension = suspensionType;
	}
	
	public void printDescription(){
		super.printDescription();
		System.out.println("The Mountain Bike has a " + this.suspension + " suspension.");
	}

}
