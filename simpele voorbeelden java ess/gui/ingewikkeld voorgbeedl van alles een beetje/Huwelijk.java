package H17.src.be.pxl.h17.oef5.copy;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class Huwelijk {
	private Persoon partner1;
	private Persoon partner2;
	LocalDate datum;
	String eindtekst = "";
public String getEindtekst() {
		return eindtekst;
	}
public Huwelijk(Persoon p1,Persoon p2,int d,int m,int j){
	datum = LocalDate.of(j, m, d);
	partner1 = p1;
	partner2 = p2;
	
	//lelijke code hier
	System.out.print(p1.getVoornaam() + " " + p1.getNaam()
	+ " en " + p2.getVoornaam()+ " " + p2.getNaam() + " zijn gehuwd op ") ;
	System.out.print(huwelijksDatum());
	System.out.print(". Proficiat!");
	}
public String huwelijksDatum(){
	return datum.getDayOfMonth()+"/"+datum.getMonthValue()+"/"+datum.getYear();
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
		System.out.print(partner1.getNaam()+" "+partner1.getVoornaam()+" \n"
		+"\ngeboren op ");
		//partner1.getGeboortedatum().print();;
		System.out.println();
		System.out.print("\n" +partner2.getNaam()+" "+partner2.getVoornaam()+" \n"
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
		//LocalDate d1 = LocalDate.of(1987, 6, 1);
		d5=datum.getDayOfWeek();
		datum.plusDays(6-(d5.getValue()));
		LocalDate now = LocalDate.now();
		Period period = Period.between(datum, now);
		String tekst = "";
		int jaren = period.getYears();
		
		int j = 0;
		for(int i =0;i<speciaal.length;i++){
			tekst = "";
		if(jaren<((i+1)*10)){
		
			tekst=speciaal[i];
			j = i+1;
			break;
		}
		}
		
		LocalDate toekomst = datum.plusYears(j*10);
		Period per = Period.between(now, toekomst);
		Long dagen = ChronoUnit.DAYS.between(now, toekomst);
		eindtekst="Op "+toekomst.getDayOfMonth()+" "+toekomst.getMonth()+" "+toekomst.getYear()+" vieren ze hun "+tekst+" bruiloft\nDit zijn nog "+dagen+" dagen te gaan. Of nog "+per.getYears()+" jaar en "+per.getMonths()+" maanden "+(per.getDays()+"dagen");
	}
	public LocalDate getDatum() {
		return datum;
	}
}

