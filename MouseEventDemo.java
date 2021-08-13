package mahe.icas.cs;

import java.awt.*;
import java.awt.event.*;
public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener {

	String msg = "";
	int mouseX = 0, mouseY = 0;
	
	public MouseEventDemo()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new MyWindowAdapter());
	}
	
	public void mouseDragged(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "*" + " mouse at " + mouseX + ", " + mouseY;
		repaint();
	}
	
	public void mouseMoved(MouseEvent e) {
		msg = "Moving mouse at " + e.getX() + " ," + e.getY();
	}
	
	public void mouseClicked(MouseEvent e) {
		msg = msg + " click received ";
		repaint();
	}
	
	@Override
	
	public void mousePressed(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "Mouse Button Down.";
		repaint();
	}
	public void mouseReleased(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "Mouse Button down.";
		repaint();		
	}
	public void mouseEntered(MouseEvent e) {
		mouseX = 100;
		mouseY = 100;
		msg = "Mouse Exited.";
		repaint();		
	}
	public void mouseExited(MouseEvent e) {
		mouseX = 100;
		mouseY = 100;
		msg = "Mouse Exited.";
		repaint();	
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, mouseX, mouseY);
	}
	
	public static void main(String[] args)
	{
		MouseEventDemo appwin = new MouseEventDemo();
		
		appwin.setSize(new Dimension(300,300));
		appwin.setTitle("MouseEventsDemo");
		appwin.setVisible(true);
	}
	
	class MyWindowAdapter extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			msg = "Window close button pressed.";
			System.exit(0);			
		}
	}
	
	
	
	
	
	
}
