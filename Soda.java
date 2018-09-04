/**
 * 
 * This class creates  Soda with name, price and quantity and ounces  
 * It  also has the setters and getters as well as reduce method.
 * 
 * @author Mehmet ACIKGOZ
 *
 */


public class Soda {
	private String name;
	private double price;
	private int quantity;
	private int ounces;
	
	
	public Soda() {
		//this("",0.0,0,0);  // this is also another alternative...
		setName("");
		setPrice(0);
		setQuantity(0);
		setOunces(0);

	}
	
	public Soda(String name, double price, int quantity, int ounces) {
		setName(name);
		setPrice(price);
		setQuantity(quantity);
		setOunces(ounces);
		
	}
	
	public void setName(String name) { 
		this.name = name;
	}
	
	public void setPrice(double price) {
	    if (price >= 0) 
	    	this.price = price;
	}
	
	public void setQuantity(int quantity) {
	    if (quantity >= 0 )
	    	this.quantity = quantity;
	}
	
	public void setOunces(int ounces) {
		if (ounces >= 0)
		this.ounces = ounces;
	}
	
	
	public String getName() {return this.name;}
	public double getPrice() {return this.price;}
	public int getQuantity() {return this.quantity;}
	public int getOunces() { return this.ounces;}
	
	/**
	 * reduce subtracts the amount from the quantity data
	 * @param amount, number of sodas consumed.
	 */	
	public void reduce(int amount) {
		if ( (quantity >= amount ) && (amount > 0) )
			quantity -= amount;
	}
	

}
