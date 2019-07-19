package oefening4;

public class Vlucht {
private String regio,stad;
private int duurUur,duurMin;

public Vlucht(String regio,String stad,int uren,int mins){
	this.regio=regio;
	this.stad=stad;
	this.duurUur = uren;
	this.duurMin = mins;	
}
public String getRegio() {
	return regio;
}

public void setRegio(String regio) {
	this.regio = regio;
}

public String getStad() {
	return stad;
}

public void setStad(String stad) {
	this.stad = stad;
}

public int getDuurUur() {
	return duurUur;
}

public void setDuurUur(int duurUur) {
	this.duurUur = duurUur;
}

public int getDuurMin() {
	return duurMin;
}

public void setDuurMin(int duurMin) {
	this.duurMin = duurMin;
}
}
