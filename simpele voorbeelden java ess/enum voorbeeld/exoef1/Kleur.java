package exoef1;

public enum Kleur {
	ROOD,
	GROEN,
	BLAUW,
	WIT;
	
	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
