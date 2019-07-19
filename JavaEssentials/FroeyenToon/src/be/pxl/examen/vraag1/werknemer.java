package be.pxl.examen.vraag1;

public abstract class werknemer implements Activiteit{

	private String naam;
	protected int aantalCalorieen;
	private Bedrijf bedrijf;
	protected static Afdeling afdeling;
	
	public werknemer(String naam, Afdeling afdeling){
		werknemer.afdeling = afdeling;
		this.naam = naam;
	}
	
	public String getNaam() {
		return naam;
	}
	public int getAantalCalorieen() {
		return aantalCalorieen;
	}
	public Bedrijf getBedrijf() {
		return bedrijf;
	}
	public static Afdeling getAfdeling() {
		return afdeling;
	}
}
