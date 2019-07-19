package be.pxl.h9.opdracht1_aggregatie;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Owner o = new Owner("Guido");
		Pet p =new Pet("Blacky");
		o.setPet(p);
		System.out.println(o.getName()+" heeft een dier met naam "+o.getPet().getName());
	}

}
