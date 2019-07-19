package opdrachtenh12;

import java.math.BigInteger;

public class Opdracht3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(faculteit());
	}
	public static BigInteger faculteit(){
		BigInteger resultaat = BigInteger.ONE;
		for(int i = 2;i<15;i++){
			resultaat = resultaat.multiply(BigInteger.valueOf(i));
		}
		return resultaat;
	}

}
