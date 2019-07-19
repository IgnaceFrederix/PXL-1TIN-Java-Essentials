package opdrachtenh12;
import java.time.DayOfWeek;
import java.util.*;
public class Opdracht5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("geef 1-7 in");
		DayOfWeek dag = DayOfWeek.of(k.nextInt());
		System.out.println(dag);
		System.out.println("dagen bij optellen?");
		dag = dag.plus(k.nextLong());
		System.out.println(dag);
	}

}
