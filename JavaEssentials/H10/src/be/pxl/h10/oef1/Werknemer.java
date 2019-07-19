package be.pxl.h10.oef1;
import be.pxl.h10.voorbeeld.Persoon;
public class Werknemer extends Persoon {
private String functie;
private double salaris;
private static final int MINIMUM = 1000;
private static int teller =0;
{teller++;}

public Werknemer(String naam,String voornaam){
	this(naam,voornaam,"Algemeen bediende",1800);
	
}
public Werknemer(String naam,String voornaam,String functie,double salaris){
	super(naam,voornaam);
	this.functie = functie;
	this.salaris = salaris;
	controle();
}
public String getFunctie() {
	return functie;
}
public static int getAantal(){
	return teller;
}
public void setFunctie(String functie) {
	this.functie = functie;
}
public double getSalaris() {
	return salaris;
}
public int getMINIMUM(){
	return MINIMUM;
}
public void setSalaris(double salaris) {
	this.salaris = salaris;
	controle();
}
public void controle(){
	if(salaris < MINIMUM){
		this.salaris = MINIMUM;
	}
}
public String print(){
	return super.print() + "\nFunctie= "+this.functie+"\n"+"Salaris= "+this.salaris;
}

}
