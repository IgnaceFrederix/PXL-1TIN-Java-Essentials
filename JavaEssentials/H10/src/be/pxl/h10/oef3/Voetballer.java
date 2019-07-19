package be.pxl.h10.oef3;

import java.util.Arrays;

public final class Voetballer extends Sporter{
private String club;
private String[] opstellingwaarden = {"middenvelder","aanvaller","verdediger","onbepaald"};
private String opstelling;
public void controle(){
	if(!Arrays.asList(opstellingwaarden).contains(opstelling)){
		opstelling = "onbekend";
	}	
}
public Voetballer(String naam,String voornaam){
	super(naam,voornaam);
	club = "onbepaald";
	opstelling = "onbepaald";
	super.setOmschrijving("voetbal");
}
public Voetballer(String naam, String voornaam,String club,int opstelling){
this(naam,voornaam);
this.club = club;
this.opstelling = opstellingwaarden[opstelling];
controle();
}
public String getClub() {
	return club;
}
public void setClub(String club) {
	this.club = club;
}
public String getOpstelling() {
	return opstelling;
}
public void setOpstelling(String opstelling) {
	this.opstelling = opstelling;
}
public String print(){
	return super.print() + "\nclub; "+club+" opstelling "+opstelling;
}
}
