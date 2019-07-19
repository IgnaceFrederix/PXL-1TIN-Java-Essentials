package oefs;

public class Persoon {
private String voornaam,naam;
private static int aantal;
{aantal++;}
public Persoon(String voornaam, String naam) {
	super();
	this.voornaam = voornaam;
	this.naam = naam;
}
public static int getAantal(){
	return aantal;
}
public Persoon(){
	this("lolo","hey");
}
public String getVoornaam() {
	return voornaam;
}
public void setVoornaam(String voornaam) {
	this.voornaam = voornaam;
}
public String getNaam() {
	return naam;
}
public void setNaam(String naam) {
	this.naam = naam;
}
public void print(){
	System.out.println("naam = "+naam+"\nvoornaam "+voornaam);
}
}
