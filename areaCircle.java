import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class areaCircle extends Applet implements ActionListener
{
	//<APPLET CODE="areaCircle.class" WIDTH="500" HEIGHT="500" ></APPLET>
	TextField input, ans;
	Label l1, l2;
	Button button;
	
	public void init()
	{
		l1 = new Label("enter radius of circle : ");
		l2 = new Label("area of circle ");
		input = new TextField(10);
		ans = new TextField(10);
		button = new Button("area");
		add(l1);
		add(input);
		add(button);
		add(l2);
		add(ans);		
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int num = Integer.parseInt(input.getText());
		float area = 2*3.14f*(float)num;
		ans.setText("" +area);
	}
}
