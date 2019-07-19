package be.pxl.h10.opdracht8_shapes;

public class Drawing{
private int maxAantal;
private Shape[] shapes ;
public Drawing(int maxAantal){
	this.maxAantal = maxAantal;
	shapes = new Shape[maxAantal];
}
public void addShape(Shape s){
	
	if(isPresent(s) == false){
	if(getFreeLocation() != -1){
		shapes[getFreeLocation()] =s;
	}
	
	}
}
private boolean isPresent(Shape s1){
	boolean controle = false;
	for(Shape n :shapes){
		if(n!=null&& n.equals(s1) ){
			controle = true;
			System.out.println("Figuur bestaat al");
			break;
		}else{
			controle=false;
			System.out.println("figuur wordt toegevoegd");
			break;
		}
	}
	return controle;
}
private int getFreeLocation(){
	int leegArray = -1;
	
	for(int i = 0;i<shapes.length;i++){
		if(shapes[i] == null){
			leegArray = i;
			i = shapes.length;
		}
	}
	
	return leegArray;
}
public void removeShape(Shape s){
	for(int i = 0;i<shapes.length;i++){
		if(shapes[i].equals(s)){
			shapes[i] = null;
			i = shapes.length;
		}
	}
}
public void clear(){
	for(int i = 0;i<shapes.length;i++){
		shapes[i] = null;
	}
}
public void print(){
	for(int i = 0;i<shapes.length;i++){
		if(shapes[i]!=null)
		System.out.println("omtrek:\t"+shapes[i].getPerimeter()+"\t"+shapes[i].getNaam());
	}
	
}
}
