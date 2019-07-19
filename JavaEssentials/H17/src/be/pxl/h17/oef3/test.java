package be.pxl.h17.oef3;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.event.*;
public class test extends JFrame {
	private JPanel overlay,leftpanel,midgrid, midgridcenter,midgridcenterer,last,border;
	private JTextField center;
	private JButton  red,green,blue;
	public test() {
		
		overlay = new JPanel(new BorderLayout());
		leftpanel = new JPanel(new GridLayout(3,1));
		center = new JTextField("begin");
		border = new JPanel(new FlowLayout());
		midgrid = new JPanel(new GridLayout(3,1));
		
		center.setFont( center.getFont().deriveFont(Font.BOLD));
		center.setHorizontalAlignment(JTextField.CENTER);
		center.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		//buttons leftpanel		
		red = new JButton("Red");
		green = new JButton("green");
		blue = new JButton("blue");
		leftpanel.add(red);
		leftpanel.add(green);
		leftpanel.add(blue);
		
		red.addActionListener(new red());
		green.addActionListener(new green());
		blue.addActionListener(new blue());
				
		
		//overlay
		overlay.add(leftpanel, BorderLayout.WEST);
		overlay.add(center, BorderLayout.CENTER);
		
	
		add(overlay);
		setSize(400,400);
		setVisible(true);
		setLocation(400,400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		
		
		
	}
	
	private class red implements ActionListener{
			public void actionPerformed(ActionEvent e){
				center.setText("red");
				center.setBackground(Color.red);
			}
		}
	private class green implements ActionListener{
		public void actionPerformed(ActionEvent e){
			center.setText("green");
			center.setBackground(Color.GREEN);
		}
	}
	private class blue implements ActionListener{
		public void actionPerformed(ActionEvent e){
			center.setText("blue");
			center.setBackground(Color.BLUE);
		}
	}
	
	

	public static void main(String[] args)  {
		test main = new test();
		
		
		
		
		
		
		
		
		
		

	}

}






