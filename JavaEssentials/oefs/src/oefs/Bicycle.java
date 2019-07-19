package oefs;

public class Bicycle {
private int omwentelling,versnelling,snelheid;
public Bicycle(int omwentelling,int versnelling,int snelheid){
	this.omwentelling = omwentelling;
	this.versnelling = versnelling;
	this.snelheid=snelheid;
}
public int getOmwentelling() {
	return omwentelling;
}
public void setOmwentelling(int omwentelling) {
	this.omwentelling = omwentelling;
}
public int getVersnelling() {
	return versnelling;
}
public void setVersnelling(int versnelling) {
	this.versnelling = versnelling;
}
public int getSnelheid() {
	return snelheid;
}
public void setSnelheid(int snelheid) {
	this.snelheid = snelheid;
}
public void print(){
	System.out.println("heyeyeyye");
}
}
