package be.pxl.H13.opdracht;

public abstract class Shape implements Drawable{

	private int x, y;
	
	//opdracht8 punt3
	private static int aantal;
	public Shape(){
		this(0,0);
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
		//opdracht8 punt3
		aantal++;
	}

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	//opdracht8 punt3
	public static int getAantal() {
		return aantal;
	}

}

