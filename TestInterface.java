package mahe.icas.cs;

import java.awt.*;
import java.awt.event.*;

public class TestInterface extends Frame implements WindowListener, ActionListener {
	TextField text = new TextField(20);
	Button b;
	private int numClicks = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface t1 = new TestInterface("New Window");
		t1.setSize(400,200);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		t1.setLocation(dim.width/2 - t1.getSize().width/2, dim.height/2- t1.getSize().height/2);
		t1.setVisible(true);
	}
	
	public TestInterface(String title) {
		super(title);
		setLayout(new FlowLayout());
		addWindowListener(this);
		b = new Button ("Click me");
		add(b);
		add(text);
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		numClicks++;
		text.setText("Button Clicked " + numClicks + " times");
	}
	
	public void windowClosing(WindowEvent e)
	{
		dispose();
		System.exit(0);
	}
	
	public void windowOpened(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}	
	public void windowDeactivated(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
}
