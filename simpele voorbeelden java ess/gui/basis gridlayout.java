H17 Oefening 2
package be.pxl.h17.oef3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SymbolenFrame extends JFrame {

	private final static char[] SYMBOLEN = { 'a', 'b', 'c', 'd', '+', '"' };
	private final static String VERDUBBEL = "verdubbel";
	private final static String WIS = "wis";
	private final static String HOOFDLETTERS = "hoofdletters";
	private final static String[] OPTIES = { VERDUBBEL, WIS, HOOFDLETTERS };
	private final static int AANTALRIJEN = 3;

	private JButton[] symboolButtons;
	private JButton okButton;
	private JComboBox<String> actieComboBox;
	private JTextField textField;

	public SymbolenFrame() {
		initComponents();
		layoutComponents();
		initListeners();
	}

	private void initComponents() {
		okButton = new JButton("ok");
		symboolButtons = new JButton[SYMBOLEN.length];
		for (int i = 0; i < symboolButtons.length; i++) {
			symboolButtons[i] = new JButton(String.valueOf(SYMBOLEN[i]));
			symboolButtons[i].setActionCommand(String.valueOf(SYMBOLEN[i]));
		}
		actieComboBox = new JComboBox<>(OPTIES);
		textField = new JTextField();
		textField.setEditable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(230, 150);
		setLocationByPlatform(true);
		setVisible(true);
	}

	private void layoutComponents() {
		JPanel buttonPanel = new JPanel(new GridLayout(AANTALRIJEN, 
									SYMBOLEN.length / AANTALRIJEN));
		for (int i = 0; i < symboolButtons.length; i++) {
			buttonPanel.add(symboolButtons[i]);
		}

		JPanel actiePanel = new JPanel(new GridLayout(2, 1));
		actiePanel.add(actieComboBox);
		actiePanel.add(okButton);

		add(textField, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.CENTER);
		add(actiePanel, BorderLayout.EAST);
	}

	private void initListeners() {
		for (JButton symboolButton : symboolButtons) {
			symboolButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					textField.setText(textField.getText() + event.getActionCommand());

				}

			});
		}

		okButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (actieComboBox.getSelectedItem().equals(VERDUBBEL)) {
					textField.setText(textField.getText() + textField.getText());
				} else if (actieComboBox.getSelectedItem().equals(WIS)) {
					textField.setText("");
				} else if (actieComboBox.getSelectedItem().equals(HOOFDLETTERS)) {
					textField.setText(textField.getText().toUpperCase());
				}
			}

		});

	}

	public static void main(String[] args) {
		new SymbolenFrame();
	}
}

