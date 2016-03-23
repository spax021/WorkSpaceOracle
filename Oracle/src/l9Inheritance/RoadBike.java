package l9Inheritance;

public class RoadBike extends Bicycle{
	
	private int tireWidth;	//supose its in millimeters

	public RoadBike(int startCadence, int startGear, int startSpeed, int newTireWidth) {
		super(startCadence, startGear, startSpeed);
		tireWidth = newTireWidth;
	}

	public void setTireWidth(int newValue){
		tireWidth = newValue;
	}
	
	public int getTireWidth() {
		return this.tireWidth;
	}

	public void printDescription(){
		super.printDescription();
		System.out.println("The Road bike has " + getTireWidth() + "mm tire width.");
	}
	
	
}