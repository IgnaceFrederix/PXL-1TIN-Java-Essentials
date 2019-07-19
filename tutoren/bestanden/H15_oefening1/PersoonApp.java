package oefening1;

import java.util.Scanner;

public class PersoonApp {

	public static void main(String[] args) {
		Scanner invoer =  new Scanner(System.in);
		System.out.println("geef de naam in");
		String naam =  invoer.nextLine();
		
		System.out.println("geef de leeftijd in");
		int lft =  invoer.nextInt();
		Persoon p = new Persoon(naam, lft);
		invoer.close();

	}

}
