package opdrachtenh12;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class Opdracht8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate datum = LocalDate.of(1997, 3, 11);
		LocalDate now = LocalDate.now();
		Period p = Period.between(datum, now);
		System.out.println("jaar : "+p.getYears());
		System.out.println("maand: "+p.getMonths());
		System.out.println("dag  : "+p.getDays());
		long months = ChronoUnit.MONTHS.between(datum,now );
		System.out.println(months);
	}

}
