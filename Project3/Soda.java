package test;
import java.io.PrintWriter;
import java.io.IOException; 


/**
 * This class creates a Soda with boolean caffeine data member and has also methods 
 * It also inherits from Item class.
 * 
 * @author Mehmet ACIKGOZ
 *
 */
public class Soda extends Item{
	private boolean caffeine;
	
	public Soda() {
		super("",0,0);
		this.caffeine = false;
	}
	
	public Soda(String name, double price, int quantity, boolean caffeine) {
		super(name,price,quantity);
		setCaffeine(caffeine);
	}
	
	public void setCaffeine(boolean caffeine) {
		this.caffeine = caffeine;
	}
	
	public boolean getCaffeine() {
		return this.caffeine;
	}
	
	public void display() {
		super.display();
		System.out.println(this.caffeine ? " (caffeine)" : " (no caffeine)" );
	}
	
	public String toString() {
		return ("Soda," + super.toString() + "," + this.caffeine);
	}
	
	public void store(PrintWriter outFile) throws IOException{
		outFile.println(this.toString());
		
	}
}
