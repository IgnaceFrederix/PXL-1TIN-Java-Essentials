package h8oefeningen;

public class KlasApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Klas k = new Klas();
		Klas klasBerkan = new Klas("Berkan",20);
		Klas joske = new Klas("Joske", 9);
		Klas[] klassen = new Klas[3];
	
		joske.setAantalstud(joske.getAantalstud() + 1);
		klassen[0] = k;
		klassen[1] = klasBerkan;
		klassen[2] = joske;
		
		if (Klas.getaantalklassen() != 0){
			double gem = (double) Klas.getstudenten() / Klas.getaantalklassen();
			System.out.printf("%.1f",gem);
			System.out.println();
		}
		for(int i = 0;i < klassen.length;i++){
			System.out.println(klassen[i].getNaamklas() + "\t" + klassen[i].getAantalstud());
		}
		System.out.println(Klas.getaantalklassen());
		System.out.println(Klas.getstudenten());
		
	}
	

}
