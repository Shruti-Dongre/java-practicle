import java.util.*;
import java.awt.*;
import java.awt.event.*;
class mouse extends Frame implements MouseListener,MouseMotionListener
{
	Label l1,l2;
	mouse()
	{
		setTitle("Mouse Listeners");
		setVisible(true);
		setSize(200,200);
		setLayout(new FlowLayout());
		l1 = new Label("MouseListener");
		l2 = new Label("MouseMotionListener");
		add(l1);
		add(l2);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent ME)
	{l1.setText("Mouse Clicked");}
	
	public void mouseExited(MouseEvent ME)
	{l1.setText("Mouse exit from component");}
	
	public void mouseEntered(MouseEvent ME)
	{l1.setText("Mouse entered in component");}
	
	public void mouseReleased(MouseEvent ME)
	{l1.setText("Mouse button is released");}
	
	public void mousePressed(MouseEvent ME)
	{l1.setText("Mouse button is pressed ");}
	
	public void mouseMoved(MouseEvent ME)
	{l2.setText("Mouse is moved");}
	
	public void mouseDragged(MouseEvent ME)
	{l2.setText("Mouse is Dragged");}
	
	public static void main(String args[])
	{
		mouse m = new mouse();
	}
}