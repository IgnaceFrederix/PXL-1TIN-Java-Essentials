package opdrachtenh12;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Opdracht7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime nowBrussels = ZonedDateTime.now();
		System.out.println(nowBrussels.toLocalTime());
		
		ZoneId london = ZoneId.of("Europe/London");
		ZonedDateTime nowLondon = ZonedDateTime.now(london);
		System.out.println(nowLondon.toLocalTime());
		
		ZoneId Sydney = ZoneId.of("Australia/Sydney");
		ZonedDateTime nowSydney = ZonedDateTime.now(Sydney);
		System.out.println(nowSydney.toLocalTime());
		
		ZoneId otherzone = ZoneOffset.ofHours(-4);
		ZonedDateTime nowOther = ZonedDateTime.now(otherzone);
		System.out.println(nowOther.toLocalTime());
	}

}
