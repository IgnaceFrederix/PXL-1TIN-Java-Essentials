package be.pxl.h17.oef4;

public class Leraar {
	private String naam;
	private String voornaam;
	private int aanstellingsPerc;
	private int aantVakken = 0;
	private static final int MAXAANTALVAKKEN = 5;
	private Vak[] vakken = new Vak[5];
	public Leraar(String naam,String voornaam,int aanstellingsPerc){
		this.naam = naam;
		this.voornaam = voornaam;
		this.aanstellingsPerc = aanstellingsPerc;
		controleaangesteld();
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public int getAanstellingsPerc() {
		controleaangesteld();
		return aanstellingsPerc;
	}
	public void setAanstellingsPerc(int aanstellingsPerc) {
		this.aanstellingsPerc = aanstellingsPerc;
		controleaangesteld();
	}
	public int getAantVakken() {
		return aantVakken;
	}
	public static int getMaxaantalvakken() {
		return MAXAANTALVAKKEN;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	private void controleaangesteld(){
		if(aanstellingsPerc > 100){
		System.out.println("Aanstellingspercentage ligt boven de 100, kan niet!!");
		aanstellingsPerc = 100;
		}
		if(aanstellingsPerc % 10 !=0){
			double number = (aanstellingsPerc + 5) / 10;
			int number2 = (int) number * 10; 
			aanstellingsPerc = number2;
		}
	}
	public void voegVakToe(Vak v){
		if(aantVakken != MAXAANTALVAKKEN){
		vakken[aantVakken] = v;
		aantVakken++;
		}else{
			System.out.println("U heeft het limiet bereikt voor het toevoegen van vakken");
		}
		
	}
	public Vak getVak(int i){
		return vakken[i];
	}
	public void print(){
		String s = "Leraar "+naam+" "+voornaam+" is aangestemd voor "+aanstellingsPerc+"%\n"+"Volgende vakken behoren tot het takenpakket:";

		StringBuilder jaar1 = new StringBuilder();
		StringBuilder jaar2 = new StringBuilder();
		StringBuilder jaar3 = new StringBuilder();
		if(aantVakken!=0){
			for(int i = 0;i<aantVakken;i++){
				if( vakken[i].getJaar().contentEquals("1")){
				jaar1.append("\n"+vakken[i].getCode()+"\t"+vakken[i].getNaam()+"\t\t"+vakken[i].getAantalSTP());
				}else if(vakken[i].getJaar().contentEquals("2")){
				jaar2.append("\n"+vakken[i].getCode()+"\t"+vakken[i].getNaam()+"\t\t"+vakken[i].getAantalSTP());	
				}else if(vakken[i].getJaar().contentEquals("3")){
				jaar3.append("\n"+vakken[i].getCode()+"\t"+vakken[i].getNaam()+"\t"+vakken[i].getAantalSTP());
				}
			}
		System.out.print(s+"\nVakken van jaar 1:"+jaar1+"\nVakken van jaar 2:" +jaar2+"\nVakken van jaar 3"+jaar3);
		
		}
	}
}
