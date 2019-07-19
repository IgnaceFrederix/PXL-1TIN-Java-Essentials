package oefs;

public class BicycleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle [] shop = new Bicycle[6];
		shop[0] = new Bicycle(60,20,3);
		shop[1] = new Bicycle(70,22,4);
		shop[2] = new MountainBike(100, 60,20,3);
		shop[3] = new MountainBike(80, 65,20,5);
		shop[4] = new Bicycle(75,24,4);
		shop[5] = new MountainBike(95, 75,20,3);
		shop[0].setSnelheid(shop[0].getSnelheid()+5);
		
		shop[5] = new MountainBike(95,75,20,100);
//		System.out.println(shop[5].get);
//		System.out.println(shop[0].getSnelheid());
		shop[5].print();
		for(Bicycle b:shop){
			if(b instanceof MountainBike){
				System.out.println(b);
			}
		}
	}

}
