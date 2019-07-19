package oefening4;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class VluchtApp {

	public static void main(String[] args) {
		Instant before= Instant.now();
		Scanner k = new Scanner(System.in);
		//LocalDateTime vertrekmoment=LocalDateTime.parse(k.nextLine(), formatter);
		Vlucht[] v = new Vlucht[7];
		v[0] = new Vlucht("America","New_York",8,30);
		v[1] = new Vlucht("Africa","Luanda",8,40);
		v[2] = new Vlucht("Asia","Beirut",4,10);
		v[3] = new Vlucht("Asia","Bangkok",11,5);
		v[4] = new Vlucht("Asia","Tokyo",11,20);
		v[5] = new Vlucht("America","Montreal",7,55);
		v[6] = new Vlucht("Atlantic","Reykjavik",3,25);
		ZonedDateTime[] z = new ZonedDateTime[7];
		int teller = 0;
		String[] regio = new String[7];
		String[] stad = new String[7];
		int[] u = new int[7];
		int[] m = new int[7];
	for(Vlucht j:v){
		//z[teller] = ZonedDateTime.now(zone)
		regio[teller] = v[teller].getRegio();
		stad[teller] = v[teller].getStad();
		u[teller] = v[teller].getDuurUur();
		m[teller] = v[teller].getDuurMin();
		teller++;
		}
	
	DateTimeFormatter myformatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	LocalDateTime vertrekmoment = LocalDateTime.parse(k.nextLine(),myformatter);
	ZoneId vertrekzone = ZoneId.of("Europe/Brussels");
	ZonedDateTime vertrek = ZonedDateTime.of(vertrekmoment, vertrekzone);
	ZoneId aankomstzone;
	ZonedDateTime aankomstlokaal,aankomst;
	LocalDateTime aankomstmoment;
	for(int i=0;i<v.length;i++){
		System.out.printf("Vlucht vanuit Zaventem naar %s (%s) \n",stad[i],regio[i]);
		aankomstzone = ZoneId.of((regio[i]+"/"+stad[i]));
		aankomst = vertrek.plusHours(u[i]).plusMinutes(m[i]);
		aankomstlokaal = vertrek.withZoneSameInstant(aankomstzone).plusHours(u[i]).plusMinutes(m[i]);
		System.out.println("Vertrek "+myformatter.format(vertrek));
		System.out.println("Aankomst(onze tijd):"+myformatter.format(aankomst));
		System.out.println("Aankomst lokale tijd "+myformatter.format(aankomstlokaal));
		System.out.println();
	}
	Instant later = Instant.now();
	long duration = later.getEpochSecond() - before.getEpochSecond();
	System.out.println("het duurde "+duration*1000+" milliseconden");
	k.close();	
	}

}
