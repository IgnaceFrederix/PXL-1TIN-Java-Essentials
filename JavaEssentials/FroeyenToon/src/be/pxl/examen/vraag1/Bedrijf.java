package be.pxl.examen.vraag1;

public class Bedrijf {

	private String naam;
	private String adres;
	private Afdeling garage;
	private Afdeling verkoopZaal;
	
	public Bedrijf(String naam) {
		this.naam = naam;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getNaam() {
		return naam;
	}
	public void setGarage(Afdeling garage) {
		this.garage = garage;
	}
	public void setVerkoopZaal(Afdeling verkoopZaal) {
		this.verkoopZaal = verkoopZaal;
	}
	public Afdeling getGarage() {
		return garage;
	}
	public Afdeling getVerkoopZaal() {
		return verkoopZaal;
	}
}
