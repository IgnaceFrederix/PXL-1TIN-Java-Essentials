package be.pxl.h10.opdracht8_shapes;

public abstract class Shape{
private int x,y;
private static int count;
{count++;}
public Shape(int x,int y){
	this.x = x;
	this.y = y;
}
public void setPosition (int x, int y) {
this.x = x;
this.y = y;
}
public int getX() {
return x;
}
public int getY() {
return y;
}
public static int getCount(){
	return count;
}
public abstract double getArea();
public abstract String getNaam();
public abstract double getPerimeter();
}

