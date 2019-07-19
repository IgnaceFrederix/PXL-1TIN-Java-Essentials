package be.pxl.H15.oef;

public class Oefening2 {
	public static void main(String args[]) {
		int getal1 = 0, getal2 = 0;
		char bewerking = 'x';
		boolean fout = false;
		
		int result = 0;
		try {
		getal1 = Integer.parseInt(args[0]);
		getal2 = Integer.parseInt(args[1]);
		bewerking = args[2].charAt(0);
		switch (bewerking) {
		case '+':
			result = getal1 + getal2;
			break;
		case '-':
			result = getal1 - getal2;
			break;
		case '/':
			result = getal1 / getal2;
			break;
		case 'x':
			result = getal1 * getal2;
			break;
		default:
			fout = true;
		}
		if (!fout)
			System.out.println(getal1 + " " + bewerking + " " + getal2 + " = " + result);
		else
			System.out.println("Foute bewerking!");
		}catch (NumberFormatException ex) {
			System.out.println("foutieve getal ingevoerd");
		}catch(IndexOutOfBoundsException ex){
			System.out.println("uw getal ligt buiten de array waarden");
		}catch(ArithmeticException ex){
			System.out.println("je kan niet delen door 0");
		}
		

	}
}
