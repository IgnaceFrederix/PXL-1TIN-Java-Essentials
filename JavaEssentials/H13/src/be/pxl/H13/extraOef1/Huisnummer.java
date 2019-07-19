package be.pxl.H13.extraOef1;

public class Huisnummer {
private int getal;
private char symbool;
public Huisnummer(int getal,char symbool){
	if(getal >0&&getal<1000){
		this.getal = getal;
	}else{
		this.getal = -1;
		this.symbool = ' ';
	}
	
	if(Character.isLetter(symbool) || symbool == ' '){
		this.symbool = symbool;
	}else{
		this.getal = -1;
		this.symbool = ' ';
	}
	
}
public Huisnummer(Huisnummer h){
	this(h.getal,h.symbool);
}
public String getHuisnummer(){
	StringBuilder s = new StringBuilder("");
	s.append(getal);
	s.append(symbool);
	
	return (s.toString());
}
public boolean equals(Huisnummer h){
	if(getal == h.getal && symbool == h.symbool){
		return true;
	}else{
		return false;
	}
}
}
