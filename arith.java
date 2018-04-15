import java.util.*;
import java.awt.*;
import java.awt.event.*;

class arith extends Frame implements ItemListener
{
	TextField t1,t2,t3;
	Label l1,l2,l3,l4;
	Choice c;
	arith()
	{
		setTitle("Arithmatic Operations");
		setVisible(true);
		setSize(600,600);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		l1 = new Label("Enter 1st no : ");
		gbc.gridx = 0;
        gbc.gridy = 0;
        add(l1,gbc);
		t1 = new TextField(10);
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(t1,gbc);
		
		l2 = new Label("Enter 2nd no : ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(l2,gbc);
		t2 = new TextField(10);
		gbc.gridx = 1;
		gbc.gridy = 1;
		add(t2,gbc);
		
		l3 = new Label("Result : ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(l3,gbc);
		t3 = new TextField(10);
		gbc.gridx = 1;
		gbc.gridy = 2;
		t3.setEditable(false);
		add(t3,gbc);
		
		c = new Choice();
		c.add("Select Operation");
		c.add("+");
		c.add("-");
		c.add("*");
		c.add("/");
		gbc.gridx = 2;
		gbc.gridy = 2;
		c.addItemListener(this);
		add(c,gbc);
		
		l4 = new Label("0");
		gbc.gridx = 1;
		gbc.gridy = 3;
		add(l4,gbc);
	}
	
	public void itemStateChanged(ItemEvent IE)
	{
		int a = Integer.valueOf(t1.getText());
		int b = Integer.valueOf(t2.getText());
		int result;
		
		if(c.getSelectedIndex() == 1)
		{
			result = a + b;	
			t3.setText(String.valueOf(result));
			l4.setText(String.valueOf(result));
		}
		
		if(c.getSelectedIndex() == 2)
		{
			result = a - b;
			t3.setText(String.valueOf(result));
			l4.setText(String.valueOf(result));
		}
		
		if(c.getSelectedIndex() == 3)
		{
			result = a * b;
			t3.setText(String.valueOf(result));
			l4.setText(String.valueOf(result));
		}

		if(c.getSelectedIndex() == 4)
		{
			result = a / b;
			t3.setText(String.valueOf(result));
			l4.setText(String.valueOf(result));
		}
	}
	
	public static void main(String args[])
	{
		arith a = new arith();
	}
}
