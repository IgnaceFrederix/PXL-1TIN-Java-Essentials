package be.pxl.h12.oef3;

public class adres {
private String straat;
private String huisnr;
private Gemeente gemeente;

public adres(String straat, String huisnr,int postcode,String gem){
	gemeente = new Gemeente(postcode,gem);
	this.straat = straat;
	this.huisnr = huisnr;
}

public String getStraat() {
	return straat;
}

public void setStraat(String straat) {
	this.straat = straat;
}

public String getHuisnr() {
	return huisnr;
}

public void setHuisnr(String huisnr) {
	this.huisnr = huisnr;
}

public Gemeente getGemeente() {
	return gemeente;
}
public String toString(){
	return straat.toString() + " " + huisnr.toString() + ", " + gemeente.toString();
}
}
