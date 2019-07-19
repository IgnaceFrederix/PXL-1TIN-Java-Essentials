package opdrachtenh12;
import java.util.*;
public class Opdracht1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		String waarde = k.next();
		
		
		//Integer i = new Integer(Integer.parseInt(waarde));
		Integer i = Integer.valueOf(waarde);
		i++;
		System.out.println(i);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		k.close();
		
	}

}
