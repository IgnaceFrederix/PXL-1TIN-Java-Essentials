package h11.pxl.be.oefening2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.*;
public class AppKaart {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Kaart[] kaart = new Kaart[52];
		int tel=0;
		for(Soort s:Soort.values()){
			for(Ranking r:Ranking.values()){
				kaart[tel] = new Kaart(s,r);
				tel++;
			}
		
	}
		Collections.shuffle(Arrays.asList(kaart));
		boolean winnaar = false;
		while(winnaar == false){
			Random getal = new Random();
		int nummerbot = getal.nextInt(52);
		System.out.println("Geef een getal in (tussen 0 en 51)");
		int usergetal = keyboard.nextInt();
		
		
		if(kaart[nummerbot].getRanking().getWaarde() < kaart[usergetal].getRanking().getWaarde()){
		System.out.println("Winnaar speler " + kaart[usergetal].getSoort() + " "+kaart[usergetal].getRanking());
System.out.println("Verliezer computer " + kaart[nummerbot].getSoort() + " "+kaart[nummerbot].getRanking());
		winnaar = true;
		}else if (kaart[nummerbot].getRanking().getWaarde() == kaart[usergetal].getRanking().getWaarde()){
			System.out.println("Geen winnaar!");
			winnaar = false;
		}else{
			System.out.println("Winnaar computer " + kaart[nummerbot].getSoort() + " "+kaart[nummerbot].getRanking());
			System.out.println("Verliezer speler " + kaart[usergetal].getSoort() + " "+kaart[usergetal].getRanking());
			winnaar = true;
		}
		}
		keyboard.close();
		
	}
}
