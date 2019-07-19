package exoef1;

public class TShirt {
	private TShirtSize maat;
	private Kleur kleur;
	private int aantalBesteld;
	
	public TShirt(TShirtSize maat, Kleur kleur, int aantalBesteld) {
		setAantalBesteld(aantalBesteld);
		setKleur(kleur);
		setMaat(maat);
	}
	
	public TShirt(TShirtSize maat, Kleur kleur) {
		this(maat, kleur, 0);
	}

	public TShirtSize getMaat() {
		return maat;
	}

	public void setMaat(TShirtSize maat) {
		this.maat = maat;
	}

	public Kleur getKleur() {
		return kleur;
	}

	public void setKleur(Kleur kleur) {
		this.kleur = kleur;
	}

	public int getAantalBesteld() {
		return aantalBesteld;
	}

	public void setAantalBesteld(int aantalBesteld) {
		this.aantalBesteld += aantalBesteld;
	}
	
	public Boolean equals(TShirt shirt) {
		if(this.maat == shirt.getMaat() && this.kleur == shirt.getKleur()) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
