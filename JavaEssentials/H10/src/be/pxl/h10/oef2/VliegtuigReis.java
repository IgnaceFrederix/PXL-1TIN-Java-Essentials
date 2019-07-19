package be.pxl.h10.oef2;

public class VliegtuigReis extends Reis{
private String vluchtnummer;
private static final int MINIMUMPRIJS = 25;
{
	if(super.getPrijs() < 25){
		super.setPrijs(MINIMUMPRIJS); 
	}
}
public VliegtuigReis(String bestemming){
	super(bestemming);
	vluchtnummer = super.getBestemming().substring(0,1) + "999";
}
private void controle(){
	
	if(vluchtnummer.substring(0, 1) != super.getBestemming().substring(0, 1)){
	vluchtnummer = super.getBestemming().substring(0, 1).toUpperCase() + vluchtnummer;	
	}
}
public String getVluchtnummer() {
	return vluchtnummer;
}
public void setVluchtnummer(String vluchtnummer) {
	this.vluchtnummer = vluchtnummer;
	controle();
}
public static int getMinimumprijs() {
	return MINIMUMPRIJS;
}
public void print(){
	if(super.getPrijs() < MINIMUMPRIJS){
		super.setPrijs(MINIMUMPRIJS);
	}
	super.print();
	System.out.println("Vliegtuigreis (vluchtnr "+ vluchtnummer+")");
}
}
