package be.pxl.h10.voorbeeld;

public class Persoon {
private String naam,voornaam;
private static int teller=0;

	{teller++;}

public Persoon(){
	this("?","?");
}
public Persoon(String naam,String voornaam){
	this.naam = naam;
	this.voornaam = voornaam;
}
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
public String print(){
	return "naam: "+voornaam+" "+naam;
}
public static int getAantal(){
	return teller;
}
}
