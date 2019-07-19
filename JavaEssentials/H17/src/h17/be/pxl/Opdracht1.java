package h17.be.pxl;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
public class Opdracht1 extends JFrame{
	private JLabel lbl;
	private JButton btn;
	private JTextField field;
	private JTextArea area;
	private JCheckBox box;
	private ButtonGroup checks;
	public Opdracht1(){
		super("My Application");
		initComponents();
		layoutComponents();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//pack();
		setSize(300,300);
		setLocation(200,200);
		//box.setSelected(true);
		
//		if(box.isSelected()){
//			add(lbl);
//		}
		setVisible(true);
		
	}
	private JList<String> lists;
	private JComboBox<String> boxes;
	private JRadioButton rbSmall;
	private JRadioButton rbMedium;
	private JScrollPane paneel;
	private void initComponents(){
//		checks = new ButtonGroup();
//		rbSmall=new JRadioButton("Small");
//		rbMedium=new JRadioButton("Medium");
//		checks.add(rbSmall);
//		checks.add(rbMedium);
//		rbSmall.setHorizontalAlignment(SwingConstants.LEFT);
		
		ImageIcon icon = new ImageIcon("download.jpg");
		ImageIcon icon2 = new ImageIcon("button2.png");
		
		
		lbl = new JLabel("OKOKOKOKOOK",SwingConstants.LEFT);
		lbl = new JLabel(icon);
//		lbl.setSize(10, 10);
//		box = new JCheckBox("ok");
		btn = new JButton(icon);
		
		btn.setToolTipText("dit is een button");
		btn.setPressedIcon(icon2);
		//		//field = new JTextField("Enter text here");
		area = new JTextArea(50,50);
		String[] choices = {"Bike","Car","Bus","Train"};
		lists = new JList<String>(choices);
		
		//alleen 1 waarde te kiezen
		lists.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lists.setSelectedIndex(2);
		
		boxes = new JComboBox<String>(choices);
		
		lbl.setPreferredSize(new Dimension(390, 580));
		paneel = new JScrollPane(lbl);
		
	}
	private void layoutComponents(){
		//add(lbl);
		
		//setLayout(new FlowLayout());
		add(paneel);
		//add(rbSmall);
		//add(rbMedium);
	}
}
