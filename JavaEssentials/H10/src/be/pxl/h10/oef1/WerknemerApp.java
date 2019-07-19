package be.pxl.h10.oef1;

public class WerknemerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Werknemer w = new Werknemer("Berkan","Aktag","YOYO",500);
		System.out.println(w.getSalaris());
		Werknemer w1 = new Werknemer("Ekrem","Toprak","King",1200);
		Manager m1 = new Manager("joske","joske",1500,"king");
		System.out.println(m1.getProcAandeelManagers());
	}

}
