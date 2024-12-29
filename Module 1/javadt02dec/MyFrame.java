package javadt02dec;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame 
{
	JFrame frame;
	JButton btn;
	
	public MyFrame()
	{
		frame = new JFrame();
		btn = new JButton("Submit");
		btn.setBounds(50,100,200,100);
		frame.add(btn);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	public static void main(String[] args)
	{
		new MyFrame();
		
	}

}
