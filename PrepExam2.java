import java.util.Scanner;

public class PrepExam2 {

	public static void main(String[] args) {

		/**
		System.out.println("=================Unit 4================");
		int number = 1;
		String name = "";
		String name2 = "Mehmet  ";	
		String sentence = "Welcome Mehmet";
		String numberString = "13";
		boolean hasName = false;
		int letter = 'A';
		
		System.out.println("number : " + Math.sin(number) );
		System.out.println("name : " + name );
		System.out.println("hasName: " + hasName );
		System.out.println("letter : " + letter);
		System.out.println("3 ncu karakter: " + name2.length());
		System.out.println("3 ncu karakter: " + name2.charAt(2));
		int size = name2.length();
		System.out.println("3 ncu karakter: " + name2.charAt(0));
		System.out.println("3 ncu karakter: " + name2.charAt(size-1));
		System.out.println("3 ncu karakter: " + name2.trim());
		System.out.println("3 ncu karakter: " + name2.toUpperCase());
		
		System.out.println("Sayi: " + number);
		System.out.println(number + ". Sayi" );
		
		System.out.print("Enter a number ");
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		System.out.println("Sayi entered is: " + sayi);
		
		System.out.println(sentence.substring(0,6));
		
		int numberToInt = Integer.parseInt(numberString);
		System.out.println("Sayi converted from Stringbis: " + numberToInt);
		**/
		
		System.out.println("=================Unit 5================");
		
		
		int count = 0;
		while (count < 10) {
			System.out.print(count + " ");
			count++;
		}
		
		System.out.println();

		for (int i = 0; i < 10 ; i++) {
			System.out.print(i + " ");			

		}
		
		System.out.println();

		
		count = 0;
		do {
			count++;
			System.out.print(count+ " ");
		} while (count < 10);
		

		System.out.println();


		int [] array = {1, 2, 3};
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		
		System.out.println();

		for (int value:array) {
			System.out.print(value+ " ");
		}
		
		System.out.println();

		//String ad1 = "Ali";		
		//String ad2 = "Veli";
		//System.out.println("ad1 " +ad1 + " Ad2 " + ad2);

		//swap(ad1, ad2);
		//System.out.println("ad1 " +ad1 + " Ad2 " + ad2);

		String [] myList = new String[10];
		
		//System.out.print(u\0000);
		
		System.out.print(myList.length+"\n");
		for (String value:myList) {
			System.out.print(value + " " );
		}
		
		System.out.println("\n\n\n");
		
		Integer num1 = 5;
		Integer num2 = 4;
		System.out.println("num1 " + num1 + " num2 " + num2);
		swap(num1, num2);
		System.out.println("num1 " + num1 + " num2 " + num2);
		
		
	}
	
	public static void swap(Integer num1, Integer num2) {
		Integer temp = num1;
		num1 = num2;
		num2 = temp;
		//System.out.println("num1 " + num1 + " num2 " + num2);

	}

}
