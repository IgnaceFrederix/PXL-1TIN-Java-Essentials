package OO5_oef3;

public class TestHotel {

	
	public static void main(String[] args) {
// wat is de methode "main" ? 
// wat betekent static ? 
// wat betekent void ? 
// welk datatype is args ? 
// waarvoor staat String [] ?
// wanneer wordt er gewerkt met args ? 


		Gast gast1=new Gast();
// wat is gast1 ?
// wat gebeurt er bij new ? 
		
		Gast gast2=new Gast("Zoons Pieter","Nederland");
		Gast gast3=new Gast(3, "Peeters Wim","Duitsland");
// vergelijk de new van gast1,gast2,gast3 
		
		gast1.wijzigLand("België");
		gast1.wijzigNummer(1);
		gast1.wijzigNaam("Aerts Jef");
// wat gebeurt er bij de oproep van de methode wijzigNummer ? 
// welke relatie bestaat er tussen gast1 en de wijzig...functies ? 
		
		
		gast1.drukAf();
		gast2.drukAf();
		gast3.wijzigLand("Spanje");
		gast3.drukAf();
// wat gebeurt er bij de oproep van deze methode ?
// voor wie wordt deze methode opgeroepen ? 
		   
// doe de volgende uitbreidingen : 
//
//  1. Een gast-object kan ook aangemaakt worden met alleen een nummer
//	   De naam en land worden dan beide "onbekend".
//			     
		
//	2. Het nummer, de naam en het land kunnen als argumenten bij de main meegegeven worden.
//	   Declareer een object gast5 op deze manier.
//		

	}

}
