package mahe.icas.cs;

import javax.swing.*;
public class HelloGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Hello GUI");
		//JFRame is a window element which we can mini and maximize
		
		JLabel label = new JLabel("Hello Label", JLabel.CENTER);
		frame.add(label);
		frame.setSize(300,300);
		frame.setVisible(true);	
	}

}
