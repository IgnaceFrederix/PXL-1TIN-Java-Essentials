package H17.src.be.pxl.h17.oef5.copy;
import  java.time.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import be.pxl.h17.oef4.Leraar;
import be.pxl.h17.oef4.Oefening4;
import be.pxl.h17.oef4.Vak;

public class Oef5 extends JFrame{
private static Huwelijk h1;
private TekstPaneel vnpartner1,vnpartner2,anpartner1,anpartner2;
private DatumPaneel gebpartner1,gebpartner2,Huwelijk;
private JPanel pnlPartners;
private JButton bereken;
public Oef5(){
	super("Huwelijks-app");
	initComponents();
	LayoutComponents();
	initListeners();
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	setSize(500, 300);
	setLocation(200, 200);
}
private JTextArea txtresultaat;
private JPanel pnlBeneden;
private void LayoutComponents() {
setLayout(new BorderLayout());
pnlPartners.setLayout(new GridLayout(3, 2));
pnlPartners.add(vnpartner1);
pnlPartners.add(vnpartner2);
pnlPartners.add(anpartner1);
pnlPartners.add(anpartner2);
pnlPartners.add(gebpartner1);
pnlPartners.add(gebpartner2);
add(pnlPartners,BorderLayout.NORTH);

//in het midden,
txtresultaat = new JTextArea();
txtresultaat.setEditable(false);;
add(txtresultaat,BorderLayout.CENTER);
//beneden
pnlBeneden = new JPanel();
pnlBeneden.setLayout(new GridLayout(2, 1));
Huwelijk.setLayout(new FlowLayout());

pnlBeneden.add(Huwelijk);
bereken=new JButton("Bereken");
bereken.setSize(50, 50);
JPanel k = new JPanel();
k.setLayout(new FlowLayout());
k.add(bereken);
pnlBeneden.add(k);
add(pnlBeneden,BorderLayout.SOUTH);

}

private void initListeners() {
	bereken.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			vnpartner1.setInhoud(h1.getPartner1().getVoornaam());
			anpartner1.setInhoud(h1.getPartner1().getNaam());
			vnpartner2.setInhoud(h1.getPartner2().getVoornaam());
			anpartner2.setInhoud(h1.getPartner2().getNaam());
			gebpartner1.setDag(h1.getPartner1().datumweergeven().getDayOfMonth()+"");
			gebpartner1.setMaand(h1.getPartner1().datumweergeven().getMonthValue()+"");
			gebpartner1.setjaar(h1.getPartner1().datumweergeven().getYear()+"");
			
			gebpartner2.setDag(h1.getPartner2().datumweergeven().getDayOfMonth()+"");
			gebpartner2.setMaand(h1.getPartner2().datumweergeven().getMonthValue()+"");
			gebpartner2.setjaar(h1.getPartner2().datumweergeven().getYear()+"");
			
			Huwelijk.setMaand(h1.getDatum().getMonthValue()+"");
			Huwelijk.setDag(h1.getDatum().getDayOfMonth()+"");
			Huwelijk.setjaar(h1.getDatum().getYear()+"");
			
			txtresultaat.setText(h1.getEindtekst()+"");
			txtresultaat.setBackground(Color.getHSBColor(218,165,32));	
			
		}
	});
}

private void initComponents() {
	pnlPartners=new JPanel();
	gebpartner1=new DatumPaneel();
	gebpartner1.setLabel("Geboortedatum");
	gebpartner2=new DatumPaneel();
	gebpartner2.setLabel("Geboortedatum");
	anpartner1=new TekstPaneel();
	anpartner1.setLabel("Achternaam:");
	anpartner2=new TekstPaneel();
	anpartner2.setLabel("Achternaam");
	vnpartner1=new TekstPaneel();
	vnpartner1.setLabel("Voornaam:");
	vnpartner2=new TekstPaneel();
	vnpartner2.setLabel("Voornaam:");
	Huwelijk=new DatumPaneel();
	Huwelijk.setLabel("Huwelijk");
}
public static void main(String[] args){
	LocalDate ld = LocalDate.of(1997, 03, 11);
	Persoon p1 = new Persoon("Berkan", "Aktag", ld);
	LocalDate lp = LocalDate.of(1990,05,14);
	Persoon p2 = new Persoon("Gelukkige", "meisje", lp);
	h1 = new Huwelijk(p1, p2, 11,03 , 1969);

	h1.printFeest();
	new Oef5();
}
}
