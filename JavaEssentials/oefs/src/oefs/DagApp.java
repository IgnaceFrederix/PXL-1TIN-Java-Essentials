package oefs;

public class DagApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dag d = Dag.DINSDAG;
		Dag d2 = Dag.ZATERDAG;
		//d.weekend();
		//d2.weekend();
		for(Dag d3:Dag.values()){
			System.out.println(d3.name()+"  -  "+d3.ordinal());
			
			d3.weekend();
		}
	}

}
