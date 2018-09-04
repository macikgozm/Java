package test;
import java.io.PrintWriter;

/**
 * This class creates an Candy with boolean nuts data member and has also methods 
 * It also inherits from Item class.
 * 
 * @author Mehmet ACIKGOZ
 *
 */

import java.io.IOException; 

/**
 * This class creates Candy with boolean nuts data member and has also methods 
 * It also inherits from Item class.
 * 
 * @author Mehmet ACIKGOZ
 *
 */
public class Candy extends Item{
	
	private boolean nuts;
	
	public Candy() {
		super("",0,0);
		nuts = false;
	}
	
	public Candy(String name, double price, int quantity, boolean nuts) {
		super(name,price,quantity);
		this.nuts = nuts; 
	}
	
	public void setNuts(boolean nuts) {
		this.nuts = nuts;
	}
	
	public boolean getNuts() {
		return this.nuts;
	}
	
	public void display() {
		super.display();
		
		/*
		if (this.nuts)
			System.out.println(" (nuts)");
		else
			System.out.println(" (no nuts)");
		*/
		
		System.out.println(this.nuts ? " (nuts)" :" (no nuts)");

	}
	
	public String toString() {
		return ( "Candy," + super.toString() + "," + this.nuts );		
	}
	
	public void store(PrintWriter outFile) throws IOException {  
		outFile.println(this.toString());
	} 

}
