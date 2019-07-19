package H17.src.be.pxl.h17.oef5.copy;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DatumPaneel extends JPanel{
	private JLabel lblOpschrift;
	private JTextField txtdag,txtmaand,txtjaar;
	
public DatumPaneel(){
	initComponents();
	layoutComponents();
}
private void layoutComponents() {
	setLayout(new GridLayout(1, 2));
	add(lblOpschrift);
	JPanel p =new JPanel();
	
	p.setLayout(new GridLayout(1, 3));
	p.add(txtdag);
	p.add(txtmaand);
	p.add(txtjaar);
	add(p);
	//JPanel datum = new JPanel(1,3));
}
private void initComponents() {
	lblOpschrift = new JLabel();
	txtdag = new JTextField(12);
	txtmaand = new JTextField(12);
	txtjaar = new JTextField(12);
}
public JTextField getTxtdag() {
	return txtdag;
}
public void setLabel(String string) {
	lblOpschrift.setText(string);
}
public JTextField getTxtmaand() {
	return txtmaand;
}
public void setDag(String inhoud){
	txtdag.setText(inhoud);
}
public void setMaand(String inhoud){
	txtmaand.setText(inhoud);
}
public void setjaar(String inhoud){
	txtjaar.setText(inhoud);
}
}
