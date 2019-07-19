package oefening1;

public class Gemeente {
	private int postcode;
	private String gemNaam = "";
public Gemeente(int postcode,String gemNaam){
	this.postcode = postcode;
	this.gemNaam = gemNaam;
	controleGem();
	controle();
	
}
public int getPostcode() {
	return postcode;
}
public void setPostcode(int postcode) {
	
	this.postcode = postcode;
	controle();
}
public String getGemNaam() {
	return gemNaam;
}
public void setGemNaam(String gemNaam) {
	this.gemNaam = gemNaam;
	controleGem();
}
public void controle(){
	String controle;
	controle = ""+postcode;
	if (controle.length() > 4){
		controle = controle.substring(0, 4);
	}else {
		for(int i = controle.length();i <4;i++){
			controle += "0";
		}
	}
	postcode = Integer.parseInt(controle);
}
public void controleGem(){
	String s = this.gemNaam;
	String resultaat="";
	//vraagje pakt de gemeente niet
	//System.out.println(s);
	for(int i =0;i < s.length();i++){
		if(!Character.isDigit(s.charAt(i))){
			resultaat+=s.charAt(i);
		}
	}
		gemNaam = resultaat;
//	for(int i=0;i < resultaat.length();i++){
//		if(resultaat.charAt(i) == ' ' || resultaat.charAt(i) == '-'){
//			resultaat = resultaat.substring(0,1).toUpperCase() + resultaat.substring(1,resultaat.length());
//		}
//	}

}
public String toString(){
	return this.postcode + " " +this.gemNaam;
}
}
