package h11.pxl.be.oefening1;

public enum Munt {
	tweeEuro(2.0),eenEuro(1.0),vijftigCent(0.50),twintigCent(0.20),tienCent(0.10),vijfCent(0.05),tweeCent(0.02),eenCent(0.01);
private double waarde;
private Munt(double waarde){
	this.waarde = waarde;
}
public double getWaarde(){
	return waarde;
}
public void setWaarde(double waarde) {
	this.waarde = waarde;
}
}
