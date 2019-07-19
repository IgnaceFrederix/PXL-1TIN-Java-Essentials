package be.pxl.H13.extraOef1;

public class Huis extends Structuur{
private String eigenaar;
	public Huis(Huisnummer h) {
		super(h);
		// TODO Auto-generated constructor stub
	}
	public Huis(String naam,Huisnummer h){
		super(h);
		eigenaar = naam;
	}
	@Override
	public void beschrijf() {
		// TODO Auto-generated method stub
		System.out.println(eigenaar+" woont op nummer "+getNummer().getHuisnummer());
	}

}
