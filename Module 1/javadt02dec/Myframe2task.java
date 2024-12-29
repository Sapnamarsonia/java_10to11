package javadt02dec;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Myframe2task 
{
	JFrame frame;
	JButton btn;
	JTextField txt;
	JLabel label;
	JPasswordField pass;
	
	public Myframe2task()
	{
		frame = new JFrame();
		frame.setSize(500,500);
		frame.setLayout(null);
		
		label = new JLabel("Label");
		label.setBounds(250,200,250,70);
		frame.add(label);
		
		txt = new JTextField("Add Text Here");
		txt.setBounds(150,250,250, 70);
		frame.add(txt);
		
		pass = new JPasswordField("Enter Password");
		pass.setBounds(150,350, 250, 70);
		frame.add(pass);
		
		btn = new JButton("Submit");
		btn.setBounds(200,450,100,50);
		frame.add(btn);

		
		frame.setVisible(true);
		
		
	}
	public static void main(String[] args)
	{
		new Myframe2task();
		
	}

}
