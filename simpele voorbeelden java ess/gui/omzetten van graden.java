package H17.src.be.pxl.h17.oef1.copy;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
public class Oefening1 extends JFrame{
	//aanmaken van J_onderdelen
	private JButton button;
	private JTextField txt;
	private JLabel lblCelcius;
	private JLabel lblresultaat;
	private JLabel lblaantal;
	private JLabel aantal;
	private double fahren;
	private int convwaarde = 0;
	//alle funties toveogen aan consturcot
		public Oefening1(){
			super("Oefening1");
			initComponents();
			layoutComponents();
			initListeners();
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(300,300);
			setLocation(200,200);
			setVisible(true);
		}
//eerst set van layour en daarna add van de J onderdeln of een nieuw Jonderdeel daar aanmaken
		private void layoutComponents() {
			setLayout(new GridLayout(3, 2));
			add(new JLabel("Celcius: "));
			add(txt);
			add(button);
			add(lblresultaat);
			add(new JLabel("Aantal conversies"));
			add(aantal);
		}
//dingen inzetten die aanpassen
		private void initComponents() {
			lblresultaat = new JLabel();
			aantal = new JLabel("0");
			txt = new JTextField(10);
			button = new JButton("Converteer");
			
		}
		//doe iets met een know of iets anders
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
