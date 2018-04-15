import java.util.*;
import java.awt.*;
import java.awt.event.*;
class stationary extends Frame implements ItemListener
{
	Label l;
	Choice c;
	stationary()
	{
		setTitle("Stationary Items");
		setVisible(true);
		setSize(800,800);
		setLayout(new FlowLayout());
		l = new Label("Price : ");
		c = new Choice();
		c.add("Select Item");
		c.add("Ruler");
		c.add("Pencil");
		c.add("Pen");
		c.add("Eraser");
		c.add("NoteBook");
		c.addItemListener(this);	
		add(c);	
		add(l);
	}
	public void itemStateChanged(ItemEvent IE)
	{
		if(c.getSelectedIndex() == 1)
			l.setText("Price is : 10");
		if(c.getSelectedIndex() == 2)
			l.setText("Price is : 12");
		if(c.getSelectedIndex() == 3)
			l.setText("Price is : 20");
		if(c.getSelectedIndex() == 4)
			l.setText("Price is : 5");
		if(c.getSelectedIndex() == 5)
			l.setText("Price is : 32");
	}
	public static void main(String args[])
	{
		stationary s = new stationary();
	}
}