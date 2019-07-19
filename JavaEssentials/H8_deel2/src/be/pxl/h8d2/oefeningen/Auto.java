package be.pxl.h8d2.oefeningen;

public class Auto {
private String merk;
private String model;
private int bouwjaar;
private String kleur;
private int maxSnelheid;
private static final int MAX = 180;
private static int aantalautos;
{
	aantalautos++;
}
public Auto (Auto k){
	this.merk = k.merk;
	this.model = k.model;
	this.bouwjaar = k.bouwjaar;
	this.kleur = k.kleur;
	this.maxSnelheid = k.maxSnelheid;
}
public Auto (String merk,String model,int bouwjaar,String kleur,int maxSnelheid){
	this.merk = merk;
	this.model = model;
	this.bouwjaar = bouwjaar;
	this.kleur = kleur;
	controle();
	this.maxSnelheid = maxSnelheid;
}
public void controle(){
	if (this.maxSnelheid > 180) {
		this.maxSnelheid = 180;
	}
}
public Auto(){
	this("VW","Polo",2015,"grijs",160);
}

public String getMerk() {
	return merk;
}
public void setMerk(String merk) {
	this.merk = merk;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getBouwjaar() {
	return bouwjaar;
}
public void setBouwjaar(int bouwjaar) {
	this.bouwjaar = bouwjaar;
}
public String getKleur() {
	return kleur;
}
public void setKleur(String kleur) {
	this.kleur = kleur;
}
public int getMaxSnelheid() {
	return maxSnelheid;
}
public void setMaxSnelheid(int maxSnelheid) {
	this.maxSnelheid = maxSnelheid;
}
public static int getMax() {
	return MAX;
}
public void print(){
	controle();
	System.out.println("Merk: " +merk +" - Model: " + model + " - Bouwjaar: " + bouwjaar + "- Kleur: " + kleur + " - MaxSpeed: " + maxSnelheid );
}
public static int gettotaalautos(){
	return aantalautos;
}
}
