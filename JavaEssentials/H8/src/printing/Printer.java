package printing;

public class Printer 
{
	private boolean isOn;
	private String modelNumber;
	public Printer(boolean isOn,String modelNumber)
	{
		this.isOn = isOn;
		this.modelNumber = modelNumber;
	}
	
	public void print(){
		System.out.println(isOn);
		System.out.println(modelNumber);
	}
	public void print(String text){
		System.out.println(text);
	}
	public String getModelNumber(){
		return modelNumber;
	}
}
