package h11.px.be.opdracht;

public class DagApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		for(Dag d:Dag.values()){
			//System.out.print(d);
			System.out.print(d.name());
			if(d.getWeekend()){
				System.out.println(" Weekend");
			}else{
				System.out.println(" Weekdag");
			}
		}
	}

}
