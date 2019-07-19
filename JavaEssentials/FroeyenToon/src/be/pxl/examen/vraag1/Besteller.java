package be.pxl.examen.vraag1;

public class Besteller extends werknemer{

	public Besteller(String naam, Afdeling afdeling) {
		super(naam, afdeling);
	}

	@Override
	public void calorieenVerbanden() {
		aantalCalorieen = aantalCalorieen+20;
		
	}

}
