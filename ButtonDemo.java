package mahe.icas.cs;

import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Frame implements ActionListener {

	String msg = " ";
	Button yes, no, maybe;
	
	ButtonDemo()
	{
		setLayout(new FlowLayout());
		
		yes = new Button("Yes");
		no = new Button("No");
		maybe = new Button("Maybe");
		
		add(yes);
		add(no);
		add(maybe);
		
		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
		
		addWindowListener( new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		if(str.equals("Yes"))
		{
			msg = "You pressed Yes.";
		}
		else if(str.equals("No"))
		{
			msg = "You pressed No.";
		}
		else
		{
			msg = "You are not sure..";
		}
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg, 20, 100);
	}
	
	public static void main(String[] args) {
		ButtonDemo winApp = new ButtonDemo();
		
		winApp.setSize(new Dimension(800,600));
		winApp.setTitle("Button Demo");
		winApp.setVisible(true);
	}
	
}
