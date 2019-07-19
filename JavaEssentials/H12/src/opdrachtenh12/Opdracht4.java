package opdrachtenh12;
import java.time.*;
import java.util.*;
public class Opdracht4 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Instant before= Instant.now();
		System.out.println("geef je naam in");
		String naam = k.nextLine();
		Instant later = Instant.now();
		long duration = later.getEpochSecond() - before.getEpochSecond();
		System.out.println(duration + " seconds");
		k.close();
	}

}
