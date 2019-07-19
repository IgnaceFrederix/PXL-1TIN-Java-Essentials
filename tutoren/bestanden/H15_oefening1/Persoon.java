package oefening1;

public class Persoon {
	private String naam;
	private int leeftijd;
	
	public Persoon (String naam, int lft) {
		this.naam = naam;
		setLeeftijd(lft);
	}
	
	public void setLeeftijd(int lft) {
		leeftijd = lft;
	
	}

}
