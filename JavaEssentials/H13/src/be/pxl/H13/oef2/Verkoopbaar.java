package be.pxl.H13.oef2;

import java.time.LocalDate;

public interface Verkoopbaar {
	public static final int minPrijsM2 = 83;
	public abstract void wijsEenNotaris(String s,LocalDate l);
	public abstract void doeEenBod(double d,LocalDate m);
}
