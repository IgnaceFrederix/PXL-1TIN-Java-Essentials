package be.pxl.h10.opdracht8_shapes;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawing draw = new Drawing(5);
		Rectangle r = new Rectangle(5,5);
		Circle s = new Circle(5,5,5);
		//draw.addShape(r);
		draw.addShape(s);
		draw.addShape(s);
		draw.addShape(r);
		draw.removeShape(s);
		draw.print();
	}

}
