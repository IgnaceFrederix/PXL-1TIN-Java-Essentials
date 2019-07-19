package be.pxl.h10.oef3;

public class SportApp {

	public static void main(String[] args) {
		Sporter[] sporters = new Sporter[10];
		sporters[0] = new Sporter("An","Bex","zwemmen");
		sporters[1] = new Sporter("Els","Nilis","Volleybal");
		sporters[2] = new Voetballer("Niels","Vos","KSKHasselt",1);
		sporters[3] = new Voetballer("Joren","Vos","KSKHasselt",2);
		sporters[4] = new Voetballer("Joni","Dirix","KSKHasselt",2);
		sporters[5] = new Voetballer("Jelle","Maes","KSKHasselt",0);
		sporters[6] = new Voetballer("Martijn","Hox","KSKHasselt",3);
		sporters[7] = new Sporter("Sofie","Baerts","zwemmen");
		sporters[8] = new Sporter("Leen","Adams","atletiek");
		sporters[9] = new Sporter("Miet","Loos","zwemmen");
		StringBuilder voetbal = new StringBuilder("");
		StringBuilder andere = new StringBuilder("");
		
		System.out.println("Overzicht sporters (behalve voetbal)");
		for(int i = 0;i<sporters.length;i++){
			if(sporters[i]!=null && sporters[i] instanceof Voetballer){
			}else{
				if(sporters[i]!=null){
					
					System.out.println(sporters[i].print());
				}
			}
		}
		System.out.println();
		System.out.println("Overzicht voetballers");
		StringBuilder verdediger = new StringBuilder("*** verdediger ***\n");
		StringBuilder aanvaller = new StringBuilder("*** aanvaller ***\n");
		StringBuilder onbepaald = new StringBuilder("*** onbepaald ***\n");
		StringBuilder middenvelder = new StringBuilder("*** middenvelder ***\n");
		int teller = 0;
		for(int i = 0;i<sporters.length;i++){
			if(sporters[i]!=null && sporters[i] instanceof Voetballer){
				String clubpos = sporters[i].print().substring(sporters[i].print().lastIndexOf(" ")+1);
				switch(clubpos){
				case "aanvaller":aanvaller.append(sporters[i].print()+"\n");
				break;
				case "verdediger":verdediger.append(sporters[i].print()+"\n");
				break;
				case "middenvelder":middenvelder.append(sporters[i].print()+"\n");
				break;
				case "onbepaald":onbepaald.append(sporters[i].print()+"\n");
				break;
				}
				
				}
		}
System.out.println(aanvaller.toString() +"\n"+ verdediger.toString() +"\n"+ middenvelder.toString() + "\n"+onbepaald.toString());

	}

}
