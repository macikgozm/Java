import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class CalculateScores {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the name of the file: ");		
		String filename = input.next();  
		System.out.println(filename);
		
		File file = new File(filename);
		
		if (!file.exists()) {
			System.out.println(file.getName() + " dose not exist");
			System.exit(1);
			
		}
		
		input = new Scanner(file);
		int numOfGames = 18;
		int [] scoresArrayInt = new int[numOfGames];
		int sumA = 0;
		int sumB = 0;
		int cnt = 0;
		while(input.hasNextLine()) {
			String scoresInfo = input.nextLine();
			String [] scoresInfoArray = scoresInfo.split(",");
			int a = Integer.parseInt(scoresInfoArray[0]);
			int b = Integer.parseInt(scoresInfoArray[1]);
			sumA += a;
			sumB += b;
			
				if (a > b) {
					scoresArrayInt[cnt] = 1;
				}
				else if (a == b) {
					scoresArrayInt[cnt] = 0;
	
				}
				else {
					scoresArrayInt[cnt] = 2;	
				}
			
			cnt++;
		}
		
		
		System.out.println("sumA : "+ sumA);
		System.out.println("sumB : "+ sumB);
		
		for (int i = 0 ; i < numOfGames; i++)
			System.out.println(	scoresArrayInt[i] );
		
		input.close();
		
	}

}
