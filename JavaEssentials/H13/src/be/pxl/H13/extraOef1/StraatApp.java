package be.pxl.H13.extraOef1;

public class StraatApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Structuur[] s2 = new Structuur[10];
		Straat s = new Straat();
		Huisnummer h = new Huisnummer(12,'a');
		Huis huisnr = new Huis("Jan",h);
		s.VoegStructuurToe(huisnr);
		
		//Park toevoegen
		Huisnummer h2 = new Huisnummer(13,'b');
		Park park = new Park(h2);
		s.VoegStructuurToe(park);
		
		for(int i =0;i<s.geefAantal();i++){
			s.getStructuur(i).beschrijf();
		}
		
		
	}

}
