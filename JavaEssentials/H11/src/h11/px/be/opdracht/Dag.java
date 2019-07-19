package h11.px.be.opdracht;

public enum Dag {
MAANDAG(false),DINSDAG(false),WOENSDAG(false),DONDERDAG(false),VRIJDAG(false),ZATERDAG(true),ZONDAG(true);
	
private boolean weekend;

private Dag(boolean dag){
	this.weekend = dag;
}
public boolean getWeekend(){
	return weekend;
}
public void print(){
	if(weekend){
		System.out.println("Vandaag is het " + this.name() + " weekend");
	}else{
		System.out.println("Vandaag is het " + this.name() + " weekdag");
	}

}


}
