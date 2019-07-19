package opdracht7;

import java.awt.GridLayout;

import javax.swing.*;

public class MyFrame  extends JFrame {
	private JLabel[] titel;
	private JLabel[]product;
	private JTextField [] aantal;
	private JLabel [] prijs;
	private JLabel [] totaal;
	
	public MyFrame(){
		super("My Applycation");
		initComponents();
		layoutComponets();
		setVisible(true);
		
	}
	
	private void initComponents(){//aanmaken van componeten
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		titel = new JLabel[4];
		String [] hulpTitel = {"Product", "Count", "Price", "Total"};
		product = new JLabel[3];
		String [] hulpProduct = {"Appels", "Oranges", "Bananas"};
		aantal = new JTextField[3];
		prijs = new JLabel[3];
		String [] hulpPrijs = {"1.4","1.7","1.2"};
		totaal = new JLabel[3];
		for(int i = 0; i < titel.length; i++){
			titel[i] = new JLabel(hulpTitel[i]);
		}
		for (int i = 0; i < product.length; i++){
			product[i] = new JLabel(hulpProduct[i]);
			aantal[i] = new JTextField();
			prijs[i] = new JLabel(hulpPrijs[i]);
			totaal[i] = new JLabel("0");
		}
	}
	private void layoutComponets(){//toevoegen van de componeten
		//layout bepalen
		setLocation(20,20);
		setSize(300,200);
		setLayout(new GridLayout(4,4));
		for(JLabel lbl : titel)add(lbl);
		for (int i = 0; i < product.length; i++){
			add(product[i]);
			add(aantal[i]);
			add(prijs[i]);
			add(totaal[i]);
		}
	}
	

	

}
