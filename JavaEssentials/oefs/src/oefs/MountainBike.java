package oefs;

public class MountainBike extends Bicycle{
	private int Seatheight;


public MountainBike(int omwentelling, int versnelling, int snelheid,int Seatheight) {
		super(omwentelling, versnelling, snelheid);
		this.Seatheight=Seatheight;
		// TODO Auto-generated constructor stub
	}


public int getSeatheight() {
	return Seatheight;
}
public void setSeatheight(int seatheight) {
	Seatheight = seatheight;
}
public void print(){
	super.print();
	System.out.println("hello");
}
}

