package modelView;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HigherLowerFrame extends JFrame {
   private HigherLowerController controller;    // om link te hebben met de controller
   private JTextArea displayArea;
   private JTextField inputField;
   private JButton resetButton;
   
   public HigherLowerFrame(HigherLowerController controller) { // om link te maken met controller
      super("Higher - Lower");
      this.controller = controller;
      initComponents();
      layoutComponents();
      initListeners();
      setVisible(true);
   }

   public void setDisplayText(String text) { // methoden zodat de controller toegang heeft tot componenten
      displayArea.setText(text);
   }
   
   public String getDisplayText() {
      return displayArea.getText();
   }
   
   public String getInputText() {
      return inputField.getText();
   }
   
   public void setInputText(String text) {
      inputField.setText(text);
   }
   
   private void initComponents() {
      resetButton = new JButton("New Game");
      displayArea = new JTextArea();
      displayArea.setEditable(false);
      

      inputField = new JTextField();
    

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300, 200);
      setLocation(20, 20);
     
   }  
   private void layoutComponents(){
	   add(resetButton, BorderLayout.NORTH);
	   JScrollPane scrollPane = new JScrollPane(displayArea);      
       add(scrollPane, BorderLayout.CENTER);  
       add(inputField, BorderLayout.SOUTH);
   }
   private void initListeners(){ // controle wordt doorgegeven aan Controller => handelt de 
	   resetButton.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            controller.reset();
	         }
	      });   
	   inputField.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            controller.guess();
	         }
	      });
   }
}

