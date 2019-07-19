package be.pxl.H13.extraOef1;

public class Park extends Structuur{

	public Park(Huisnummer h) {
		super(h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void beschrijf() {
		// TODO Auto-generated method stub
		System.out.println("Park gelegen op nummer "+getNummer().getHuisnummer());
	}

}
