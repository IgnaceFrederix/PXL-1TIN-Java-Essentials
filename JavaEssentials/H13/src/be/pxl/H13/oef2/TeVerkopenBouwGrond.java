package be.pxl.H13.oef2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;




public class TeVerkopenBouwGrond extends Bouwgrond{
private String notaris;
private LocalDate datumTeKoop;
private LocalDate datumHoogsteBod;
private double hoogsteBod = 0;
private int gedaan = 0;

	public TeVerkopenBouwGrond(float perceelGrootte, String perceelNr,String bouwVoorschrift) {
		super(perceelGrootte, perceelNr);
		setBouwVoorschrift(bouwVoorschrift);
	}
	@Override
	public void wijsEenNotaris(String s, LocalDate l) {
		if(gedaan == 0){
			notaris = s;
			datumTeKoop = l;
			gedaan++;
		}else{
			System.out.println("notaris al toegewezen");
		}
		
	}

	@Override
	public void doeEenBod(double d, LocalDate m) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yy");
		//DateTimeFormatter format2 =DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		double minbod = getPerceelGrootte()*(minPrijsM2*100);
		if(notaris != null && minbod<d &&(m.isAfter(datumTeKoop.plusDays(10)))){
			if(hoogsteBod < d && hoogsteBod !=0){
				
				System.out.println("Perceelnr: "+getPerceelNr()+"\nPerceelgrootte: "+getPerceelGrootte());
				System.out.println("Bouwvoorschrift: "+getBouwVoorschrift()+"\nTe koop gesteld op "+datumTeKoop.getDayOfMonth()+" "+datumTeKoop.getMonth()+" "+datumTeKoop.getYear());
				System.out.println("Vorige hoogste bod "+hoogsteBod+" "+" geregistreerd op "+format.format(datumHoogsteBod));
				hoogsteBod = d;
				datumHoogsteBod = m;
				System.out.println("Nieuw hoogste bod "+hoogsteBod+" geregistreerd op "+format.format(datumHoogsteBod));
			}else if(hoogsteBod ==0 && hoogsteBod <d){
			hoogsteBod = d;
			datumHoogsteBod = m;
			//LocalDate dt1 = LocalDate.parse(m.toString(), format2);
			System.out.println("Perceelnr: "+getPerceelNr()+"\nPerceelgrootte: "+getPerceelGrootte());
			
			System.out.println("Bouwvoorschrift: "+getBouwVoorschrift()+"\nTe koop gesteld op "+datumTeKoop.getDayOfMonth()+" "+datumTeKoop.getMonth()+" "+datumTeKoop.getYear());
			System.out.println("Nieuw hoogste bod "+hoogsteBod+" geregistreerd op "+format.format(datumHoogsteBod));
		}else {
			System.out.println("Je kan geen bod plaatsen (10 dagen wachttijd)");
		}
		}
		System.out.println();
	}

}
