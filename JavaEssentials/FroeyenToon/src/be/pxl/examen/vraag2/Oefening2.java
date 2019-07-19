package be.pxl.examen.vraag2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Oefening2 extends JFrame implements ActionListener{
	private JPanel noord;
	private JLabel dit;
	
	private JPanel oost;
	private JCheckBox vet;
	private JButton belgie;
	private JButton duitsland;
	private JButton italie;
	private JButton nederland;
	private JButton exit;
	
	private JPanel center;
	private JLabel[][] vlag = new JLabel[3][3];
	
	public Oefening2(){
		//noorderPaneel
		super("Landen");
		noord = new JPanel(new GridLayout(1,1));
		dit = new JLabel("Dit is de vlag van : ");
		noord.add(dit);
		add(noord, BorderLayout.NORTH);
		
		//oostpaneel
		oost = new JPanel(new GridLayout(6,1));
		vet = new JCheckBox("Vet", false);
		vet.addActionListener(this);
		belgie = new JButton("België");
		belgie.addActionListener(this);
		duitsland = new JButton("Duitsland");
		duitsland.addActionListener(this);
		italie = new JButton("Italië");
		italie.addActionListener(this);
		nederland = new JButton("Nederland");
		nederland.addActionListener(this);
		exit = new JButton("Exit");
		exit.addActionListener(this);
		oost.add(vet);
		oost.add(belgie);
		oost.add(duitsland);
		oost.add(italie);
		oost.add(nederland);
		oost.add(exit);
		add(oost, BorderLayout.EAST);
		
		//centerpaneel
		center = new JPanel(new GridLayout(3,3));
		for(int i = 0; i < vlag.length; i++){
			for (int j = 0; j < vlag[i].length; j++){
				vlag[i][j] = new JLabel("");
				center.add(vlag[i][j]);
				vlag[i][j].setOpaque(true);
			}
			add(center, BorderLayout.CENTER);
			
			setSize(400, 300);
			setLocation(10,20);
			setVisible(true);
		}
		
	}
	
public static void main(String[] args) {
	Oefening2 test = new Oefening2();
}

@Override
public void actionPerformed(ActionEvent e) {
	if(vet.isSelected()){
		dit.setFont(new Font("default", Font.BOLD, 12));
	}else{
		dit.setFont(new Font("default", Font.PLAIN, 12));
	}
	if(e.getSource() == belgie){
		for(int i = 0; i < 3; i++){
	 
				vlag[i][0].setBackground(Color.BLACK);
				vlag[i][1].setBackground(Color.YELLOW);
				vlag[i][2].setBackground(Color.RED);
			}
			dit.setText("Dit is de vlag van: "+belgie.getText());
		
	}else if(e.getSource() == nederland){
		for(int i = 0; i < 3; i++){ 
				vlag[0][i].setBackground(Color.RED);
				vlag[1][i].setBackground(Color.WHITE);
				vlag[2][i].setBackground(Color.BLUE);
			}
			dit.setText("Dit is de vlag van: "+nederland.getText());
		}else if(e.getSource() == italie){
		for(int i = 0; i < 3; i++){ 
				vlag[i][0].setBackground(Color.GREEN);
				vlag[i][1].setBackground(Color.WHITE);
				vlag[i][2].setBackground(Color.RED);
			}
			dit.setText("Dit is de vlag van: "+italie.getText());
			
	
}else if(e.getSource() == duitsland){
	for(int i = 0; i < 3; i++){ 
		vlag[0][i].setBackground(Color.BLACK);
		vlag[1][i].setBackground(Color.RED);
		vlag[2][i].setBackground(Color.YELLOW);
	}
	dit.setText("Dit is de vlag van: "+duitsland.getText());
	
	
}
	if(e.getSource() == exit){
		System.exit(0);
	}
}
}
