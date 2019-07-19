package be.pxl.h17.oef1;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;
public class Oefening2 extends JFrame{
	private JLabel lblproduct,lblCount,lblPrice,lblTotal;
	private static final String[] PRODUCTNAMES={"Apples","Oranges","Bananas"};
	private static final double[] PRICES={1.3,1.7,1.2};
	private JLabel[] lblProducts;
	private JTextField[] txtCounts;
	private JLabel[] lblprices;
	private JLabel[] lblTotals;
	public Oefening2(){
		super("Oefening2");
		initComponents();
		LayoutComponents();
		initListeners();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setLocation(200,200);
		setVisible(true);
	}
	private void initComponents() {
		lblproduct=new JLabel("Product");
		lblCount=new JLabel("Count");
		lblPrice=new JLabel("Price");
		lblTotal=new JLabel("Total");
		lblProducts=new JLabel[PRODUCTNAMES.length];
		for(int i=0;i<PRODUCTNAMES.length;i++){
			lblProducts[i]=new JLabel(PRODUCTNAMES[i]);
		}
		
		txtCounts=new JTextField[PRODUCTNAMES.length];
		for(int i=0;i<PRODUCTNAMES.length;i++){
			txtCounts[i]=new JTextField();
		}
		
		lblprices=new JLabel[PRICES.length];
		for(int i=0;i<PRICES.length;i++){
			lblprices[i]=new JLabel(""+PRICES[i]);
		}
		
		lblTotals=new JLabel[PRODUCTNAMES.length];
		for(int i=0;i<PRODUCTNAMES.length;i++){
			lblTotals[i]=new JLabel("0");
		}
		
	}
	private void LayoutComponents() {
		setLayout(new GridLayout(PRODUCTNAMES.length+1, 4));
		add(lblproduct);
		add(lblCount);
		add(lblPrice);
		add(lblTotal);
		for(int i=0;i<PRODUCTNAMES.length;i++){
			add(lblProducts[i]);
			add(txtCounts[i]);
			add(lblprices[i]);
			add(lblTotals[i]);
		}
		
		
	}
	private void initListeners(){
		for(int i =0;i<PRODUCTNAMES.length;i++){
			txtCounts[i].addFocusListener(new FocusListener() {
				
				@Override
				public void focusLost(FocusEvent e) {
					// TODO Auto-generated method stub
					System.out.println("lost");
					
				}
				
				@Override
				public void focusGained(FocusEvent e) {
					// TODO Auto-generated method stub
					System.out.println("gained");
				}
			});
			txtCounts[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					for(int i=0;i<PRODUCTNAMES.length;i++){
						try {
							
					double value = Double.parseDouble(txtCounts[i].getText());
					double prijs = Double.parseDouble(lblprices[i].getText());
					lblTotals[i].setText(""+(value*prijs));
						
						
					} catch (NumberFormatException e2) {
						// TODO: handle exception
						lblTotals[i].setText("0");
						txtCounts[i].setText("0");
					}
						
					
					}
					
					
				}
			});
		}
	}
}
