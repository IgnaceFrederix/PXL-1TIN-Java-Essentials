package be.pxl.H13.oef2;

import java.time.LocalDate;

public class VerkoopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeVerkopenBouwGrond t = new TeVerkopenBouwGrond((float) 12.4, "12ER","openbebouwing");
		LocalDate d = LocalDate.of(2015, 05, 11);
		t.wijsEenNotaris("berkan", d);
		t.doeEenBod(120000, d.plusDays(11));
		t.doeEenBod(180000, d.plusDays(15));
	}

}
