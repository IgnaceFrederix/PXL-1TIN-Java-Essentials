package be.pxl.h10.oef2;

public class ReisApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VliegtuigReis v = new VliegtuigReis("Dublin");
		v.setPrijs(22);
		v.setVluchtnummer("p526");
		TreinReis r = new TreinReis("Brussel",25,true,"IC");
		GeboekteReis g = new GeboekteReis("Berkan",5);
		g.voegReisToe(r);
		g.voegReisToe(v);
		g.print();
		Reis r1 = new VliegtuigReis("Antalya");
		r1.print();
		
	}

}
