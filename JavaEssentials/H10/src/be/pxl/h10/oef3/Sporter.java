package be.pxl.h10.oef3;
import be.pxl.h10.voorbeeld.*;
public class Sporter extends Persoon{
private String omschrijving;
private static int teller;
{teller++;}
public Sporter (String naam,String voornaam){
	this(naam,voornaam,"onbekend");	
}

public Sporter (String naam, String voornaam,String omschrijving){
	super(naam,voornaam);
	this.omschrijving = omschrijving;
}

public String getOmschrijving() {
	return omschrijving;
}

public void setOmschrijving(String omschrijving) {
	this.omschrijving = omschrijving;
}

public static int getTeller() {
	return teller;
}
public String print(){
	super.print();
	return super.print()+"\n"+omschrijving;
}
}
