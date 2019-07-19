package h8oefeningen;

public class Klas {
private String naamklas;
private int aantalstud;
//public static final int maxaantal = 40;
private static int maxaantal;
private static int aantalklassen;
private static int totaalaantalstudenten;
//statick block 'Block uitgevoerd wanneer de klas 1e keer gebruikt wordt
static {
	maxaantal = 40;
}
//initialisatie block: wordt uitgevoerd als object geroepen wordt.
{
	aantalklassen ++;
}
public Klas(String naamklas,int aantalstud){
	this.naamklas = naamklas;
	setAantalstud(aantalstud);
;
	//this.aantalstud = aantalstud;
}
public Klas(){
	this ("TINx",0);
}
public String getNaamklas() {
	return naamklas;
}
public void setNaamklas(String naamklas) {
	this.naamklas = naamklas;
}
public int getAantalstud() {
	return aantalstud;
}
 
public void setAantalstud(int aantalstud) {
	if (aantalstud > maxaantal){
		aantalstud = maxaantal;
	}
	totaalaantalstudenten -= this.aantalstud;
	this.aantalstud = aantalstud;
	totaalaantalstudenten += this.aantalstud;
}
public static int getMaxaantal() {
	return maxaantal;
}
//public int aantalobjecten(){
//	return aantalstud;
//}
public static int getaantalklassen(){
	return aantalklassen;
}
public static int getstudenten(){
	return totaalaantalstudenten;
}

}
