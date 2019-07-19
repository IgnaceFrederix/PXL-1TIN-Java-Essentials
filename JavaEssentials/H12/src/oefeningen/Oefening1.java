package oefeningen;

import java.util.*;


public class Oefening1 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Object[] objecten = new Object[5];
		// TODO Auto-generated method stub
		String waarde = k.next();
		char charac = waarde.charAt(0);
		
		Character c = new Character(charac);
		objecten[0] = c;
		Integer i = new Integer(k.nextInt());
		objecten[1] = i;
		Long l = new Long(k.nextLong());
		objecten[2] = l;
		Float f = new Float(k.nextFloat());
		objecten[3] = f;
		Double d = new Double(k.nextDouble());
		objecten[4] = d;
		for(int j = 0;j<objecten.length;j++){
			System.out.println(objecten[j]);
		}
		Collections.shuffle(Arrays.asList(objecten));
		System.out.println();
		for(int j = 0;j<objecten.length;j++){
			if(objecten[j] instanceof Character){
				
			if(Character.isLowerCase((char)objecten[j])){
				System.out.println("kleine letter");
			}	else{
				System.out.println("grote letter");
	}
			}else{
			if(objecten[j] instanceof Integer){
				if((int) objecten[j] > 0){
					System.out.println(objecten[j] +" is een integer en de aftsand tot het grootste is "+(Integer.MAX_VALUE - (int) objecten[j]));
				}else{
					System.out.println(objecten[j] +" is een integer en de aftsand tot de kleinste is "+(Integer.MIN_VALUE + (int) objecten[j]));
				}
			}else if(objecten[j] instanceof Long){
				if((long) objecten[j] > 0){
					System.out.println(objecten[j] +" is een long en de aftsand tot het grootste is "+(Long.MAX_VALUE - (long) objecten[j]));
				}else{
					System.out.println(objecten[j] +" is een long en de aftsand tot de kleinste is "+(Long.MIN_VALUE + (long) objecten[j]));
				}
			}else if(objecten[j] instanceof Double){
				int waarde2 = ((objecten[j].toString().length()-objecten[j].toString().indexOf('.')))-1;
				System.out.println(objecten[j]+" is een double en getallen voor de komma "+objecten[j].toString().indexOf('.') + " getallen na de komma "+(waarde2));
			}else if(objecten[j] instanceof Float){
				int waarde3 = ((objecten[j].toString().length()-objecten[j].toString().indexOf('.')))-1;
				System.out.println(objecten[j]+" is een float getallen voor de komma "+objecten[j].toString().indexOf('.') + " getallen na de komma "+(waarde3));
			}
			}
		}
		k.close();
	}

}
