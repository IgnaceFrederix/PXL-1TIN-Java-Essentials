package be.pxl.h10.voorbeeld;

public class SchoolApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoon p1 = new Persoon();
		System.out.println(p1.getNaam());
		
		
		Student s1 = new Student();
		s1.setNaam("Tam Pic");
		s1.setVoornaam("Bilgin ");
		s1.setLeerkrediet(120);
		s1.setLeerkrediet(10);
		s1.setOpleiding("Informatica");
		s1.setStudentnr("11500399");
		//System.out.println(s1.getNaam()+"\n"+s1.getVoornaam());
		System.out.println(s1.getLeerkrediet());
		s1.print();
		
		Persoon pol = new Student();
		pol.setNaam("Jefke");
		pol.print();
		//System.out.println("naam " + pol.getNaam());
		Lector l = new Lector();
		l.setAanstellingsperc(50);
		l.setSalaris(2000);
		l.print();
		l.setAanstellingsperc(60);
		l.print();
		System.out.println(s1.getAantal());
	}

}
