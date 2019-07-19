package printing;

public class Joske {

	public static void main(String[] args) {
		
		Printer p = new Printer(true,"My PRINTEr");
		p.print();
		Printer k = new Printer(false,"your printer");
		k.print();
	}

}
