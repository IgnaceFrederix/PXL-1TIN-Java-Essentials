package be.pxl.examen.vraag2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Oefeningandreas extends JFrame {

	private static final long serialVersionUID = 1L;

	public Oefeningandreas() {
		super("EXAMEN Vraag2");
		getContentPane().setLayout(new GridLayout(1, 2));
		
	

		JPanel panel = new JPanel();
		JLabel lbl = new JLabel();

		panel.setLayout(new GridLayout(5,5));

		for (int i = 0; i <= 24; i++) {
			lbl = new JLabel("1");
			lbl.setHorizontalAlignment(lbl.CENTER);
			lbl.setVerticalAlignment(lbl.CENTER);
	
			lbl.setOpaque(true);
			panel.add(lbl);
		}
		JPanel butPanel = new JPanel(new GridLayout(3, 1));
		JButton red = new JButton("Red");
		JButton green = new JButton("Green");
		JButton blue = new JButton("Blue");
		butPanel.add(red);
		butPanel.add(green);
		butPanel.add(blue);

		add(panel, BorderLayout.CENTER);

		setSize(1080, 720);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Oefeningandreas screen = new Oefeningandreas();
	}
}
