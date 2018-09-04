package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.text.DecimalFormat;

/**
 * @author Mehmet ACIKGOZ
 * class VendingMachine simulates a simple Vending Machine
 * where items may be purchased, and item information is updated
 * and stored.
 */
public class VendingMachine {
	
  private ArrayList<Item> items;

  public static void main(String[] args)  {
	  
    VendingMachine machine = new VendingMachine();
    
    try {
      machine.start("items.txt");
      machine.run();
      machine.stop("items.txt");
    }    
    catch (IOException ex) {
    	
      ex.printStackTrace();
    }
    
  }

  public VendingMachine() {
    // Assign a new empty array list to the items field
	  items = new ArrayList<>();  
  }

  /**
   * Method start loads the machine with vending machine data.
   * @param filename The name of the file storing the vending
   *                 machine data.
   * @throws IOException
   */
  public void start(String filename) throws IOException
  {
    // Check if the filename exists. If not, inform the user that the
    // file does not exist and exit with an error code of 1.
	  
	  File file = new File(filename);
	  if ( ! file.exists() ) {
		  System.out.println(file.getName() + " does not exist");
		  System.exit(1);
	  }
	 

    // Open the file for reading
	  Scanner input = new Scanner(file); 

    // While there are more lines in the file, read each vending machine
    // item from file into the items list
	  
    while ( input.hasNextLine() ) {
    	
      // Read the next line from the file and split into an
      // array of strings
    	
    	String inputInfo = input.nextLine();
    	String [] inputInfoArray = inputInfo.split(",");

      // IF the line of data read represents a Soda, build a new
      // Soda object with the name/price/quantity/caffeine information
      // and then add it to items
      // ELSE build a new Candy object with the name/price/quantity/nuts
      // information and add it to items

   	
    	String name  = inputInfoArray[1];
		double price = Double.parseDouble(inputInfoArray[2]);
		int quantity = Integer.parseInt(inputInfoArray[3]);
		boolean contain = Boolean.parseBoolean(inputInfoArray[4]);

    	if (inputInfoArray[0].equals("Soda")) {      		
    		Soda soda = new Soda(name, price, quantity, contain);
    		items.add(soda);
    	}
    	else {
    		Candy candy =  new Candy(name, price, quantity, contain );
    		items.add(candy);
    	}

    }
    
    // Close the file
    input.close();
  }

  /**
   * Method lookup performs a case-insensitive linear search to determine
   * if a vending machine item with the given name exists.
   * @param itemName The name of the vending machine item to find.
   * @return A reference to the item found or null if not found.
   */
  public Item lookup(String itemName) {
	  
	  for (Item value:items) {
		
		  if (value.getName().equalsIgnoreCase(itemName)) {  
			  return value;
		  }
	  }
	  
	  return null;
  }

  
  /**
   * Method displayItems displays each item in the machine.
   */
  
  public void displayItems()   {
	  
	  for (Item value: items) {
		  value.display();		  
	  }
	  System.out.println();
  }

  /**
   * Method run allows a user to purchase items from the machine.
   */
  
  public void run() {

//     Process transactions until the user quits

	  String choice;
      Scanner input = new Scanner(System.in);

      DecimalFormat df = new DecimalFormat("0.00");  	
      df.setMaximumFractionDigits(2);

      
    do {
    	
      displayItems();

      //Prompt for and retrieve the item into a String variable named choice
     
      System.out.print("Item? "); 
      choice = input.nextLine(); 


      Item item = lookup(choice);

      // If item is found, proceed with the purchase
      if (item != null) {
    	  
        // If there is at least one item, then process the purchase
        if ( item.getQuantity() >= 1 ) {
        
        	// Prompt for and retrieve the money
        	double money = 0;
        	double change = 0;
        	
        	do {
        		
        		if (change > 0)
        			System.out.print("Enter $" + df.format(change) +"   more : $" );

        		else
        			System.out.print("Enter money: $");
        		
            	
        		money += Double.parseDouble(input.nextLine());
        		
            	change = (item.getPrice()- money);
        		
        	} while ( change > 0 );       	

          // Loop until enough money is entered

          // Tell the user to take the product and any remaining change.

        	System.out.println("Please take your " + choice + ".");
        	
        	if ( change < 0)
        		System.out.println("Please take your change ($" +  df.format(-1*change) + ").");

          // Reduce the quantity of the item in stock by 1
        	item.reduce(1);
        }
        else {
          System.out.println("Item sold out.");
        }        
      }
      else {
        System.out.println("Invalid item.");
      }

      // Prompt for and retrieve choice whether the user wants to quit.
      System.out.println();
      System.out.println("====================");
      System.out.print("Quit? (y or n): ");
      choice = input.nextLine();
      System.out.println("====================");

    } while ( ! choice.equalsIgnoreCase("Y")   /* choice does not equal an upper or lower case n */);
    input.close();
  } // end run

  
  /**
   * Method stop writes the items to file.
   * @param filename The name of the file to which the items are written.
   * @throws IOException
   */
  public void stop(String filename) throws IOException {
	  
	  PrintWriter file = new PrintWriter(filename);
	  
	  for (Item value:items) {
		  value.store(file);
	  }
	  
	  file.close();    

  } // end stop
} // end class
