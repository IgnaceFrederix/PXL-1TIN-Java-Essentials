package opdracht8;

import java.awt.BorderLayout;

import javax.swing.*;

public class LeftPannel  extends JPanel {
	private JLabel lblIng;
	private JList <String>listIng;
	
	public LeftPannel(){
	
		initComponents();
		layoutComponets();
		
		
	}
	
	private void initComponents(){//aanmaken van componeten
		lblIng = new JLabel("Ingredients:");
		String[] ingredients = {"Cheese","Tomatoes","bacon","eggs","Mushrooms", "shrimps","ham","pepper","oinions","smoked salmon","garlic"};
		listIng = new JList <String>(ingredients);
		listIng.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		//om meerder dinge te slectere ctrl toetst inhouden stadaad staat dit op mutlple 
	}
	private void layoutComponets(){//toevoegen van de componeten
		//layout bepalen
		setLayout(new BorderLayout());
		add(lblIng,BorderLayout.NORTH);
		add(listIng, BorderLayout.SOUTH);
	}
	

	

}



