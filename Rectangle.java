
/**
 * This class creates a Rectangle which has a length and width. 
 * It also has the methods for calculating the area and perimeter.
 * @author Mehmet ACIKGOZ
 *
 */

public class Rectangle{
	private double length;
	private double width;
	
	// default constructor
	public Rectangle() {		
		setLength(1);
		setWidth(1);
	}
	// parameterized constructor
	public Rectangle(double length, double width) {		
		setLength(length);
		setWidth(width);
	}
	
	// mutators
	public void setLength(double length) {		
		if ( length > 0 )
			this.length = length;
	}
	
	public void setWidth(double width) {
		if ( width > 0 )
			this.width = width;
	}
	
	// accessors	
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	// other methods
	
	public double getArea() {
		
		return ( getLength()*getWidth() );
	}
	
	public double getPerimeter() {
		return 2*(getLength()+getWidth());
	}
	
}