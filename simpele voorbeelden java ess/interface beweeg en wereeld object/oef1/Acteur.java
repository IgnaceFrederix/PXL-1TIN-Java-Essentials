package H13.bin.be.pxl.H13.oef1;

public abstract class Acteur extends WereldObject implements Beweegbaar{

	public Acteur(int x, int y) {
		super(x, y);
		
	}
	public abstract void interageer(WereldObject o);
		
	
public void stapBoven(){
	setY(getY()+1);
}
public void stapLinks(){
	setX(getX()-1);
}
public void stapOnder(){
	setY(getY()-1);
}
public void stapRechts(){
	setX(getX()+1);
}
}


