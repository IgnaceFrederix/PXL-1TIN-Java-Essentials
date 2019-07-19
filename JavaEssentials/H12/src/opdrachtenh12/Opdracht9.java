package opdrachtenh12;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Opdracht9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("geef een datum in");
		String datum1 = k.nextLine();
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dt1 = LocalDate.parse(datum1, format2);
		System.out.println(format1.format(dt1));
	}

}
