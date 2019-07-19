package opdracht8;

import javax.swing.*;

public class Top  extends JPanel {
	//private JLabel lblName, lblAdress;
	private JTextField txtName, txtAdress;
	private JButton btnOrder;
	
	public Top(){
		initComponents();
		layoutComponets();
		
		
	}
	
	private void initComponents(){//aanmaken van componeten
		//lblName = new JLabel("Name");
		txtName = new JTextField(20);
	//	lblAdress = new JLabel("adress");
		txtAdress = new JTextField(20);
		btnOrder = new JButton ("Order");
		
		
	}
	private void layoutComponets(){//toevoegen van de componeten
		//layout bepalen standaard layoutmanager panal = flowLayout
		//add(lblName);
		add(new JLabel("Name:"));
		add(txtName);
		//add(lblAdress);
		add(new JLabel("Adress:"));
		add(txtAdress);
		add(btnOrder);
		
		
	}
	

	

}
