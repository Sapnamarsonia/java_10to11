package javadt04dec;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class classtask 
{
	JFrame frame;
	JButton btn;
	JTextField txt;
	JTextField txt1;
	
	public classtask()
	{
		frame = new JFrame();
		
		btn = new JButton("Submit");
		btn.setBounds(170,350,100,50);
		frame.add(btn);
		
		
		txt = new JTextField();
		txt.setBounds(100,100,250, 70);
		frame.add(txt);
		
		txt1 = new JTextField();
		txt1.setBounds(100,200,250, 70);
		frame.add(txt1);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
			String name = txt.getText();
			String surname = txt1.getText();
			try
			{
				FileOutputStream fout= new FileOutputStream("D://sapna.txt");
				fout.write(name.getBytes());
				fout.write(surname.getBytes());
			}catch (Exception d) {
				//System.out.println(d);
			}
					
			
			}
		});

		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	public static void main(String[] args)
	{
		new classtask();
		
	}

}
