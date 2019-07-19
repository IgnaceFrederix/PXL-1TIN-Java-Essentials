package be.pxl.h10.voorbeeld;

public class Lector extends Persoon{
	private int personeelsnummer,aanstellingsperc;
	private double salaris;
	public Lector(String naam,String voornaam,int personeelsnummer,int aanstellingsperc,double salaris){
		super(naam,voornaam);
		this.personeelsnummer=personeelsnummer;
		this.aanstellingsperc=aanstellingsperc;
		this.salaris = salaris;
	}
	public Lector(String naam,String voornaam,int aanstellingsperc,double salaris){
		super(naam,voornaam);
		this.aanstellingsperc=aanstellingsperc;
		this.salaris = salaris;
	}
	public Lector(){
		this("onbekend","onbekend",20009999,100,2000);
		
		personeelsnummer = 20009999;
		aanstellingsperc = 100;
		salaris = 2000;
	}
	public int getPersoneelsnummer() {
		return personeelsnummer;
	}
	public void setPersoneelsnummer(int personeelsnummer) {
		this.personeelsnummer = personeelsnummer;
	}
	public int getAanstellingsperc() {
		return aanstellingsperc;
	}
	public void setAanstellingsperc(int aanstellingsperc) {
		
		if(aanstellingsperc > 100){
			aanstellingsperc = 100;
		}
		if(aanstellingsperc < 0){
			aanstellingsperc = 0;
		}
		if(this.aanstellingsperc !=0 && salaris !=0){
			salaris = salaris * (double)aanstellingsperc / this.aanstellingsperc;
		}
		this.aanstellingsperc = aanstellingsperc;
	}
	public double getSalaris() {
		return salaris;
	}
	public void setSalaris(double salaris) {
		this.salaris = salaris;
	}
	public String print(){
		
		
		return super.print()+"\nPersoneelsnummer " +personeelsnummer+"\naanstellingspercentage " +aanstellingsperc
				+salaris +"salaris";	
	}
}
