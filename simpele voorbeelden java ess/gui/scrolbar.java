package opdracht10;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.STRING;
import javax.swing.*;

public class MyFrame  extends JFrame {
	private JTextField uitkomst;
	private JButton [] nummers;
	private JPanel centrum;
	String [] hulpnummers = {"7","8","9","4","5","6","1","2","3","0","","c"};
	public MyFrame(){
		super("My Applycation");
		initComponents();
		layoutComponets();
		initListeners();
		setVisible(true);
		
	}
	
	

	private void initComponents(){//aanmaken van componeten
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		nummers = new JButton[12];
		
		for(int i =0; i< nummers.length; i++){
			nummers[i]= new JButton(hulpnummers[i]);
			
		}
		centrum = new JPanel();
		uitkomst = new JTextField();
		
	}
	private void layoutComponets(){//toevoegen van de componeten
		//layout bepalen
		setLocation(20,20);
		setSize(400,300);
		centrum.setLayout(new GridLayout(4,3));
		for(int i = 0; i<nummers.length-2;i++){
			centrum.add(nummers[i]);
		}
		JLabel leeg= new JLabel();
		centrum.add(leeg);
		centrum.add(nummers[11]);
		add(centrum,BorderLayout.CENTER);
		add(uitkomst, BorderLayout.NORTH);
		
	}
	
	private void initListeners() {
		ActionListener action = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = e.getActionCommand();
				if(txt.equals("c")){
					uitkomst.setText(" ");
				}else{
					uitkomst.setText(uitkomst.getText()+txt);
				}
					
			}
			
	};
	for(int i = 0; i < nummers.length; i++){
		nummers[i].addActionListener(action);
		nummers[i].setActionCommand(hulpnummers[i]);
	}
	
	

	}

}
