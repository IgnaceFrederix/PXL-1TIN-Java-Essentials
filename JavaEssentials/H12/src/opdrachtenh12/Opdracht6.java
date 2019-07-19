package opdrachtenh12;

import java.time.LocalDate;

public class Opdracht6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate datum = LocalDate.of(1997, 3, 11);
		System.out.println(datum.getDayOfYear());
		System.out.println(datum.getDayOfWeek());
		System.out.println(datum.isLeapYear());
	}

}
