package be.pxl.h10.voorbeeld;

public class Student extends Persoon {
	private int leerkrediet;
	private String studentnr ,opleiding;
	private static int aantal;
	{aantal++;}
		
	public static int getAantal(){
		return aantal;
	}
	public Student(String naam,String Voornaam){
		this(naam,Voornaam,"15999999","XXX");
	}
	public Student(){
		this("onbekend","onbekend","15999999","XXX");
		
	}
	public Student(Student s){
		this(s.getNaam(),s.getVoornaam(),s.studentnr,s.opleiding);
		setLeerkrediet(s.leerkrediet);
	}
	public int getLeerkrediet() {
		return leerkrediet;
	}
	public Student(String naam,String voornaam,String studentnr,String opleiding){
		super(naam,voornaam);
		this.studentnr = studentnr;
		this.opleiding = opleiding;
		this.leerkrediet = 140;
	}
	
	public void setLeerkrediet(int leerkrediet) {
		this.leerkrediet += leerkrediet;
		if(this.leerkrediet < 0){
			this.leerkrediet = 0;
		}
		if(this.leerkrediet > 140){
			this.leerkrediet =140;
		}
	}
	public String getStudentnr() {
		return studentnr;
	}
	public void setStudentnr(String studentnr) {
		this.studentnr = studentnr;
	}
	public String getOpleiding() {
		return opleiding;
	}
	public void setOpleiding(String opleiding) {
		this.opleiding = opleiding;
	}
	//@override
	public String print(){

		return super.print()+"\nstudentennr: " + studentnr+"\nopleiding: " + opleiding+"\nleerkrediet "+leerkrediet;
	}
	
}
