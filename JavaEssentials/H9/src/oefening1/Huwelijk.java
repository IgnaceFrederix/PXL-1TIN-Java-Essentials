package oefening1;

public class Huwelijk {
	private Persoon partner1;
	private Persoon partner2;
	private Datum huwelijksDatum;
public Huwelijk(Persoon p1,Persoon p2,int d,int m,int j){
	huwelijksDatum = new Datum(d,m,j);
	partner1 = p1;
	partner2 = p2;
	p2.setAdrespersoon(p1.getAdrespersoon());
	//lelijke code hier
	System.out.println(p1.getVoornaam() + " " + p1.getNaam()
	+ " en " + p2.getVoornaam()+ " " + p2.getNaam() + " zijn gehuwd op ") ;
	huwelijksDatum.print();
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
		partner1.getGeboortedatum().print();;
		System.out.println();
		System.out.print("\n" +partner2.getNaam()+" "+partner2.getVoornaam()+" \n"+partner2.getAdrespersoon()
		+"\ngeboren op ");
		partner2.getGeboortedatum().print();
		System.out.println();
		System.out.print("\nHet huwelijk vond plaats op ");
		huwelijksDatum.print();
	}
}

