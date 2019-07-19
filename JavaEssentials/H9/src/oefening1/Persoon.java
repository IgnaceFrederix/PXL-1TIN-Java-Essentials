package oefening1;

public class Persoon {
private String naam,voornaam;
private Datum geboortedatum;
private adres adrespersoon;
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
public adres getAdrespersoon() {
	return adrespersoon;
}
public void setAdrespersoon(adres adrespersoon) {
	this.adrespersoon = adrespersoon;
}
public Datum getGeboortedatum() {
	return geboortedatum;
}
public Persoon(String naam,String voornaam,int dag,int maand,int jaar,String straatnaam,
		String huisnr,int postcode,String gemeente){
	this(naam,voornaam,new Datum(dag,maand,jaar), new adres(straatnaam,huisnr,postcode,gemeente));
}
public Persoon(String naam, String voornaam, Datum d,adres a){
	this.naam = naam;
	this.voornaam = voornaam;
	geboortedatum = d;
	adrespersoon = a;
}
public void VoegVoornamentoe(String... voornamen){
	for(String vn : voornamen){
		voornaam += " "+vn;
	}
}
public String toString(){
	return voornaam+" "+naam+"\n"+adrespersoon.getStraat()+" "+adrespersoon.getHuisnr()+"\n" +adrespersoon.getGemeente().toString();
}
}
