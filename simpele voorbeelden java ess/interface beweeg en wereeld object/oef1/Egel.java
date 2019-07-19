package H13.bin.be.pxl.H13.oef1;

public class Egel extends Acteur{
public Egel(int x,int y){
	super(x,y);
}

@Override
public void interageer(WereldObject o) {
	
	if(o instanceof Konijn && super.berekenAfstand(o)<10){
		System.out.println("Dag konijn");
	}else if (o instanceof Egel&& super.berekenAfstand(o)<20){
		System.out.println("Dag egel");
	}
}

@Override
public void beschrijf() {
	// TODO Auto-generated method stub
	System.out.println("Ik ben een egel op positie x = "+getX()+" , y = "+getY());
}

}
