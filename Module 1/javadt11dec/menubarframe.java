package javadt11dec;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class menubarframe implements ActionListener
{
	JFrame frame;
	JMenuBar mb;
	JMenu file,edit,help;
	JMenuItem m1,m2,m3,m4,f1,f2,f3;
	JTextField txt;
	
	public menubarframe()
	{
		frame = new JFrame();
		
		mb = new JMenuBar();
		
		txt = new JTextField();
		
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		
		f1 = new JMenuItem("New");
		f2 = new JMenuItem("Save");
		f3 = new JMenuItem("Exit");
		
		file.add(f1);
		file.add(f2);
		file.add(f3);
		
		m1 = new JMenuItem("Cut");
		m2 = new JMenuItem("Copy");
		m3 = new JMenuItem("Paste");
		m4 = new JMenuItem("Selectall");
		
		edit.add(m1);
		edit.add(m2);
		edit.add(m3);
		edit.add(m4);
		
		
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		
		frame.add(txt);
		frame.setJMenuBar(mb);
		frame.setSize(500, 500);
		frame.setVisible(true);
		

		
	}
	public static void main(String[] args) 
	{
		new menubarframe();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()==m1)
		{
			txt.cut();
		}

		if(e.getSource()==m2)
		{
			txt.copy();
		}

		if(e.getSource()==m3)
		{
			txt.paste();
		}

		if(e.getSource()==m4)
		{
			txt.selectAll();
		}
		
	}
	

}
