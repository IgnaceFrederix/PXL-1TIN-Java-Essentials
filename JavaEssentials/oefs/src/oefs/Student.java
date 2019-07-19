package oefs;

public class Student extends Persoon{
public int leerkrediet;
public String studentnr,opleiding;
private static int aantal;
{aantal++;}
public static int getAantal(){
	return aantal;
}
public Student(){
	this("onbekend","onbekend");
	studentnr = "1599999";
	opleiding = "XXX";
	leerkrediet = 140;
}
public Student(String naam,String voornaam){
super(naam,voornaam);	
studentnr = "1599999";
opleiding = "XXX";
leerkrediet = 140;
}
public Student(Student s){
	this(s.getNaam(),s.getVoornaam(),s.getStudentnr(),s.getOpleiding());
	setLeerkrediet(s.leerkrediet);
}
public Student(String naam,String voornaam,String studentnr,String opleiding){
	this(naam,voornaam);
	this.studentnr=studentnr;
	this.opleiding = opleiding;
}
public int getLeerkrediet() {
	return leerkrediet;
}
public void setLeerkrediet(int leerkrediet) {
	this.leerkrediet = leerkrediet;
	if(this.leerkrediet > 140){
		this.leerkrediet = 140;
	}
if(this.leerkrediet < 0){
		this.leerkrediet=0;
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
public void print(){
	super.print();
	System.out.println("studentennr= "+studentnr+"\nleerkrediet "+leerkrediet);
}
}
