package h11.pxl.be.ExtraOefening1;

public class Tshirt {
private String kleur;
private String maat; 
private int aantal=0;

public Tshirt(String maat,String kleur){
	this.kleur = kleur;
	this.maat = maat;
}
public int setaantal(int aantal){
	return this.aantal +=aantal;
}
public  int getAantal() {
	return aantal;
}
public String getKleur() {
	return kleur;
}
public void setKleur(String kleur) {
	this.kleur = kleur;
}
public String getMaat() {
	return maat;
}
public void setMaat(String maat) {
	this.maat = maat;
}

}
