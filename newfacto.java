import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class newfacto extends Applet implements ActionListener
{
	//<APPLET CODE="newfacto.class" WIDTH="500" HEIGHT="500" ></APPLET>
	Label l1, l2, l3;
	TextField input;
	Button button1, button2;
	public void init()
	{
		l1 = new Label("enter a number : ");
		l2 = new Label("the factorial is : ");
		l3 = new Label();
		input = new TextField(10);
		button1 = new Button("Find");
		button2 = new Button("Clear");
		setLayout(new GridLayout(3, 2));
		add(l1);
		add(input);
		add(l2);
		add(l3);
		add(button1);
		add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==button1)
		{	
			int num = Integer.parseInt(input.getText());
			int fact = 1;
			for(int i = 1; i <= num; i++)
				fact *= i;
			l3.setText("" +fact);
		}
		else
		{
			input.setText("");
			l3.setText("");
		}
	}
}
