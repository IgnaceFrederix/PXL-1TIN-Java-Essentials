package be.pxl.examen.vraag1;

public class VerkoopZaal extends Afdeling{


	private String catalogus;
	
	public VerkoopZaal(String naam){
		super(naam);
	}
	public String getCatalogus() {
		return catalogus;
	}

	public void setCatalogus(String catalogus) {
		this.catalogus = catalogus;
	}
}
