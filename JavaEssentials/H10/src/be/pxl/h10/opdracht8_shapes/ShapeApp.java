package be.pxl.h10.opdracht8_shapes;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(1,2,45);
		Circle c2 = new Circle(1,2,5);
		System.out.println(c.getArea() + "\n" + c.getPerimeter());
			System.out.println(c);
			System.out.println(c.equals(c2));
		Shape[] s = new Shape[5];
		s[0] = new Circle(1,1,5);
		s[1] = new Circle(1,1,5);
		s[2] = new Triangle(10,10,0);
		s[3] = new Rectangle(15,15);
		s[4] = new Rectangle(15,20);
		for(Shape n:s){
			double p = Math.round(n.getPerimeter() * 100)/100.0;
			System.out.print("omtrek:\t"+p+"\t"+"oppervlakte:\t"
		+n.getArea()+"\t");
			if(n instanceof Rectangle){
				System.out.println("Rechthoek");
			}else if( n instanceof Circle){
				System.out.println("Cirkel");
			}else{
				System.out.println("Driehoek");
			}
		}
	}

}
