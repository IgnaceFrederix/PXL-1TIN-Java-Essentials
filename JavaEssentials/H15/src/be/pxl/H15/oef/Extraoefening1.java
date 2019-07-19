package be.pxl.H15.oef;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Extraoefening1 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("geef 1-7 in");
		try {
		DayOfWeek dag = DayOfWeek.of(k.nextInt());
		System.out.println(dag);
		System.out.println("dagen bij optellen?");
		dag = dag.plus(k.nextLong());
		System.out.println(dag);
		} catch (DateTimeException ex) {
			System.out.println("Gelieve je in te geven waarden te checken");
		}catch (InputMismatchException ex){
			System.out.println("Foutieve nummer");
		}
		
	}

}
