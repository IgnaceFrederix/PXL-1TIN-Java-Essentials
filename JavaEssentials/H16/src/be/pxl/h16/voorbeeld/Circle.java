package be.pxl.h16.voorbeeld;
/** 
 * 
 * @author Berkan
 * @version 1.0
 * @see be.pxl.h16.voorbeeld.Shape
 */
public class Circle extends Shape {
	
	private int straal;
	/**
	 * This constructor creates a Circle with specified parameters for x,y and straal
	 *  
	 * @param x
	 * 		the x position of the Circle
	 * @param y
	 * 		the y position of the Circle
	 * @param straal
	 * 		the straal of the Circle is
	 */
	public Circle (int x, int y, int straal) {
		super(x,y);
		this.straal = straal;
	}

	public int getStraal() {
		return straal;
	}
	/**
	 * Returns the straal of the Circle
	 * This sets a value for the straal of the Circle
	 * @param straal	The initial straal of the rectangle
	 */
	public void setStraal(int straal) {
		this.straal = straal;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(straal, 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * straal;
	}
	//opdracht9
	@Override
	public String toString() {
		return "Circle [straal=" + straal + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
	//opdracht10
	public boolean equals (Object o) {
		if (o == null) {
			return false;
		} else {
			if (o.getClass() != this.getClass()) {
				return false;
			} else {
				Circle oCircle = (Circle) o;
				if (oCircle.getX() == this.getX() && oCircle.getY() == this.getY()
					&& oCircle.getStraal() == this.getStraal()) {
						return true;
					} else {
						return false;
					}
				
			}
		}
	}

}
