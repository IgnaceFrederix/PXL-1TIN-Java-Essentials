package oefs;

public enum Dag {
	MAANDAG(0),DINSDAG(0),WOENSDAG(0),DONDERDAG(0),VRIJDAG(0),ZATERDAG(1),ZONDAG(1);
private int dag;
private Dag(int dag){
	this.dag = dag;
}
public void weekend(){
	if(dag!=0){
		System.out.println("het is weekend");
	}else{
		System.out.println("het is geen weekend");
	}
}
}
