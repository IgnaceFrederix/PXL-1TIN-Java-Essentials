package opdracht4;

import java.time.Instant;
import java.util.Scanner;

public class Opdracht4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Instant begin = Instant.now();
		System.out.println("geef een voornaam in");
		String voor= input.nextLine();
		System.out.println("geef een famileinaam in");
		String fam = input.nextLine();
		Instant einde = Instant.now();
		long duur = einde.getEpochSecond() - begin.getEpochSecond();
		System.out.println(duur);
		
		
		input.close();

	}

}
