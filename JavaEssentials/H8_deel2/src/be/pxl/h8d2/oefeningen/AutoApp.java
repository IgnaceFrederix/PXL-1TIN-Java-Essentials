package be.pxl.h8d2.oefeningen;

public class AutoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto ford = new Auto("Ford","Focus",2006,"Zwart",185);
		Auto bmw = new Auto(ford);
		Auto standard = new Auto();
		Auto[] autos = new Auto[3];
		autos[0] = ford;
		autos[1] = bmw;
		autos[2] = standard;
		int teller = 0;
		for(int i = 0; i < autos.length;i++){
//			System.out.println(autos[i].getMerk() + " - " +autos[i].getModel() + " - " + autos[i].getBouwjaar() + " - " +
//					autos[i].getKleur() + " - " + autos[i].getMaxSnelheid());
			autos[i].print();
			if (autos[i].getMaxSnelheid() < 180){
				teller++;
			}
		}
	
		System.out.println(Auto.gettotaalautos());
		double gem;
		gem = (((double)teller /(double)(Auto.gettotaalautos()))) *100;
		System.out.printf("%.1f %s",gem,"%");
		
	}

}
