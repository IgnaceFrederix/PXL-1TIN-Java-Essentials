package modelView;

import be.pxl.h17.oef4.Leraar;
import be.pxl.h17.oef4.Vak;


public class PXLApp {
	private static Vak[] vakken;
	private static Leraar[] leraren;
	
	public static void main(String[] args) {
		init();
		//new OverzichtView(vakken, leraren);
	}
	
	private static void init() {
		String codeTabel[] = { "4TIN1100", "48TIN1130", "41TIN1140", "41TIN1160",
				"41TIN1240", "41TIN1290", "41TIN1300", "42TIN1220", "42TIN1230",
				"43AON3120", "43AON3130" };

		String[] naamTabel = { "Web Essentials", "Java Essentials",
				".Net Essentials", "SQL Essentials", "Desktop OS", "Math for IT",
				"Programming Basics", ".Net Advanced", "Java Advanced",
				"Programming Expert", "Mobile development" };
		int[] stpTabel = { 7, 6, 6, 3, 6, 6, 5, 3, 3, 3, 3 };

		vakken = new Vak[codeTabel.length];

		for (int i = 0; i < vakken.length; i++) {
			Vak v = new Vak(codeTabel[i], naamTabel[i], stpTabel[i]);
			vakken[i] = v;
		}
		
		

		leraren = new Leraar[3];
		leraren[0] = new Leraar("Daems", "Greta", 73);
		leraren[0].voegVakToe(vakken[1]);
		leraren[0].voegVakToe(vakken[6]);
		leraren[0].voegVakToe(vakken[9]);
		leraren[0].voegVakToe(vakken[7]);
		leraren[0].voegVakToe(vakken[8]);
		
		leraren[1] = new Leraar("Jansma", "Arrie", 49);
		leraren[1].voegVakToe(vakken[5]);
		leraren[1].voegVakToe(vakken[1]);
		
		leraren[2] = new Leraar("De Trwak", "Josie", 34);
		leraren[2].voegVakToe(vakken[0]);
		leraren[2].voegVakToe(vakken[6]);
	}
}
