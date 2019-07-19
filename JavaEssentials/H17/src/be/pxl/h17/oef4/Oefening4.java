package be.pxl.h17.oef4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

import h17.be.pxl.Layout;
public class Oefening4 extends JFrame{
private static Leraar l[] = new Leraar[2];
	private static final String[] codeTabel = {"vak","41TIN1100", "48TIN1130", "41TIN1140",
			"41TIN1160", "41TIN1240", "41TIN1290",
			"41TIN1300", "42TIN1220", "42TIN1230",
			"43AON3120", "43AON3130"};
	
	private static final String [] naamTabel = {"-Vakken-","Web Essentials", "Java Essentials",
			".Net Essentials", "SQL Essentials",
			"Desktop OS", "Math for IT", "Programming Basics",
			".Net Advanced", "Java Advanced", "Programming Expert",
			"Mobile development"};
	private static Vak [] vakken = new Vak[codeTabel.length];
	private static int [] stpTabel = {0,7, 6, 6, 3, 6, 6, 5, 3, 3, 3, 3};
	private String[] leraren;
public Oefening4(){
	super("Leraren - Vakken");
	initComponents();
	initListeners();
	LayoutComponents();
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	setSize(300, 300);
	setLocation(200, 200);
}

private void initListeners() {
	
	Leraren.addMouseListener(new MouseListener() {
	
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
	Leraren.addActionListener(new ActionListener() {
		DefaultListModel<String> s = new DefaultListModel<>();
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int teller = 0;
			if(Leraren.getSelectedIndex()==0 && Vakken.getSelectedIndex()==0){
				lijst.setListData(new String[0]);
				onder.setText("");
			}else if(Leraren.getSelectedIndex()!=0 && Vakken.getSelectedIndex()==0){
				lijst.setListData(new String[0]);
				s.clear();
				//lijst.setModel(new DefaultListModel<>());
				for(int i = 0;i<l.length;i++){
					if(l[i].getNaam().equals(Leraren.getSelectedItem().toString())){
						for(int j = 0;j<l[i].getAantVakken();j++){
							if(l[i].getVak(j)!=null && teller != l[i].getAantVakken()){
							s.addElement(l[i].getVak(j).getNaam()+" ("+l[i].getVak(j).getAantalSTP()+" stp)");
							lijst.setModel(s);
							teller++;
							}	
						}
						
						onder.setText("Aanstelling:"+l[i].getAanstellingsPerc()+"%");
					}
				}
			}
		}
	});
	Vakken.addActionListener(new ActionListener() {
		DefaultListModel<String> s = new DefaultListModel<>();
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(Leraren.getSelectedIndex()==0 && Vakken.getSelectedIndex()==0){
				lijst.setListData(new String[0]);
				onder.setText("");
			}else if(Vakken.getSelectedIndex()!=0&&Leraren.getSelectedIndex()==0){
				//lijst.setListData(new String[0]);
				s.clear();
				for(int i=0;i<l.length;i++){
					for(int j =0;j<l[i].getAantVakken();j++){
						
						if(Vakken.getSelectedItem() == l[i].getVak(j).getNaam()){
							
							s.addElement(l[i].getNaam()+","+l[i].getAantVakken()+" vakken");
							lijst.setModel(s);
							onder.setText("Code: "+l[i].getVak(j).getCode());
						}
					}
				}
				
			}
		}
	});
}
private JLabel onder = new JLabel("");
private void LayoutComponents() {
	JPanel hoofd = new JPanel();
	JPanel top = new JPanel();
	JPanel center = new JPanel();
	JPanel bottom = new JPanel();
	setLayout(new BorderLayout());
	hoofd.setLayout(new BorderLayout());
	top.setLayout(new GridLayout(1, 2));
	
	top.add(Leraren);
	top.add(Vakken);
	
	center.add(lijst);
	center.setLayout(new BorderLayout());
	lijst.setSize(350, 250);
	
	bottom.setLayout(new BorderLayout());
	bottom.add(onder);
	add(top,BorderLayout.NORTH);
	add(center,BorderLayout.CENTER);
	add(bottom,BorderLayout.SOUTH);
	
}
private JComboBox<String> Leraren;
private JComboBox<String> Vakken;
private JList<String> lijst;
private void initComponents() {
	Vakken = new JComboBox<String>(naamTabel);
	leraren=new String[l.length+1];
			leraren[0] = "-Leraren-";
	for(int i =1;i<l.length+1;i++){
			leraren[i]=l[i-1].getNaam();
	}
	Leraren=new JComboBox<>(leraren);
	lijst = new JList<>();
}
public static void main(String[] args){
	
	for(int i =0;i<vakken.length;i++){
		vakken[i] = new Vak(codeTabel[i],naamTabel[i],stpTabel[i]);
	}
	Leraar l1 = new Leraar("Berkan","Aktag",63);
	
	Leraar l2 = new Leraar("Hakan","Test",80);
	l[0] = l1;
	l[1] = l2;
	l2.voegVakToe(vakken[2]);
	l1.voegVakToe(vakken[2]);
	
	l1.voegVakToe(vakken[8]);
	l1.voegVakToe(vakken[10]);
	l1.voegVakToe(vakken[4]);
	
	new Oefening4();
}
}
