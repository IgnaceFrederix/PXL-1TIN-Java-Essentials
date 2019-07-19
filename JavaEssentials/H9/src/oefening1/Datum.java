package oefening1;

import java.util.Scanner;

public class Datum {
	private int dag;
	private int maand;
	private int jaar;
	private final static String[] maandNamen = { "januari", "februari", "maar", "april", "mei", "juni", "juli", "augustus", "september", "oktober", "november","december" };

	public Datum() {
		this(1, 1, 2016);
	}

	public Datum(int dag, int maand, int jaar) {
		this.dag = dag;
		setMaand(maand);
		this.jaar = jaar;
	}
// werkt niet
	public void setMaand(int maand) {
		while (maand < 1 || maand > 12) {
			System.out.println("verkeerd");
			Scanner sc = new Scanner(System.in);
			maand = sc.nextInt();
			sc.close();
		}
		this.maand = maand;
	}
	public void print(){
		System.out.print(dag +" "+ maandNamen[maand-1] + " " + jaar );
	}
}
