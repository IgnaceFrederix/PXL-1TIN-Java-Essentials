package be.pxl.h12.oef3;
import java.sql.Date;
import java.time.*;
import java.util.Calendar;
public class HuwelijkAppBis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d = LocalDate.of(1958, 4, 29);
		adres a = new adres("Bloemweg","5",3500,"Hasselt");
		Persoon p = new Persoon("An","Petersen",d,a);
		System.out.println("Persoon 1 "+p.getNaam()+" "+p.getVoornaam()+" geboren op "+p.datumweergeven().getDayOfMonth()+"/"+p.datumweergeven().getMonthValue()+"/"+p.datumweergeven().getYear()+" wonend te "+p.getAdrespersoon());
		
		LocalDate d2 = LocalDate.of(1954, 7, 13);
		adres a2 = new adres("Bloemweg","5",3500,"Hasselt");
		Persoon p2 = new Persoon("Dirk","Janssen",d2,a2);
		System.out.println("Persoon 2 "+p2.getNaam()+" "+p2.getVoornaam()+" geboren op "+p2.datumweergeven().getDayOfMonth()+"/"+p2.datumweergeven().getMonthValue()+"/"+p2.datumweergeven().getYear()+" wonend te "+p2.getAdrespersoon());
		System.out.println(p2.getLeeftijd());
		DayOfWeek d5;
		LocalDate d1 = LocalDate.of(1987, 6, 1);
		d5=d1.getDayOfWeek();
		d1.plusDays(6-(d5.getValue()));
		LocalDate now = LocalDate.now();
		Period period = Period.between(d1, now);
		int jaren = period.getYears();
		System.out.println(d1);
		System.out.println(p.getNaam().toUpperCase()+" ("+p.getLeeftijd()+") "+" en "+p2.getNaam().toUpperCase()+" ("+p.getLeeftijd()+")"+ "zijn "+jaren+" jaar getrouwd");
		Huwelijk h = new Huwelijk(p,p2,29,4,1958);
		h.printFeest();
		//Da
		//LocalDate d3 = LocalDate.of(1987, m,)
		
	}

}
