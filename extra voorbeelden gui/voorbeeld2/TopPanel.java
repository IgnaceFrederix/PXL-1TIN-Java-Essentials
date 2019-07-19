package voorbeeld2;
import java.awt.*;

import javax.swing.*;



public class TopPanel extends JPanel {

	private JButton [] buttons;
	
	
    public TopPanel(){
       
        initComponents();
        layoutComponets();
        
        
    }
    
    private void initComponents(){//aanmaken van componeten
        buttons = new JButton[3];
        for(int i = 0; i < buttons.length; i++){
        	buttons[i] = new JButton("Button " + (i +1));
        }
        
    }
    
    private void layoutComponets(){//toevoegen van de componeten
        //layout bepalen
    	setLayout(new FlowLayout());// overbodig standaard layout bij een paneel => flowlayout
        for(JButton b: buttons){
        	add(b);
        	
        }
    
    }
    
    public JButton getButton(int i){
    	return buttons[i];
    }
}


	

	

		    
		