package exoef1;

import java.util.Scanner;

public class TShirtApp {

	public static void main(String[] args) {
		TShirt[] shirten = new TShirt[Kleur.values().length * TShirtSize.values().length];
		int teller = 0;

		for (Kleur kleur : Kleur.values()) {
			for (TShirtSize maat : TShirtSize.values()) {
				shirten[teller] = new TShirt(maat, kleur, 0);
				teller++;
			}
		}

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef de naam van de persoon in: ");
		String naam = keyboard.nextLine();

		while (!naam.equalsIgnoreCase("stop")) {
			
			// geen inputcontrole, verondersteld dat de gebruiker een juiste
			// input geeft
			System.out.println("Geef de borstomtrek van de persoon in");
			int borstomtrekKlant = keyboard.nextInt();
			TShirtSize klantMaat = null;
			keyboard.nextLine();
			
			for (TShirtSize maat : TShirtSize.values()) {
				if (maat.getBorstomtrek() >= borstomtrekKlant) {
					System.out.println("Je juiste maat van tshirt is " + maat.toString());
					klantMaat = maat;
					break;
				}
			}

			// Geen inputcontrole, verondersteld dat de gebruiker de juiste
			// input geeft.
			System.out.println("Geef de kleur in van de tshirt die je wilt bestellen: ");
			String gevraagdeKleur = keyboard.nextLine();
			Kleur klantKleur = null;

			for (Kleur kleur : Kleur.values()) {
				if (kleur.toString().equalsIgnoreCase(gevraagdeKleur)) {
					klantKleur = kleur;
					break;
				}
			}
			TShirt gevraagdeTShirt = new TShirt(klantMaat, klantKleur);
			
			teller = 0;
			for (TShirt tShirt : shirten) {
				if (tShirt.equals(gevraagdeTShirt)) {
					break;
				} else {
					teller++;
				}
			}
			
			// Geen inputcontrole, verondersteld dat de gebruiker de juiste
			// input geeft.
			System.out.println("Hoeveel shirts wilt u bestellen: ");
			int gevraagdAantal = keyboard.nextInt();
			keyboard.nextLine();

			shirten[teller].setAantalBesteld(gevraagdAantal);
			
			System.out.println("Geef de naam van de persoon in: ");
			naam = keyboard.nextLine();
		}
		
		
		keyboard.close();

		teller = 0;
		for (int i = 0; i < Kleur.values().length; i++) {
			for (int j = 0; j < TShirtSize.values().length; j++) {
				if (j == 0 && i == 0) { //formatering headers
					System.out.print("\t"); //formatering headers
					for (TShirtSize maat : TShirtSize.values()) { //formatering headers
						System.out.printf(" %3s", maat.getMaatNotatie()); //formatering headers
					} // formatering headers
					System.out.println(); //formatering headers
					System.out.printf("%s\t", Kleur.values()[i].name()); //formatering rowheaders
				} //formatering headers
				System.out.printf(" %3d", shirten[teller].getAantalBesteld());
				teller++;
			}
			System.out.println();
			
			if (i < Kleur.values().length - 1) {
				System.out.printf("%s\t", Kleur.values()[i+1].name());
			}
		}
	}

}
