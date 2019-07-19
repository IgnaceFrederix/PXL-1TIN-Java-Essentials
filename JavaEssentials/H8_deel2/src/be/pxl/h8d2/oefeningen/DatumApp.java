package be.pxl.h8d2.oefeningen;
import java.util.*;
public class DatumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datum datum1 = new Datum();
		datum1.print();
		String[] activiteiten = new String[10];
		Datum [] data = new Datum[10];
		int dag,maand,jaar;
		int aantalOpgevuld = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("geef een maandnr in");
		maand = Integer.parseInt(sc.nextLine());
		System.out.println("geef een jaar in");
		jaar = Integer.parseInt(sc.nextLine());
		System.out.println("geef een dag in");
		dag = Integer.parseInt(sc.nextLine());
		while(dag !=0 && aantalOpgevuld <2 ){
			System.out.println("geef de activiteit");
			String activ = sc.nextLine();
			activiteiten[aantalOpgevuld] = activ;
			Datum d = new Datum(dag,maand,jaar);
			data[aantalOpgevuld] = d;
			aantalOpgevuld ++;
			if (aantalOpgevuld <2){
				System.out.println("geef een dag in");
			dag = Integer.parseInt(sc.nextLine());
			}
				
			
		}
		drukKalender(activiteiten,data,aantalOpgevuld);
		sc.close();

}
	private static void drukKalender(String[] activiteiten, Datum[] data,int aantalOpgevuld){
	System.out.println("**** Kalender voor januari 2016 ****");
	for(int i = 0; i < aantalOpgevuld;i++){
		data[i].print();
		System.out.println("\t\t" + activiteiten[i].toString());
	}
	}

}
