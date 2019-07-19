package be.pxl.h9_opdracht3;

public class Boek {
private String isbn;
private String titel;
private int bladzijden;
private Auteur auteur;

public Boek(){
	this("default","default",0,new Auteur());
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getTitel() {
	return titel;
}
public void setTitel(String titel) {
	this.titel = titel;
}
public int getBladzijden() {
	return bladzijden;
}
public void setBladzijden(int bladzijden) {
	this.bladzijden = bladzijden;
}
public Auteur getAuteur() {
	return auteur;
}
public void setAuteur(Auteur auteur) {
	this.auteur = auteur;
}
public Boek(String isbn,String titel,int blz,Auteur auteur){
	this.isbn = isbn;
	this.titel = titel;
	this.bladzijden = blz;
	this.auteur = auteur;
}
public void toongegevens(){
	System.out.println(isbn+" "+titel+" "+bladzijden+" "+auteur.toString());
						// === auteur.toString
}
}
