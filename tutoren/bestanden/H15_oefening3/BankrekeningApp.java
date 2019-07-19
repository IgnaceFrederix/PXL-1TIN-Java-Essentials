package pxl.be.h8.oef3;

public class BankrekeningApp {
	protected static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Bankrekening rekening1 = new Bankrekening();
		rekening1.stort(100);
		rekening1.setRekeningNummer("000-01574125-77");
		rekening1.stort(100);
		rekening1.verrichting(-50, 20, 10, -100, -25);
		
		Bankrekening rekening2 = new Bankrekening("000-2536987-33", "Jacqueline Klak", 30, 2);
		rekening2.schrijfRenteBij();
		
		double bedrag = rekening2.getSaldo();
		rekening2.neemOp(bedrag);
		rekening1.stort(bedrag);
		
		Bankrekening rekening3 = new Bankrekening();
		rekening3.setRekeningNummer("000-01574125-77");
		rekening3.stort(100);
		
		input.close();
	}

}
