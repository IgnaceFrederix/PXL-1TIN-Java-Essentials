package voorbeeld2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MyFrame extends JFrame {
    private TopPanel topPanel;
    private JPanel bottomPanel;
    private JTextArea textArea;
    
    
    public MyFrame(){
        super("My Applycation");
        initComponents();
        layoutComponets();
        initListeners();
        setVisible(true);
        
    }
    
    private void initComponents(){//aanmaken van componeten
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        topPanel = new TopPanel();
        bottomPanel = new BottomPanel();
        textArea = new JTextArea();
        
    }
    
    private void layoutComponets(){//toevoegen van de componeten
        //layout bepalen
        setLocation(20,20);
        setSize(300,200);
        setLayout(new BorderLayout());//bij JFrame boderlayout i s standaard overbodig
        add(topPanel, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }
    
    private void initListeners(){
        topPanel.getButton(0).addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent e){
        		
        		textArea.append("klik - klik\n");
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
