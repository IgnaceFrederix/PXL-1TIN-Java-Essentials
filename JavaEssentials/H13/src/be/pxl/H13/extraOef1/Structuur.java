package be.pxl.H13.extraOef1;

public abstract class Structuur {
	private Huisnummer nummer;

	public abstract void beschrijf();

	public Structuur(Huisnummer h) {

		nummer = h;
	}

	public Huisnummer getNummer() {
		return nummer;
	}
	public boolean equals(Huisnummer h){
		if(nummer.getHuisnummer().equals(h)){
			return true;
		}else{
			return false;
		}
	}
}
