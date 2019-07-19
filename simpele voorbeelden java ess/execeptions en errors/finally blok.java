package opdracht5;

import java.util.Scanner;

public class Opdracht5 {
	public static void main(String[] args) {
	try{
		
		
		 Scanner keyboard = new Scanner(System.in);	   
			int numerator = Integer.parseInt(keyboard.next());
			int denominator = Integer.parseInt(keyboard.next());
			int division = numerator / denominator;

			System.out.println(numerator + "/" + denominator + "="
					+ division);
			keyboard.close();
		} catch(NumberFormatException ex){
			System.out.println(" er heeft zich een fout voorgedaan");
			System.out.println(ex.getMessage());
			
		}
		
	finally{
		System.out.println("dit wordt ook nog uitgevoerd ookal word er een fout ge daan");
	}
	}
}
