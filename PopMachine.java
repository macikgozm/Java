import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

// Insert the needed import statements here

/**
 * @author Mehmet ACIKGOZ
 * Class PopMachine simulates simple functionality of a PopMachine
 */
public class PopMachine
{
  public static void main(String[] args) throws IOException
  {
    final int MAX_SODAS = 10;

    // Create a new array named popMachine that will be able
    // to hold MAX_SODAS Soda objects    
    Soda [] popMachine = new Soda[MAX_SODAS]; 

    int numSodas = fillMachine(popMachine, "Sodas.txt");
    

    // Loop to reduce the quantity of each soda in the popMachine
    // by one. Note that the machine may not be filled. Use
    // the reduce method.    
    for (int i = 0; i < numSodas; i++) {
    	//System.out.print(popMachine[i].getQuantity() + " ");
    	popMachine[i].reduce(1);
    	//System.out.println(popMachine[i].getQuantity());
    }
    
    

    saveMachine(popMachine, numSodas, "SodasChanged.txt");

    System.out.println("Machine closed.");
  }

  /**
   * fillMachine loads the machine with sodas from the specified file.
   * @param popMachine The array to fill with sodas
   * @param fileName The name of the file containing soda information
   * @return The number of sodas read into the machine
   * @throws IOException
   */
  public static int fillMachine(Soda[] popMachine,
                              String fileName) throws IOException
  {
    // Check if the file exists. If not, inform the user that the
    // file does not exist and exit with an error code of 1.
	  
	  java.io.File file = new java.io.File(fileName);
	  
	  if (!file.exists()) {
		  System.out.println(file.getName() + " does not exist");
		  System.exit(1);
	  }


    // Open the file for reading and read each Soda into the array
    // Stop reading when there are no more lines to process or the
    // array is filled with sodas.
    // Note: In each loop iteration, you will need to add a new Soda
    // object to the array, get the 4 lines of data associated with
    // that soda, and set the soda object with that data. You will need
    // to keep track of the number of sodas read, and that can be used
    // as an index into the array.
	  
	  Scanner input = new Scanner(file);
	  
	  int i = 0;
	  while (input.hasNextLine()) {		
		  String name = input.nextLine();
		  double price = Double.parseDouble(input.nextLine());
		  int quantity = Integer.parseInt(input.nextLine());
		  int ounces = Integer.parseInt(input.nextLine());
		  
		  Soda drink = new Soda(name, price, quantity, ounces);
		  popMachine[i] = drink;
		  i++;

	  }
	  int numOfSodas = i;


    // Close the file
	  input.close();
    // Return the number of sodas read
	  return numOfSodas;
  }

  /**
   * saveMachine writes the popMachine data back to file in the same format
   * as originally read.
   * @param popMachine The array that contains the sodas
   * @param numSodas The number of sodas in the array
   * @param fileName The name of the file to write the soda information
   * @throws IOException
   */
  public static void saveMachine(Soda[] popMachine, int numSodas,
      String fileName) throws IOException
  {
    // Open the fileName for writing. No need to check for an error.
	  java.io.PrintWriter outfile =  new PrintWriter(fileName);
	  
    // Create a DecimalFormat class that will output the price with
    // always 1 digit before the decimal point and 2 digits after.
	  java.text.DecimalFormat df = new DecimalFormat("0.00");
	  df.setMaximumFractionDigits(2);


    // Loop to write the soda data back to file in the same original format.
	  for (int i = 0; i < numSodas; i++) {
		  outfile.println(popMachine[i].getName());
		  outfile.println(popMachine[i].getPrice());
		  outfile.println(popMachine[i].getQuantity());
		  outfile.println(popMachine[i].getOunces());
	  }

    // Close the output file.
	  outfile.close();

  }
}
