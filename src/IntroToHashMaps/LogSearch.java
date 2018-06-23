package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	JButton button1 = new JButton("Create");
	JButton button2 = new JButton("Search");
	JButton button3 = new JButton("List");
	JButton button4 = new JButton("Reset");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	HashMap<Integer, String> log = new HashMap<Integer, String>();

	void createGUI() {
		frame.add(panel);
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.setVisible(true);
		button1.setVisible(true);
		button2.setVisible(true);
		button3.setVisible(true);
		button4.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);

	}

	public static void main(String[] args) {
		LogSearch search = new LogSearch();
		search.createGUI();
		/*
		 * Crate a HashMap of Integers for the keys and Strings for the values.
		 */
		/*
		 * Create a GUI with three buttons. Button 1: Add Entry When this button is
		 * clicked, use an input dialog to ask the user to enter an ID number. After an
		 * ID is entered, use another input dialog to ask the user to enter a name. Add
		 * this information as a new entry to your HashMap.
		 * 
		 * Button 2: Search by ID When this button is clicked, use an input dialog to
		 * ask the user to enter an ID number. If that ID exists, display that name to
		 * the user. Otherwise, tell the user that that entry does not exist.
		 * 
		 * Button 3: View List When this button is clicked, display the entire list in a
		 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
		 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
		 * 
		 * When this is complete, add a fourth button to your window. Button 4: Remove
		 * Entry When this button is clicked, prompt the user to enter an ID using an
		 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
		 * the user that the ID is not in the list.
		 *
		 */
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String userInput;
		String userName;
		String userEntry;
		
		if (e.getSource() == button1) {
			userInput = JOptionPane.showInputDialog(null, "Enter a ID number");
			userName = JOptionPane.showInputDialog(null, "Enter a name");
			Integer.parseInt(userInput);
			log.put(Integer.parseInt(userInput), userName);
		}
		if (e.getSource() == button2) {
			userEntry = JOptionPane.showInputDialog(null, "Enter a ID number");
			int Entry = Integer.parseInt(userEntry);
			if (log.containsKey(Entry)) {
				System.out.println(log.get(Entry));
			} else { JOptionPane.showMessageDialog(null, "That entry does not exist");
			}
		}if(e.getSource() == button3) {
			System.out.println(log);
		}if(e.getSource() == button4) {
			log = new HashMap<Integer, String>();
		}
	}
}