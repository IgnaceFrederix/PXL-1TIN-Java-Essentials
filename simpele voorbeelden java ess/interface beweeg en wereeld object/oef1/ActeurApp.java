package H13.bin.be.pxl.H13.oef1;

import java.util.Random;

public class ActeurApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Punt[] puntenTab = new Punt[100];
		for(int i = 0;i<100;i++){
			puntenTab[i] = new Punt(rand.nextInt(100),rand.nextInt(100));
			System.out.println("X-waarde = "+puntenTab[i].getX() + " Y-waarde = "+puntenTab[i].getY());
		
		}
		System.out.println(puntenTab[0].berkenAfstand(puntenTab[99]));
		Egel e = new Egel(50,50);
		Konijn k = new Konijn(45,45);
		e.interageer(e);
		
	
		
		Acteur[] act = new Acteur[2];
		Acteur[] act2 = {e,k}; 
		act[0] = e;
		act[1] = k;
		for(Acteur a:act){
			a.beschrijf();
		}
//		k.stapLinks();
//		e.stapRechts();
//		k.beschrijf();
//		e.beschrijf();
		
	}

}
