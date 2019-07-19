package H17.src.be.pxl.h17.oef5.copy;
import java.time.*;
public class Persoon {
private String naam,voornaam;
private LocalDate d;
private int leeftijd;

public String getNaam() {
	return naam;
}
public void setNaam(String naam) {
	this.naam = naam;
}
public String getVoornaam() {
	return voornaam;
}
public void setVoornaam(String voornaam) {
	this.voornaam = voornaam;
}


//public Datum getGeboortedatum() {
//	return geboortedatum;
//}
//public Persoon(String naam,String voornaam,int dag,int maand,int jaar,String straatnaam,
//		String huisnr,int postcode,String gemeente){
//	this(naam,voornaam,new Datum(dag,maand,jaar), new adres(straatnaam,huisnr,postcode,gemeente));
//}
public Persoon(String naam, String voornaam, LocalDate d){
	this.naam = naam;
	this.voornaam = voornaam;
	this.d=d;
}
public void VoegVoornamentoe(String... voornamen){
	for(String vn : voornamen){
		voornaam += " "+vn;
	}
}
public int getLeeftijd(){
	LocalDate now = LocalDate.now();
	Period period = Period.between(d, now);
	int k = period.getYears();
	
	return k;
}
public LocalDate datumweergeven(){
	return d;
}
public String toString(){
	return voornaam+" "+naam+"\n";
}
}
