package be.pxl.h17.oef3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class BankApp extends JFrame{
	private static Bankrekening[] bank = new Bankrekening[3];
	private JLabel lblSaldoWaarde;
	private JLabel lblRenteWaarde;
	private JList<String> rekeningNummers;
	private JTextField txtBedrag;
	private JButton Storten = new JButton("Storten");
	private JButton Opnemen = new JButton("Opnemen");
	private JButton toonGegevens = new JButton("Toon Gegevens");
	public BankApp(){
		super("Bankrekening");
		initComponents();
		initListeners();
		layoutComponents();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(350,300);
		setLocation(100,100);
	}

	private void initListeners() {
	Storten.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int rekeningIndex = rekeningNummers.getSelectedIndex();
			System.out.println(Integer.parseInt(txtBedrag.getText()));
			bank[rekeningIndex].stort(Integer.parseInt(txtBedrag.getText()));
			lblSaldoWaarde.setText(""+bank[rekeningIndex].getSaldo());
			txtBedrag.setText("");
		}
	}); 
	Opnemen.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int rekeningIndex = rekeningNummers.getSelectedIndex();
			System.out.println(Integer.parseInt(txtBedrag.getText()));
			bank[rekeningIndex].neemOp((Integer.parseInt(txtBedrag.getText())));
			lblSaldoWaarde.setText(""+bank[rekeningIndex].getSaldo());
			txtBedrag.setText("");
			
		}
	});
	rekeningNummers.addListSelectionListener(new ListSelectionListener() {
		
		@Override
		public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub
			int rekeningIndex = rekeningNummers.getSelectedIndex();
			lblSaldoWaarde.setText(""+bank[rekeningIndex].getSaldo());
		}
	});
	txtBedrag.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int rekeningIndex = rekeningNummers.getSelectedIndex();
			System.out.println(Integer.parseInt(txtBedrag.getText()));
			bank[rekeningIndex].stort(Integer.parseInt(txtBedrag.getText()));
			lblSaldoWaarde.setText(""+bank[rekeningIndex].getSaldo());
			txtBedrag.setText("");
		}
	});
	toonGegevens.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int rekeningIndex = rekeningNummers.getSelectedIndex();
			JFrame parent = new JFrame();
			String geg = "Rekeningnummer: "+bank[rekeningIndex].getrekeningNummer()+"\nNaam: "+bank[rekeningIndex].getNaam();
			JOptionPane.showMessageDialog(parent,geg);
		}
	});
	
	
	
	
	
	}

	private void layoutComponents() {
	JPanel centerPanel = new JPanel();
	centerPanel.setLayout(new BorderLayout());
	
	
	JPanel a = new JPanel();
	a.add(new JLabel("Saldo: "));
	a.add(lblSaldoWaarde);
	a.add(new JLabel("Rente: "));
	a.add(lblRenteWaarde);
	a.setLayout(new FlowLayout());
	
	JPanel b = new JPanel();
	b.setLayout(new BorderLayout());
	//rekeningNummers.setSize(100, 1100);
	b.add(rekeningNummers);
	
	
	JPanel c = new JPanel();
	c.setLayout(new BorderLayout());
	c.add(new JLabel("Bedrag:"),BorderLayout.WEST);
	c.add(txtBedrag);
	//
	centerPanel.add(a,BorderLayout.NORTH);
	centerPanel.add(b, FlowLayout.CENTER);
	centerPanel.add(c, BorderLayout.SOUTH);
	
	JPanel southPanel = new JPanel();
	
	southPanel.add(Storten);
	southPanel.add(Opnemen);
	southPanel.add(toonGegevens);
	southPanel.setLayout(new FlowLayout());
	
	
	add(centerPanel,BorderLayout.CENTER);
	add(southPanel,BorderLayout.SOUTH);
	
	}

	private void initComponents() {
		String[] waarden = new String[3];
		rekeningNummers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for(int i =0;i<bank.length;i++){
			waarden[i]=bank[i].getrekeningNummer();	
		}
		rekeningNummers = new JList<String>(waarden);
		rekeningNummers.setSelectedIndex(0);
		lblSaldoWaarde = new JLabel(String.valueOf(bank[0].getSaldo()));
		lblRenteWaarde = new JLabel("0");
		txtBedrag = new JTextField();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Opdracht1();
		//new Oefening2();
		//new Layout();
		Bankrekening b = new Bankrekening("12154-884455555555", "Berkan", 500, 200);
		Bankrekening b2 = new Bankrekening("999-666666685", "Atakan", 300, 100);
		Bankrekening b3 = new Bankrekening("142544-15", "Hakan", 184, 100);
		bank[0]=b;
		bank[1]=b2;
		bank[2]=b3;
		new BankApp();
	}
}
