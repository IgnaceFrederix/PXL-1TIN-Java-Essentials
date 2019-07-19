package OO5_oef3;
public class Gast
// wat is Gast ? 
// waarvoor dient de volgende {
{
    private int nummer;
    private String naam;
    private String land;
// wat zijn nummer,naam en land voor de klasse Gast ? 
    
// welk is de toegankelijkheid van nummer,naam en land ?
    
    private static String toegelatenLand[]={"België","Nederland","Duitsland","Frankrijk","Spanje"};
// geef de kenmerken van toegelatenLand 
// static ? 
// String ? 
// toegelatenLand [] ?
    
    public Gast()
    {   
    }   
// wat is Gast() voor deze klasse ? 
    
    public Gast(String naam, String land) {
        this.naam=naam;
        landControle(land);
        this.nummer=99;
    }

    public Gast(int nummer, String naam, String land) {
        this.nummer=nummer;
        this.naam=naam;
        landControle(land);
       
    }
//  waarin verschillen de 2 Gast-methode van elkaar ?  
    // hoe noemt men deze techniek ? 
    // is this.nummer=nummer te vervangen door 
    //          nummer=nummer;
    // welke is de toegankelijkheid van deze methoden ? 
    // waarom ? 
   
    public void wijzigLand(String land) {
       landControle(land);
     }

    public void wijzigNummer(int nr){
    	this.nummer=nr;
    }
//  wat betekent void ? 
    // wat is (int nr) voor deze methode ? 
    // mag this.nummer=nr vervangen worden door nummer=nr; ?
    

    public void wijzigNaam(String naam){
    	this.naam=naam;
    }
    
   
      
    public void drukAf() {
    	if(naam != null){
    		System.out.println("Gast nr "+nummer+" = "+naam+" - herkomst = "+land);
    		
    	}
    }
    public void landControle(String land){
    	boolean toegelaten=false;
    	 for (int i=0; i<toegelatenLand.length && toegelaten==false; i++) {
             if (land.equals(toegelatenLand[i])) {
                 this.land=land;
                 toegelaten=true;
             }
         }
    	 if(!toegelaten)
    		 this.land="Belgie";
    	
    }
    // wat doet de functie landControle(..)?
    // wat is het nut van "toegelaten " ? waarom boolean ? 
    
}
