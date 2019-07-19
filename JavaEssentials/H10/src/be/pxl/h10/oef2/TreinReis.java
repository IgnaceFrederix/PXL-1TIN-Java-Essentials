package be.pxl.h10.oef2;

//import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class TreinReis extends Reis{
private boolean nationaal = true;
private String specificatie = "IC";
private String[] vasteWaarde = {"IC","IR","P"};
public TreinReis(String bestemming){
	super(bestemming);
	nationaal = true;
	specificatie = vasteWaarde[0];
	controle();
}
public TreinReis(String bestemming,double prijs,boolean nationaal,String specificatie){
	super(bestemming,prijs);
	this.nationaal = nationaal;
	this.specificatie = specificatie;
	controle();
}
public void controle(){
	int gevonden = 0;
	if(nationaal == true){
		for(String c:vasteWaarde){
		if(specificatie == c){
			gevonden +=1;
		}
	}
	if(gevonden <1){
		specificatie = "IC";
	}
	}
	
}
public void print(){
	super.print();
	if(nationaal = true){
		System.out.println("Nationale treinreis " + specificatie);
	}else{
		System.out.println("Internationale treinreis" + specificatie);
	}
}

}
