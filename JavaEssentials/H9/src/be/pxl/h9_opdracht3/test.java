package be.pxl.h9_opdracht3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boek b = new Boek();
		b.toongegevens();
		b.setBladzijden(55);
		b.setIsbn("jajajaj");
		b.setTitel("ok");
		Auteur a = b.getAuteur();
		a.setNaam("a");
		a.setVoornaam("b");
		b.toongegevens();
		System.out.println(b.getAuteur().getNaam());
	}

}
