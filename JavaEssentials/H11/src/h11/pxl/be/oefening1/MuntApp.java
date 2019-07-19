package h11.pxl.be.oefening1;

public class MuntApp {
private static int[] aantalMunten;
private static double bedrag = (9.87*1000);
private static double resterendebedrag=0;
	public static void main(String[] args) {
	
		Munt[] munten = Munt.values();
		Munt munt;
		aantalMunten = new int[munten.length];
		resterendebedrag = bedrag;
		for(Munt n:Munt.values()){
			munt = munten[n.ordinal()];
				int aantal = 0;
				aantal = (int) (resterendebedrag / (munt.getWaarde()*1000));
				
				System.out.println(aantal);
				resterendebedrag = resterendebedrag % (munt.getWaarde()*1000);
				aantalMunten[munt.ordinal()] = aantal;
				
			if(resterendebedrag <=0){
				break;
			}
		}
		System.out.println("€ " + (bedrag/1000) + " verdeeld over de volgende munten: ");
		for(Munt m:Munt.values()){
			System.out.println(m.name() + " - " + aantalMunten[m.ordinal()]);
		}
		
	}

}
