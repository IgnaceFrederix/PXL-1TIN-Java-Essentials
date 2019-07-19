package opdracht12extrales;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;


public class MyFrame extends JFrame {
    private GridPanel gridPanel;
    private JButton button;
/*    private int aantalRij;
    private int aantalKolom; */
    
    
    public MyFrame(int rij, int kolom){
        super("opdracht12");
 /*       aantalRij = rij;
        aantalKolom = kolom;
        initComponents();
        layoutComponets();
        initListeners();
        */
        initComponents(rij, kolom);
        layoutComponets();
        initListeners(rij, kolom);
        setVisible(true);
        
        
    }
    
    private void initComponents(int aantalRij, int aantalKolom){//aanmaken van componeten
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        gridPanel = new GridPanel(aantalRij, aantalKolom);
        button = new JButton("klik");
        
    }
    
    private void layoutComponets(){//toevoegen van de componeten
        //layout bepalen
        setLocation(20,20);
        setSize(300,200);
        setLayout(new BorderLayout());//bij JFrame boderlayout i s standaard overbodig
        add(gridPanel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
    }
    
    private void initListeners(int aantalRij, int aantalKolom){
    	button.addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent e){
        		
        		Random rand = new Random();
        		int i = rand.nextInt(aantalRij);
        		int j= rand.nextInt(aantalKolom);
        		gridPanel.getLabel(i, j).setText("geklikt");
        		/*
        		 * append en niet nextText omdat nexText de bestaande text wist en vervangt
        		 */
        	}
        });;
        /*
         * Wat indien je private JPanel topPanel
         * Had gemaakt zoals normaal.
         * ((TopPanel)topPanel).getButton(0);
         */
    }
    

    

}
