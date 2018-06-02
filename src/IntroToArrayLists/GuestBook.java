package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	JButton buttonA = new JButton("Add Name");
	JButton buttonB = new JButton("View Names");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	ArrayList<String> names = new ArrayList<String>();
	
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		
		 book.createGUI();
		 
//		 names.add("Bob Banders");
//		 names.add("Sandy Summers");
//		 names.add("Greg Ganders"); 
//		 names.add("Donny Doners"); 
	}

	 void createGUI() {
		buttonA.addActionListener(this);
		buttonB.addActionListener(this);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(buttonA);
		panel.add(buttonB);
		frame.setSize(500, 500);
		panel.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String userInput;
		if (e.getSource() == buttonA) {
		userInput = JOptionPane.showInputDialog("Enter A Name");
		names.add(userInput);
		}

		if (e.getSource() == buttonB) {
			
			System.out.println(names);
			
			// Guest #1: Bob Banders
			// Guest #2: Sandy Summers
			// Guest #3: Greg Ganders
			// Guest #4: Donny Doners
		}
	}
}
