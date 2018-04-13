import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class awt_facto extends Applet implements ActionListener
{
	//<applet code="awt_facto.class" width="500" height="500" ></applet>
	TextField input, ans;
	Label l1, l2;
	Button button;
	
	public void init()
	{
		l1 = new Label("enter a number : ");
		l2 = new Label("result");
		input = new TextField(10);
		ans = new TextField(10);
		button = new Button("calculate factorial");
		add(l1);
		add(input);
		add(l2);
		add(ans);
		add(button);
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int num = Integer.parseInt(input.getText());
		int fact = 1;
		for(int i = 1; i <= num; i++)
			fact *= i;
		ans.setText("" +fact);
	}
}
