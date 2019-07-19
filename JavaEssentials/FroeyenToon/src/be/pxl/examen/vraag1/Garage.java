package be.pxl.examen.vraag1;

public class Garage extends Afdeling{

	private String magazijn;

	public Garage(String naam) {
		super(naam);
	}

	public String getMagazijn() {
		return magazijn;
	}

	public void setMagazijn(String magazijn) {
		this.magazijn = magazijn;
	}
}
