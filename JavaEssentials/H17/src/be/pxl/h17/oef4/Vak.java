package be.pxl.h17.oef4;

public class Vak {
	private String code;
	private String naam;
	private int aantalSTP;
	private String jaar;

	public Vak(String code,String naam,int aantalSTP){
		this.code = code;
		this.naam = naam;
		this.aantalSTP = aantalSTP;
		controle();
		controleSP();
	}
	public String getJaar() {
		if(code != null && !code.isEmpty()){
			jaar = code.substring(1,2);
		}else{
			jaar = "0";
		}
		return jaar;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
		controle();
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public int getAantalSTP() {
		controleSP();
		return aantalSTP;
	}
	public void setAantalSTP(int aantalSTP) {
		this.aantalSTP = aantalSTP;
		controleSP();
	}
	private void controle(){
		int getal = Character.getNumericValue(code.charAt(1));
		//System.out.println(getal);
		if(getal < 1 || getal > 3){
			String s2 = code.substring(0,1) + "1" + code.substring(2, code.length());
			this.code = s2;
		}
	}
	private void controleSP(){
		if(aantalSTP > 18){
			aantalSTP = 18;
		}
		int getal = aantalSTP % 3;
		if( getal !=0){
			switch(getal){
			case 1:getal=aantalSTP-1;
			break;
			case 2:getal=aantalSTP+1;
			break;
			}
			aantalSTP = getal;
		}
		
	}
}
