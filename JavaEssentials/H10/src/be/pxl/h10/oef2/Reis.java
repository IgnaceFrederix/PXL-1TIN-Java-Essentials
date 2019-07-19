package be.pxl.h10.oef2;

public abstract class Reis {
private String bestemming;
private double prijs;
private static final int MINIMUMPRIJS = 5;
public Reis(String bestemming){
	this(bestemming,MINIMUMPRIJS);
	controleBestemming();
}
public Reis(String bestemming,double prijs){
	this.bestemming = bestemming;
	this.prijs = prijs;
	controleBestemming();
}
public String getBestemming() {
	return bestemming;
}
public void setBestemming(String bestemming) {
	this.bestemming = bestemming;
	controleBestemming();
}
public double getPrijs() {
	return prijs;
}
public void setPrijs(double prijs) {
	this.prijs = prijs;
}
public static int getMinimumprijs() {
	return MINIMUMPRIJS;
}
private void controleBestemming(){
	String s = bestemming;
	if(!bestemming.isEmpty() && Character.isDigit(this.bestemming.charAt(0))){
		this.bestemming = s.substring(1,s.length());
	}
}
public void print(){
	System.out.println("Reis met bestemming " + bestemming + " kost "+prijs+" euro.");
}
}
