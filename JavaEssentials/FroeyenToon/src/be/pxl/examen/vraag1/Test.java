package be.pxl.examen.vraag1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		int random;
		int totaalAantalCalorieen = 0;
		int i = 0;
	
	Bedrijf mijnAutos = new Bedrijf("De Auto Dealer!");
	Afdeling garage = new Garage("Chef Willem");
	Afdeling verkoopZaal = new VerkoopZaal("Chef Annie");
	mijnAutos.setGarage(garage);
	mijnAutos.setVerkoopZaal(verkoopZaal);
	
	werknemer a = new Besteller("John", garage);
	werknemer b = new Besteller("Daisy", garage);
	werknemer c = new verkoper("Jan", verkoopZaal);
	werknemer d = new verkoper("Jef", verkoopZaal);
	werknemer e = new verkoper("Miek", verkoopZaal);
	
	ArrayList<werknemer> lijst = new ArrayList<werknemer>();

	lijst.add(a);
	lijst.add(b);
	lijst.add(c);
	lijst.add(d);
	lijst.add(e);

	
	random = (int) (Math.random() * (lijst.size() - 0)) + 0;
	while(lijst.get(random).getAantalCalorieen() < 2000){
		random = (int) (Math.random() * (lijst.size() - 0)) + 0;
		lijst.get(random).calorieenVerbanden();
		i = random;
	}
	Iterator<werknemer> it = lijst.iterator();
	while(it.hasNext()){
		werknemer k = it.next();
		totaalAantalCalorieen += k.getAantalCalorieen();
	}
	System.out.println("Gegevens Van de activiteiten: ");
	System.out.println("Bedrijf: "+mijnAutos.getNaam());
	System.out.println("Besteller");
	for(werknemer a1: lijst){
		if(a1 instanceof Besteller){
			System.out.println("Naam = "+a1.getNaam()+" en AfdelingsChef = "+garage.getChef());
		}
	}
		System.out.println("Verkoper");
		for(werknemer a2: lijst){
		if(a2 instanceof verkoper){
			System.out.println("Naam = "+a2.getNaam()+" en AfdelingsChef = "+verkoopZaal.getChef());
		}
		
		
	}
	System.out.println("Resultaat van de Activiteiten");
	
	System.out.println(lijst.get(i).getNaam()+ " mag even rusten!");
	System.out.println("In deze activiteit verbrandden alle werknemers samen "+totaalAantalCalorieen+" Calorieën.");
	}
}
