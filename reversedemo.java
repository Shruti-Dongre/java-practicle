import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="reversedemo.class" height=500 width=500></applet>*/
public class reversedemo extends Applet implements ActionListener
{
	Label l1,l2;
	TextField input1, reverse;
	Button br;
	String rev=" ";
	public void init()
	{
		l1 = new Label("Enter a string : ");
		l2 = new Label("Result");
		input1=new TextField(20);
		reverse	= new TextField(20);
		br = new Button("REVERSE");
		add(l1);
		add(input1);
		add(l2);
		add(reverse);
		add(br);
		br.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String instr = input1.getText();
		for(int i = instr.length()-1; i>=0; i--)
		{	
			rev += instr.charAt(i);
		}
		reverse.setText(rev);
	}
}