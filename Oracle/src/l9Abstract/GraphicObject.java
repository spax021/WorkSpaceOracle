package l9Abstract;

public abstract class GraphicObject {
	
	/*Consider using abstract classes if any of these statements apply to your situation:
		
		You want to share code among several closely related classes.
		
		You expect that classes that extend your abstract class have 
			many common methods or fields, or require access modifiers 
			other than public (such as protected and private).
		
		You want to declare non-static or non-final fields. This enables 
			you to define methods that can access and modify the state of 
			the object to which they belong.
	
	
	Consider using interfaces if any of these statements apply to your situation:
		
		You expect that unrelated classes would implement your interface. 
			For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
		
		You want to specify the behavior of a particular data type, but not 
			concerned about who implements its behavior.
		
		You want to take advantage of multiple inheritance of type.*/
	
	private int x, y;
	
	void moveTo(int newX, int newY){
		x = newX;
		y = newY;
	}
	
	abstract void draw();
	abstract void resize();

}
