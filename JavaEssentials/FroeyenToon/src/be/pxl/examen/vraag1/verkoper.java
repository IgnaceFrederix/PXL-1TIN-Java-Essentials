package be.pxl.examen.vraag1;

public class verkoper extends werknemer {
	
	public verkoper(String naam, Afdeling afdeling){
		super(naam, afdeling);
	}
		
	@Override
	public void calorieenVerbanden() {
		aantalCalorieen = aantalCalorieen+15;
		
	}

}
