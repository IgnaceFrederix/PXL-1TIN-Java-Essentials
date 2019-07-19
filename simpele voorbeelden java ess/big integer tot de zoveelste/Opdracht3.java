package opdracht3;

import java.math.BigInteger;
import java.util.Scanner;

public class Opdracht3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal = input.nextInt();
		long prod = 1;
		
		for(int i = 2; i<= getal; i++){
			prod = prod*i;
			
		}
		System.out.println(prod);
		
		
		BigInteger b = BigInteger.ONE;
		for(int i = 2; i<= getal; i++){
			b = b.multiply(new BigInteger(i+""));
		}
		System.out.println(b);
				
				
input.close();
	}

}
