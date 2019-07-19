package h11.pxl.be.ExtraOefening1;

public enum TShirtSize {
	extra_smal(86,"XS"),smal(94,"S"),medium(102,"M"),large(110,"L"),x_large(118,"XL"),xx_large(128,"XXL"),xxx_large(140,"XXL");

private String maat;
private int borstomtrek;
private TShirtSize(int borstomstrek,String maat){
	this.maat = maat;
	this.borstomtrek = borstomstrek;
}
public String getMaat() {
	return maat;
}
public void setMaat(String maat) {
	this.maat = maat;
}
public int getBorstomtrek() {
	return borstomtrek;
}
public void setBorstomtrek(int borstomtrek) {
	this.borstomtrek = borstomtrek;
}

}