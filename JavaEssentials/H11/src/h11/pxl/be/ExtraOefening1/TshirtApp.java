package h11.pxl.be.ExtraOefening1;

import java.util.*;

public class TshirtApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int teller = 0;		
		Tshirt[] shirts = new Tshirt[Kleur.values().length*TShirtSize.values().length];
		for(Kleur k:Kleur.values()){
			for(TShirtSize s:TShirtSize.values()){
				shirts[teller] = new Tshirt(s.name(),k.name());
				teller++;
			}
		}
		String maat ="";
		int borstomtrek,aantal=0;
		String kleur;
		System.out.println("Geef je naam in: ");
		String naam = keyboard.nextLine();
		while(!naam.equals("stop") && !naam.equals("Stop")){
		System.out.println("Geef je borstomtrek in:");
		borstomtrek = keyboard.nextInt();
		for(TShirtSize t:TShirtSize.values()){
			if(borstomtrek == t.getBorstomtrek()){
			System.out.println("maat voor deze persoon = " + t.getMaat());
			maat = t.getMaat();
			break;
			}
		}
		System.out.println("geef je kleur in ");
		kleur = keyboard.next();
		keyboard.nextLine();
		System.out.println("geef het aantal in");
		aantal = keyboard.nextInt();
		for(int i =0;i<shirts.length;i++){
			switch(maat){
			case "XS":
			maat = "extra_smal";
			break;
			case "S":
			maat = "smal";
			break;
			case "M":
			maat = "medium";
			break;
			case "L":
			maat = "large";
			break;
			case "XL":
			maat = "x_large";
			break;
			case "XXL":
			maat = "xx_large";
			break;
			case "XXXL":
			maat = "xxx_large";
			break;
			}
		
			System.out.println(maat);
			if(shirts[i].getKleur().equals(kleur) && shirts[i].getMaat().equals(maat)){
				shirts[i].setaantal(aantal);
				System.out.println(shirts[i].getMaat() + " - " + shirts[i].getKleur());
				break;
			}
		}
		System.out.println("Geef je naam in:");
		naam = keyboard.next();
		}
		System.out.println("\t"+TShirtSize.extra_smal.getMaat()+"\t"+TShirtSize.smal.getMaat()+"\t"+TShirtSize.medium.getMaat()+"\t"+TShirtSize.large.getMaat()+"\t"+TShirtSize.x_large.getMaat()+"\t"+TShirtSize.xx_large.getMaat()+"\t"+TShirtSize.xxx_large.getMaat());
		System.out.print("ROOD");
		for(int i = 0;i<shirts.length;i++){
			if(shirts[i].getKleur().equals("rood"))
			System.out.print("\t"+shirts[i].getAantal());
		}
		System.out.println();
		System.out.print("GROEN");
		for(int i = 0;i<shirts.length;i++){
			if(shirts[i].getKleur().equals("groen"))
			System.out.print("\t"+shirts[i].getAantal());
		}
		System.out.println();
		System.out.print("BLAUW");
		for(int i = 0;i<shirts.length;i++){
			if(shirts[i].getKleur().equals("blauw"))
			System.out.print("\t"+shirts[i].getAantal());
		}
		System.out.println();
		System.out.print("WIT");
		for(int i = 0;i<shirts.length;i++){
			if(shirts[i].getKleur().equals("wit"))
			System.out.print("\t"+shirts[i].getAantal());
		}
		keyboard.close();
		}
}


