package be.pxl.h10.opdracht8_shapes;

public class Circle extends Shape{
private int straal;
private final String naam = "Cirkel";
public Circle(int x,int y,int straal){
	super(x,y);
	this.straal = straal;
}
public int getStraal() {
	return straal;
}
public double getArea(){
	double a = straal * straal * Math.PI;
	return Math.round(a*100)/100.0;
}
public String getNaam(){
	   return naam;
}
public double getPerimeter(){
	double d = 2* straal * Math.PI;
	return Math.round(d*100)/100.0;
}
public void setStraal(int straal) {
	this.straal = straal;
}
public String toString(){
	return String.format("circle with straal (%d) at position (%d,%d)",
			straal,getX(),getY());	
}
public boolean equals(Object o){
	if((o != null)&&
			(o.getClass()==this.getClass())&&
			(((Circle)o).getX() == this.getX()) &&
			(((Circle)o).getY() == this.getY())&&
			(((Circle)o).straal == this.straal))
		return true;
	else return false;
}

}
