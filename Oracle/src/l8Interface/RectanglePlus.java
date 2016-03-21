package l8Interface;

import java.awt.Point;

public class RectanglePlus implements Relatable{

	public int width = 0;
	public int height = 0;
	public Point origin;
	
	public RectanglePlus(){
		origin = new Point(0, 0);
	}
	
	public RectanglePlus(Point p){
		origin = p;
	}
	
	public RectanglePlus(int w, int h){
		origin = new Point(0, 0);
		width = w;
		height = h;
	}
	
	public RectanglePlus(Point p, int w, int h){
		origin = p;
		width = w;
		height = h;
	}
	
	public void move(int x, int y){
		origin.x = x;
		origin.y = y;
	}
	
	public int getArea(){
		return width * height;
	}
	
	public int isLargerThan(Relatable other) {
		RectanglePlus otherRec = (RectanglePlus)other;
		if(this.getArea() < otherRec.getArea())
		return -1;
		else if(this.getArea() > otherRec.getArea())
		return 1;
		else
		return 0;
	}

}
