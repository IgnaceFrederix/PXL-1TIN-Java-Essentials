package H13.bin.be.pxl.H13.oef1;

public class Konijn extends Acteur{

	public Konijn(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interageer(WereldObject o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beschrijf() {
		System.out.println("Ik ben een konijn op positie x = "+getX()+" , y = "+getY());
		
	}

}
