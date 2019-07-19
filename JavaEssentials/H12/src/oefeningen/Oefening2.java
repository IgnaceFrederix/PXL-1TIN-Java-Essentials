package oefeningen;
import java.math.BigInteger;
import java.util.*;


public class Oefening2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner k = new Scanner(System.in);
		
		Random rand = new Random();
		System.out.println("Geef het aantal getallen in");
		int aantal = k.nextInt();
		System.out.println("geef een minimum waarde in");
		int kleinste=k.nextInt(); 
		System.out.println("geef maximum waarde in");
		int grootste=k.nextInt();
		int tussen = grootste;
		if(kleinste > grootste){
			grootste = kleinste;
			kleinste = tussen;
		}
		Integer[] getallen = new Integer[aantal];
		int som=0;
		System.out.println("Aantal getallen: "+getallen.length);
		System.out.println("kleinste getal(na wisseling): "+kleinste);
		System.out.println("grootste getal(na wisseling): "+grootste);
		for(int i =0;i<getallen.length;i++){
			getallen[i] = (rand.nextInt(21)-10);
			System.out.println(getallen[i]);
			som+=getallen[i];
		}
		
		double gemiddelde = ((double)som/getallen.length);
		
		System.out.printf("%s %.2f","Het gemiddelde is:",gemiddelde);
		System.out.println();
		BigInteger b = BigInteger.ZERO;
		BigInteger[] tabel = new BigInteger[aantal];
		for(int i =0;i<tabel.length;i++){
			BigInteger getalbig = new BigInteger(99,rand);
			tabel[i] = getalbig;
			System.out.println(tabel[i]);
		}
		k.close();
	}

}
