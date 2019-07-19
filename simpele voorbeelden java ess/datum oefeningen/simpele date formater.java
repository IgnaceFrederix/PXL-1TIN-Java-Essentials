package opdracht9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Opdracht9 {

	public static void main(String[] args) {
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatterUit = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		Scanner input = new Scanner(System.in);
		System.out.println("geef een datum in dd/MM/yyyy");
		String dateString = input.nextLine();
		LocalDate datum =LocalDate.parse(dateString,formatter1);
		System.out.println(formatterUit.format(datum));
		
		
		input.close();

	}

}
