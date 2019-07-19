package opdracht8;

import java.awt.BorderLayout;

import javax.swing.*;

public class MyFrame  extends JFrame {
	private JPanel bottom;
	private JPanel top;
	private JPanel left;
	private JScrollPane center;
	
	public MyFrame(){
		super("Pizza");
		initComponents();
		layoutComponets();
		setVisible(true);
		
	}
	
	private void initComponents(){//aanmaken van componeten
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		bottom = new BottomPannel();
		top = new Top();
		left = new LeftPannel();
		ImageIcon pizza = new ImageIcon("pizza.jpg");
		JLabel label = new JLabel(pizza);
		center = new JScrollPane(label);
	}
	private void layoutComponets(){//toevoegen van de componeten
		//layout bepalen
		setLocation(20,20);
		setSize(300,200);
		add(bottom, BorderLayout.SOUTH);
		add(top, BorderLayout.NORTH);
		add(left, BorderLayout.WEST);
		add(center, BorderLayout.CENTER);
	}
	

	

}
