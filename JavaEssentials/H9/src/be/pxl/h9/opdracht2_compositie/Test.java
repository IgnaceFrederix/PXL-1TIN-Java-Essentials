package be.pxl.h9.opdracht2_compositie;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// navigeerbaarheid: house ->room niet room -> house
		House h=new House();
		System.out.println(h.getKitchen().getName());
		System.out.println(h.getBathroom().getName());
	}

}
