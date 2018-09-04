import java.util.Scanner;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.File;
import java.io.PrintWriter;
import java.text.DecimalFormat;

/**
 * 
 * This program reads a student’s name, semester letter grades, and semester hours  from one file,
 * calculates the semester GPA; and writes the student’s name and semester GPA to another file
 * 
 * @author Mehmet ACIKGOZ
 *
 */
public class CalculateGPA {
	  
	
	  /**
	   * This program reads a student’s name, semester letter grades, and semester hours  from one file,
	   * calculates the semester GPA; and writes the student’s name and semester GPA to another file
	   * @param args
	   * @throws IOException
	   */
	  public static void main(String[] args) throws IOException
	  {
	    Scanner inFile = openFile();
	    String[] gradeSummary = processGrades(inFile);
	    inFile.close(); 	    
	    storeGpa(gradeSummary);
	    System.out.println("Data processing complete.");
	  } // end main
	  
    
	/**
	 * This method prompts for and retrieves a file name from the user and creates it unless it exists. 
	 * @return  Scanner object that refers to the opened input file.
	 * @throws IOException
	 */
	static Scanner openFile() throws IOException {		
		
		Scanner input = new Scanner(System.in);		
		
		System.out.print("Enter grade input file in the form filename.ext:");		
		String filename = input.nextLine();
				
		File file = new File(filename);
		
		if (!file.exists()) {
			System.out.println(file.getName()+ " does not exist");
			System.exit(1);
		}		
		
		input = new Scanner(file);
		return input; 		
	}



	/**
	 * @precondition  the input file parameter has been successfully opened.
	 * @param inFile,  Scanner object that refers to the input file.
	 * @return array of String which contains the student's name and GPA
	 * @throws IOException
	 */
	static String [] processGrades(Scanner inFile) throws IOException{
		String [] result= new String [3] ;
		
		String studentName = inFile.nextLine();
		
		result[0] = studentName;
		
		float totalQualityPoint = 0;
		int totalHours = 0;
		while (inFile.hasNextLine()) {
		
			String gradeInfo = inFile.nextLine();
			String [] gradeInfoArray= gradeInfo.split(",");
			int hours = Integer.parseInt(gradeInfoArray[1]);
			int point = 0;
			//System.out.println(gradeInfoArray[0] + " " + gradeInfoArray[1]);
			
			switch(gradeInfoArray[0]) {
				case "A":
					point = 4;
					break;
				case "B":
					point = 3;
					break;
				case "C":
					point = 2;
					break;
				case "D":
					point = 1;
					break;			
			}
			
			totalHours += hours; 
			totalQualityPoint += (point * hours);			
		}
		
		
		float gpa = totalQualityPoint / totalHours;

		DecimalFormat df = new DecimalFormat("0.00");
		df.setMaximumFractionDigits(2);		
		result[1] = df.format(gpa);		
		return result;
	}
	
	/**
	 * 
	 * @param gradeSummary, array of string which contains the student's name and GPA
	 * @throws IOException
	 * @return void, creates afile with the student's name and stores student's the name and GPA in the file. 
	 */	
	static void storeGpa(String [] gradeSummary) throws IOException {
		String filename = gradeSummary[0] + ".csv";		
		PrintWriter outFile = new PrintWriter(filename);		
		outFile.println(gradeSummary[0] + "," + gradeSummary[1]);
		outFile.close();
	}
}
