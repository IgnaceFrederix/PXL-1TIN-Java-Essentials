package be.pxl.H13.opdracht;

import java.util.Random;

public class DrawApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scaleable[] s = new Shape[50];
//		s[0] = new Circle(1,2,3);
//		s[1] = new Rectangle(1,2,3,4); 
//		s[2] = new Triangle(1,2,3); 
		Random rand = new Random();
		for(int i =0;i<50;i++){
			s[i] = new Circle(0,0,(rand.nextInt(50)+1));
		}
		for(int i = 0;i<50;i++){
			System.out.println(s[i].toString());
		}
		System.out.println();
		for(int i =0;i<50;i++){
			s[i].scale(50);
			System.out.println(s[i].toString());
		}
		
	}

}
