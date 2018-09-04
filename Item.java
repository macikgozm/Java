/**
 * This class creates an Item with name, price and quantity 
 * and also has the setters and getters as well as reduce method.
 * 
 * @author Mehmet ACIKGOZ
 *
 */

public class Item {
	private String name;
	private double price;
	private int quantity;
	
	
	public Item() {
		this("", 0.0, 0);
	}
	
	public Item(String name , double price, int quantity) {
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		if (price < 0.0)
			price = 0.0;		
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		if (quantity < 0)
			quantity = 0;
		this.quantity = quantity;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;		
	}
	
	public int getQuantity() {
		return this.quantity;		
	}
	
	public void reduce (int amount) {
		if (amount > 0)
			this.quantity -= amount;		
	}
}