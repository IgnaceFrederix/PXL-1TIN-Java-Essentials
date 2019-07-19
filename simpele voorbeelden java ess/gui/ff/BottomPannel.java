package opdracht8;

import java.awt.Component;

import javax.swing.*;

public class BottomPannel  extends JPanel {
	private JLabel lblBottom, lblSize, lblNumber;
	private JRadioButton rdbnT, rdbtnC;
	private JCheckBox chkS;
	private JComboBox<String> cmbSize;
	private JTextField txtAantal;
	private Component rdbtnT;
	
	public BottomPannel(){
		
		initComponents();
		layoutComponets();
		
		
	}
	
	private void initComponents(){//aanmaken van componeten	
		lblBottom = new JLabel("Bottom:");
		rdbnT = new JRadioButton("traditional");
		rdbtnC = new JRadioButton("Crusty");
		ButtonGroup group = new ButtonGroup();
		group.add(rdbnT);
		group.add(rdbtnC);
		chkS = new JCheckBox("Spicy");
		lblSize = new JLabel("Size:");
		String [] sizes = {"small","Mediium","Large","Family"};
		cmbSize = new JComboBox<String>(sizes);
		lblNumber = new JLabel("Number:");
		txtAantal = new JTextField("1");
 	}
	
	private void layoutComponets(){//toevoegen van de componeten
		//layout bepalen
		add(lblBottom);
		add(rdbtnT);
		add(rdbtnC);
		add(chkS);
		add(lblSize);
		add(lblNumber);
		add(txtAantal);
		
		
		
	}
	

	

}
