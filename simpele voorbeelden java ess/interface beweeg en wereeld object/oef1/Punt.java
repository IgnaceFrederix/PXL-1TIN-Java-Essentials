package H13.bin.be.pxl.H13.oef1;

public class Punt{
private int x;
private int y;
public final static int MAXIMUMGROOTTE = 99;
public Punt(int x,int y){
	this.x = x;
	this.y = y;
	controleer();
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
	controleer();
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
	controleer();
}
public double berkenAfstand(Punt p){
 return Math.sqrt(Math.pow(this.x - p.x,2)+Math.pow(this.y -p.y, 2));
}
public void drukAfk(){
	System.out.println("x = "+x+", y = "+y);
}
private void controleer(){
	if(this.x < 0){
		this.x=0;
	}
	if(this.y <0){
		this.y = 0;
	}
	if(this.x > MAXIMUMGROOTTE){
		this.x=MAXIMUMGROOTTE;
	}
if(this.y > MAXIMUMGROOTTE){
		this.y=MAXIMUMGROOTTE;
	}
}
}
