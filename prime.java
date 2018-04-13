import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class prime extends Applet implements ActionListener
{
	//<applet code="prime.class" width="500" height="500" ></applet>
	TextField input;
	Label l1, l2;
	Button button;
	
	public void init()
	{
		l1 = new Label("enter a number : ");
		l2 = new Label();
		input = new TextField(10);
		button = new Button("calculate prime or not");
		add(l1);
		add(input);
		add(button);
		add(l2);		
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int num = Integer.parseInt(input.getText());
		int temp = num, flag = 0;
		for(int i = 2; i <= num/2; i++)
		{
			if(temp%i == 0)
			{
				flag = 1;
				l2.setText("not");
				break;
			}
			
		}
		if(flag == 0)
			l2.setText(" yess");
	}
}
