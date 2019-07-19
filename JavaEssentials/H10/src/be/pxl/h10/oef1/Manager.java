package be.pxl.h10.oef1;

public class Manager extends Werknemer{
private int bonus;
private static int teller;
{teller++;}
public Manager(String naam,String voornaam,double salaris,String functie){
	this(naam,voornaam,salaris,functie,50);
	
}
public static int getAantal(){
	return teller;
}
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}
public Manager(String naam,String voornaam,double salaris,String functie,int bonus){
	super(naam,voornaam,functie,salaris);
	this.bonus = bonus;
}
public double getSalaris(){
	return super.getSalaris() + bonus;
}
public double getProcAandeelManagers(){
	double perc = (double) getAantal() / Werknemer.getAantal() *100;
	return Math.round(perc *100)/100.0;
}
}
