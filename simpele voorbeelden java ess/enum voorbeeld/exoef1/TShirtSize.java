package exoef1;

public enum TShirtSize {
	EXTRA_SMAL(86, "XS"),
	SMAL(94,"S"),
	MEDIUM(102, "M"),
	LARGE(110, "L"),
	EXTRA_LARGE(118, "XL"),
	EXTRA_EXTRA_LARGE(128, "XXL"),
	EXTRA_EXTRA_EXTRA_LARGE(140, "3XL");
	
	private int borstomtrek;
	private String maatNotatie;
	
	private TShirtSize(int borstomtrek, String maatNotatie) {
		this.borstomtrek = borstomtrek;
		this.maatNotatie = maatNotatie;
	}

	public int getBorstomtrek() {
		return borstomtrek;
	}

	public String getMaatNotatie() {
		return maatNotatie;
	}
	
	@Override
	public String toString() {
		return this.getMaatNotatie();
	}
	
}
