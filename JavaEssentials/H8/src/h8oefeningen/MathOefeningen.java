package h8oefeningen;
import java.util.*;
import static java.lang.Math.*;
public class MathOefeningen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een getal in:");
		int resultaat,getal = keyboard.nextInt();
		resultaat = (int) Math.pow(getal, 3);
		System.out.println("de uitkomst is: " + resultaat);
		System.out.println("geef de straal van de cirkel :");
		double oppervlaktecirkel = keyboard.nextDouble();
		double d = 2*sqrt(oppervlaktecirkel/PI);
		System.out.printf("%.2f",d);
		keyboard.close();
	}

}
