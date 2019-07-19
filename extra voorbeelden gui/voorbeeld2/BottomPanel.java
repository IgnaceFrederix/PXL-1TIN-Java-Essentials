package voorbeeld2;

import java.awt.*;

import javax.swing.*;

public class BottomPanel extends JPanel {

	    
	private JButton [] buttons;
	
	
	    public BottomPanel(){
	       
	        initComponents();
	        layoutComponets();
	        
	        
	    }
	    
	    private void initComponents(){//aanmaken van componeten
	        buttons = new JButton[3];
	        for(int i = 0; i < buttons.length; i++){
	        	buttons[i] = new JButton("Button " + (i +4));
	        }
	        
	    }
	    
	    private void layoutComponets(){//toevoegen van de componeten
	        //layout bepalen
	    	setLayout(new FlowLayout());// overbodig standaard layout bij een paneel => flowlayout
	        for(JButton b: buttons){
	        	add(b);
	        	
	        }
	    
	    }

}
