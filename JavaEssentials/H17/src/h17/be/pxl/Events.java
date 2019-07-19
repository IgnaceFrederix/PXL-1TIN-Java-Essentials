package h17.be.pxl;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Events extends JFrame{
private JButton button;
private JTextField txt;
private JLabel lblCelcius;
private JLabel lblresultaat;
private JLabel lblaantal;
private JLabel aantal;
private double fahren;
private int convwaarde = 0;
	public Events(){
		super("My Application");
		initComponents();
		layoutComponents();
		initListeners();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setLocation(200,200);
		setVisible(true);
	}

	private void layoutComponents() {
		setLayout(new GridLayout(3, 2));
		add(new JLabel("Celcius: "));
		add(txt);
		add(button);
		add(lblresultaat);
		add(new JLabel("Aantal conversies"));
		add(aantal);
	}

	private void initComponents() {
		lblresultaat = new JLabel(fahren+" Fahrenheit");
		aantal = new JLabel("0");
		txt = new JTextField(10);
		button = new JButton("Converteer");
		
	}
	private void initListeners(){
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double value = Double.parseDouble(txt.getText());
				value = value * 1.8+32;
				convwaarde++;
				aantal.setText(""+convwaarde);
				lblresultaat.setText(""+value);
			}
		});
	}

}
