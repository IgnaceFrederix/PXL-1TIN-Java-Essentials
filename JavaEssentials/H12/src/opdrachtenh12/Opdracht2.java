package opdrachtenh12;
public class Opdracht2 {
	  public static void main (String args []){

			System.out.println ("min.value = " + Integer.MIN_VALUE);
			System.out.println ("max.value = " + Integer.MAX_VALUE);
			//de minimum en maximum waarde voor integer

			Integer iObj = new Integer("1234567"),
				  jObj = new Integer(1234567);
			//zeflde waarde maar verschillende referenties

			System.out.println("waarden van de integer objecten vergeleken : "
						+ iObj.equals(jObj));
			//zzelfde waarde dus true

			System.out.println("referenties vergeleken : "
					+ (iObj == jObj));
			//verschillende referenties dus false

			System.out.println("int-waarden vergeleken met constante: "
						+ (iObj.intValue()== 1234567));
			//

			System.out.println("int-waarden vd objecten vergeleken : "
					+ (iObj.intValue()== jObj.intValue()));
			//

			int k=255;
			Integer kObj=new Integer(k);
			System.out.println(k);
			System.out.println(kObj.toString());
			//
			System.out.println(Integer.toString(k));
			//
			System.out.println(Integer.toString(k,2));
			//
			System.out.println(Integer.toBinaryString(k));
			//
			System.out.println(Integer.toHexString(k));
			//
			System.out.println(Integer.toString(k, 16));
		}

}
