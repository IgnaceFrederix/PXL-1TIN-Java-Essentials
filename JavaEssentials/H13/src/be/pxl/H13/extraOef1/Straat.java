package be.pxl.H13.extraOef1;

public class Straat implements Doorloopbaar{
	private Structuur[] structuur;
	@Override
	public int geefAantal() {
		// TODO Auto-generated method stub
		int teller = 0;
		for(Structuur g: structuur){
			if(g!=null){
				teller++;
			}
		}
		return teller;
	}
	public Structuur getStructuur(int j) {
		return structuur[j];
	}
	public Straat() {
		structuur = new Structuur[MAX];
	}
	public void VoegStructuurToe(Structuur s){
		boolean bestaat = false;
		for(Structuur g:structuur){
			if(s.equals(g)){
				bestaat = true;
				break;
			}
		}
		if(bestaat == false){
		for(int i =0;i<structuur.length;i++){
			if(structuur[i]==null){
				structuur[i] = s;
				System.out.println("toegevoegd");
				break;
			}
		}
		}
	}
	@Override
	public Object geefWaarde(int i) {
		// TODO Auto-generated method stub
		
		return structuur[i];
	}

}
