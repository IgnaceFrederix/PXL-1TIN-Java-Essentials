package h11.pxl.be.oefening2;

public enum Ranking {
	twee(2), drie(3), vier(4), vijf(5), zes(6), zeven(7), acht(8), negen(9), tien(10), boer(11), dame(12), heer(13), aas(14);
private int waarde;
	Ranking (int i){
	waarde =i;
}
	public int getWaarde() {
		return waarde;
	}
	public void setWaarde(int waarde) {
		this.waarde = waarde;
	}
}
