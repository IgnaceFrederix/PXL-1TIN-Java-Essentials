package be.pxl.h10.oef2;

public class GeboekteReis {
private String naam;
private Reis[] reizen;
public GeboekteReis(String naam,int aantalRizen){
	this.naam = naam;
	reizen = new Reis[aantalRizen];
}
public void voegReisToe(Reis r){
	if(Plaatszoeken(r) != -1){
		reizen[Plaatszoeken(r)] = r;
		
	}else{
		System.out.println("reis volgeboekt");
	}
}
public int Plaatszoeken(Reis r){
	for(int i = 0;i < reizen.length;i++){
		if(reizen[i] == null){
		return i;
		}
	}
	return -1;
}
public void print(){
	System.out.println("Reis van " + naam);
	int teller = 0;
	for(Reis r: reizen){
		if(r != null){
		teller++;
		System.out.print("==> reis "+teller+" ");
		r.print();
		
		}
	}
	System.out.println("Deze passagier moet " +(teller -1) + " keer overstappen");
}
}
