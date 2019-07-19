package be.pxl.h12.oef3;
import java.time.*;
public class Huwelijk {
	private Persoon partner1;
	private Persoon partner2;
	LocalDate datum;
public Huwelijk(Persoon p1,Persoon p2,int d,int m,int j){
	
	partner1 = p1;
	partner2 = p2;
	p2.setAdrespersoon(p1.getAdrespersoon());
	//lelijke code hier
	System.out.println(p1.getVoornaam() + " " + p1.getNaam()
	+ " en " + p2.getVoornaam()+ " " + p2.getNaam() + " zijn gehuwd op ") ;
	//huwelijksDatum.print();
	System.out.println(". proficiat!");
	}
	public Persoon getPartner1(){
		return partner1;
	}
	public void setPartner1(Persoon partner1){
		this.partner1 = partner1;
	}
	public Persoon getPartner2(){
		return partner2;
	}
	public void setPartner2(Persoon partner2){
		this.partner2 = partner2;
	}
	public void print(){
		System.out.println();
		System.out.print(partner1.getNaam()+" "+partner1.getVoornaam()+" \n"+partner1.getAdrespersoon()
		+"\ngeboren op ");
		//partner1.getGeboortedatum().print();;
		System.out.println();
		System.out.print("\n" +partner2.getNaam()+" "+partner2.getVoornaam()+" \n"+partner2.getAdrespersoon()
		+"\ngeboren op ");
		//partner2.getGeboortedatum().print();
		System.out.println();
		System.out.print("\nHet huwelijk vond plaats op ");
		//huwelijksDatum.print();
	}
	public void printDatum(LocalDate datum){
		this.datum = datum;
		System.out.println(this.datum.getDayOfMonth()+" "+this.datum.getMonth()+" "+this.datum.getYear());
	}
	public void printFeest(){
		String[] speciaal = {"tin","porselein","parel","smaragd","goud","diamant","platina","eik","graniet"};
		DayOfWeek d5;
		LocalDate d1 = LocalDate.of(1987, 6, 1);
		d5=d1.getDayOfWeek();
		d1.plusDays(6-(d5.getValue()));
		LocalDate now = LocalDate.now();
		Period period = Period.between(d1, now);
		int jaren = period.getYears();
		for(int i =0;i<speciaal.length;i++){
			String tekst = "";
		if(jaren>(i+1*10)){
			tekst=speciaal[i];
			break;
		}
		}
		LocalDate toekomst = d1.plusYears(jaren+1);
		System.out.println("Op "+toekomst.getDayOfMonth()+" "+toekomst.getMonth()+" "+toekomst.getYear());
	}
}

