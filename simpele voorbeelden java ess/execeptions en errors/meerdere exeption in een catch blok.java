package opdracht4;

import java.util.Scanner;

public class Opdracht4 {
	public static void main(String[] args) {
	try{
		
		
		 Scanner keyboard = new Scanner(System.in);	   
			int numerator = Integer.parseInt(keyboard.next());
			int denominator = Integer.parseInt(keyboard.next());
			int division = numerator / denominator;

			System.out.println(numerator + "/" + denominator + "="
					+ division);
			keyboard.close();
		}
	//eerste mogelijkheid
	//catch(RuntimeException ex){
		//	System.out.println(" er heeft zich een fout voorgedaan");
			//System.out.println(ex.getMessage());
			
	catch(NumberFormatException | ArithmeticException ex){
			System.out.println(" er heeft zich een fout voorgedaan");
			System.out.println(ex.getMessage());
			
		}
		System.out.println("dit word ook nog uitgebvoerd");

}
}
