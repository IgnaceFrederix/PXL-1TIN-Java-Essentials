package h11.pxl.be.oefening2;

public class Kaart {
	private Soort soort;
	private Ranking ranking;
	public Soort getSoort() {
		return soort;
	}
	public void setSoort(Soort soort) {
		this.soort = soort;
	}
	public Ranking getRanking() {
		return ranking;
	}
	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}
	public Kaart(Soort soort, Ranking ranking) {
		super();
		this.soort = soort;
		this.ranking = ranking;
	}

}
