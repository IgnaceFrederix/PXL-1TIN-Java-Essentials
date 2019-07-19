package be.pxl.H13.opdracht;

public interface Scaleable {
public final static int QUARTER = 25;
public final static int HALF = 50;
public final static int DOUBLE = 200;

public abstract void scale(int factor);
public default void scaleDouble(){
	scale(DOUBLE);
}
public default void scaleHAlf(){
	scale(HALF);
}
}
