package h17.be.pxl;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.net.NoRouteToHostException;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Layout extends JFrame{
	
	private JButton btn,btn2;
	private JTextField txtfield;
	private JTextArea txtarea;
	private JLabel lblproduct,lblCount,lblPrice,lblTotal;
	private static final String[] PRODUCTNAMES={"Apples","Oranges","Bananas"};
	private static final double[] PRICES={1.3,1.7,1.2};
	private JLabel[] lblProducts;
	private JTextField[] txtCounts;
	private JLabel[] lblprices;
	private JLabel[] lblTotals;
public Layout(){
	super("Mijn applicatie");
	initComponents();
	LayoutComponents();
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(600,400);
	setLocation(200,160);
	setVisible(true);
}
private JRadioButton rdbsmall;
private JRadioButton rdbmed;
private JRadioButton rdblarge;
private JButton btn3;
private JButton btn4;
private JButton btn5;
private JButton btn6;

private JLabel lblnaam;
private JTextField txtnaam;
private JLabel adres;
private JTextField txtadres;
private JButton btnOrder;
String[] keuzes = {"Bacon","Cheese","Egg","Mushrooms","Oregano","Chilli","Salami","Tomatoes","Shrimps","Onions","Garlic","Artichoke"};
private Icon icon = new ImageIcon("pizza2.jpg");
private JList<String> ingredient;
private JLabel lblbottom;
private JRadioButton rdbTraditional;
private JRadioButton rdbCrusty;
private ButtonGroup btngrp;
private JCheckBox chkspicy;
private String[] options = {"Small","Medium","Large"};
private JComboBox<String> grootte;
private JLabel lblnummer;
private JTextField txtnmr;
private JLabel label = new JLabel(icon);

private void initComponents(){
	//Opdracht 8
	
	ingredient = new JList<String>(keuzes);
	grootte = new JComboBox<String>(options);
	lblnaam = new JLabel("Name:");
	txtnaam = new JTextField(15);
	adres = new JLabel("Adress:");
	txtadres = new JTextField(15);
	btnOrder = new JButton("Order");
	lblbottom = new JLabel("bottom:");
	rdbTraditional = new JRadioButton("Traditional");
	rdbCrusty = new JRadioButton("Crusty");
	btngrp = new ButtonGroup();
	btngrp.add(rdbTraditional);
	btngrp.add(rdbCrusty);
	chkspicy = new JCheckBox("Spicy");
	txtnmr = new JTextField(3);
	
	btn = new JButton("send");
	btn2 = new JButton("recieve");
	txtfield = new JTextField(20);
	txtarea = new JTextArea();
	ButtonGroup grp = new ButtonGroup();
	rdbsmall = new JRadioButton("Small");
	rdbmed = new JRadioButton("Medium");
	rdblarge = new JRadioButton("Large");
	grp.add(rdbsmall);
	grp.add(rdbmed);
	grp.add(rdblarge);
	
	btn3=new JButton("Button3");
	btn4=new JButton("Button4");
	btn5=new JButton("Button5");
	btn6=new JButton("Button6");
	
	//OPDRACHT 7
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
	//Opdracht 8
	
	
	
}
public void LayoutComponents(){
	//opdracht 8
	JPanel topPanel = new JPanel();
	topPanel.setLayout(new FlowLayout());
	topPanel.add(lblnaam);
	topPanel.add(txtnaam);
	topPanel.add(adres);
	topPanel.add(txtadres);
	topPanel.add(btnOrder);
	
	
	JPanel centerPanel = new JPanel();
	label.setPreferredSize(new Dimension(500, 300));
	JScrollPane scroll = new JScrollPane(label);
	
	//centerPanel.setLayout(new FlowLayout());
	
	centerPanel.add(ingredient);
	centerPanel.add(scroll);
	
	JPanel bottomPanel = new JPanel();
	bottomPanel.setLayout(new FlowLayout());
	bottomPanel.add(lblbottom);
	bottomPanel.add(rdbTraditional);
	bottomPanel.add(rdbCrusty);
	bottomPanel.add(chkspicy);
	bottomPanel.add(new JLabel("size"));
	bottomPanel.add(grootte);
	bottomPanel.add(new JLabel("Number"));
	bottomPanel.add(txtnmr);
	
	add(topPanel,BorderLayout.NORTH);
	add(centerPanel,BorderLayout.CENTER);
	add(bottomPanel,BorderLayout.SOUTH);
	//opdracht 7
//	setLayout(new GridLayout(PRODUCTNAMES.length+1, 4));
//	add(lblproduct);
//	add(lblCount);
//	add(lblPrice);
//	add(lblTotal);
//	for(int i=0;i<PRODUCTNAMES.length;i++){
//		add(lblProducts[i]);
//		add(txtCounts[i]);
//		add(lblprices[i]);
//		add(lblTotals[i]);
//	}
	
	//setLayout(new BorderLayout());
//	add(btn,BorderLayout.SOUTH);
//	add(txtfield,BorderLayout.NORTH);
//	add(txtarea,BorderLayout.CENTER);
//	setLayout(new FlowLayout());
	
//	add(btn);
//	add(txtfield);
//	add(btn2);

	//add(txtfield);
	//add(txtarea);
	
//	add(rdblarge);
//	add(rdbmed);
//	add(rdbsmall);
	
//	setLayout(new GridLayout(3, 2));
//	add(btn);
//	add(btn2);
//	add(btn3);
//	add(btn4);
//	add(btn5);
//	add(btn6);
}
}
