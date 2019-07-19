package be.pxl.H13.oef2;



public abstract class Bouwgrond implements Verkoopbaar{
private String perceelNr,bouwVoorschrift;
private float perceelGrootte;
public Bouwgrond(float perceelGrootte,String perceelNr){
	this.perceelGrootte = perceelGrootte;
	this.perceelNr = perceelNr;
	
}
public String getPerceelNr() {
	return perceelNr;
}
public void setPerceelNr(String perceelNr) {
	this.perceelNr = perceelNr;
}
public float getPerceelGrootte() {
	return perceelGrootte;
}
public void setPerceelGrootte(float perceelGrootte) {
	this.perceelGrootte = perceelGrootte;
}
public String getBouwVoorschrift() {
	return bouwVoorschrift;
}
public void setBouwVoorschrift(String bouwVoorschrift) {
	this.bouwVoorschrift = bouwVoorschrift;
}

}