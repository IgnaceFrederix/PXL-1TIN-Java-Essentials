package H17.src.be.pxl.h17.oef5.copy;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TekstPaneel extends JPanel{
	private JLabel lblOpschrift;
	private JTextField txtInhoud;
	
	public TekstPaneel(){
	initComponents();
	LayoutComponents();
	}
	private void initComponents(){
			lblOpschrift=new JLabel();
			txtInhoud = new JTextField();
		}
	private void LayoutComponents(){
		setLayout(new GridLayout(1, 2));
		add(lblOpschrift);
		add(txtInhoud);
		
	}
	public void setLabel(String label){
		lblOpschrift.setText(label);
		
	}
	public String getInhoud(){
		return txtInhoud.getText();
	}
	public void setInhoud(String inhoud){
		txtInhoud.setText(inhoud);
	}

}
