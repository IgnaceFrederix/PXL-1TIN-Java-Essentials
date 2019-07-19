package opdracht3;

import java.util.Scanner;

public class Opdracht3 {

	public static void main(String[] args) {

		try{
			
			
			 Scanner keyboard = new Scanner(System.in);	   
				int numerator = Integer.parseInt(keyboard.next());
				int denominator = Integer.parseInt(keyboard.next());
				int division = numerator / denominator;

				System.out.println(numerator + "/" + denominator + "="
						+ division);
				keyboard.close();
			} catch (ArithmeticException ex){
				System.out.println("Delen door 0 kan niet");
			
				
			}
			System.out.println("dit word ook nog uitgebvoerd");
	}
	}


