package be.pxl.H13.opdracht;

import java.awt.Graphics;

public class Drawing implements Drawable{
	private final int MAX = 100;
	private Drawable[] drawables = new Drawable[MAX];
	
	//private int size=0;

	
	//opdracht12 punt2
	public Drawing(int grootte) {
		drawables = new Shape[grootte];
	}

	//opdracht12 punt3
	public void add(Shape s) {
		if (!isPresent(s)) {
			if (getFreeLocation() != -1) {
				drawables[getFreeLocation()] = s;
			} else {
				System.out.println("de array is vol");
			}
		}
	}

	//opdracht12 punt3  // als return statement ==> method wordt afgebroken
	private int getFreeLocation() {
		for (int i = 0; i < drawables.length; i++) {
			if (drawables[i] == null) {
				return i;
			}
		}
		return -1;
	}

	//opdracht12 punt3  // shapes[i].equals(s): kan niet omdat je geen enkele methode kan toepassen op null en shape[i] is wel gedeclareerd maar kan mogelijks geen waarde hebben
	//hetgeen voor de equals staat moet bestaan dus mag geen referentie hebben naar null; Shape kan in dit geval leeg zijn
	private boolean isPresent(Shape s) {
		for (int i = 0; i < drawables.length; i++) {
			if (s.equals(drawables[i])) {
				return true;
			}
		}
		return false;
	}

	//opdracht12 punt4
	public void remove(Shape s) {
		for (int i = 0; i < drawables.length; i++) {
			if (s.equals(drawables[i])) {
				drawables[i] = null;
				i = drawables.length;
			}
		}
	}

	//opdracht12 punt5
	public void clear() {
		int grootte = drawables.length;
		drawables = new Shape[grootte];
	}

	//opdracht12 punt6
	public void print() {
		for (Drawable s : drawables) {
			if (s != null)
				System.out.println(s.toString());
		}
	}

	@Override
	public void scale(int factor) {
		// TODO Auto-generated method stub
		for(Drawable d: drawables){
			if(d !=null)d.scale(factor);
		}
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		for(Drawable d: drawables){
			if(d !=null)d.draw(g);;
		}
	}
	public String toString(){
		StringBuilder b = new StringBuilder("");
		for(Drawable d:drawables){
			if(d!=null){
				b.append(d.toString()+"\n");
			}
		}
		String s = b.toString();
		return s;
	}
}