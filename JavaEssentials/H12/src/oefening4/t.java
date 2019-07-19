package oefening4;

import java.time.DayOfWeek;
import java.time.LocalDate;
public class t {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		LocalDate initDate = LocalDate.parse("2001-03-10");
		
		
		for(int i = initDate.getYear(); i<=date.getYear();i++)
		{
			for(int j=1;j<=12;j++){
				LocalDate checkDate = LocalDate.parse(i+"-"+geefMaandMetNul(j)+"-13");
				
				if(checkDate.getDayOfWeek() == DayOfWeek.FRIDAY)
				{
					System.out.println(i+"-"+geefMaandMetNul(j)+"-13 == Vrijdag de 13e");
				}
			}
		}
	}
	
	public static String geefMaandMetNul(int maandNr)
	{
		String maand = Integer.toString(maandNr);
		if(maandNr < 10)
		{
			maand = "0" + maandNr;
		}
		
		return maand;
	}

}
