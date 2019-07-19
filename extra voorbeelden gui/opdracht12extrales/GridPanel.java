package opdracht12extrales;

import java.awt.*;

import javax.swing.*;

public class GridPanel extends JPanel{

	private JLabel[][] labels;
	
    public GridPanel(int rij, int kolom){
       
        initComponents(rij, kolom);// alternatief van private int
        layoutComponets(rij, kolom);
        
        
    }
    
    private void initComponents(int rij, int kolom){//aanmaken van componeten bij deze hebben we eens de ints toegevoegd bij de initcomponets normaal is dit een private int
       labels = new JLabel[rij][kolom];
       for(int i = 0; i < rij; i++){
    	   for(int j = 0; j < kolom; j++){
    		   labels[i][j] = new JLabel("*");
    	   }
       }
    }
    
    private void layoutComponets(int rij, int kolom){//toevoegen van de componeten
        //layout bepalen
    	setLayout(new GridLayout(rij, kolom));
    	for(int i = 0; i < rij; i++){
      	   for(int j = 0; j < kolom; j++){
      		   add(labels[i][j]);
      	   }
         }
    }
    
    public JLabel getLabel(int i, int j){
    	return labels[i][j];
    	
    }
    
    
}
