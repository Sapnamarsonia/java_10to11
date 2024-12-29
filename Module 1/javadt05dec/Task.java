package javadt05dec;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Task extends WindowAdapter implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JRadioButton rb1,rb2;
	JTextField name,mail,dob,mobile;
	JPasswordField pass,repass;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JComboBox<String>cb;
	String city[]= { "Rajkot","Surat","Baroda","Ahemdabad"};
	
	JMenuBar mb;
	JMenu file,edit,help;
	JMenuItem m1,m2,m3,m4,f1,f2,f3;
	
	JButton btn;
	
	Task()
	{
		frame = new JFrame();
		
		l1 = new JLabel("Name:");
		l1.setBounds(10, 22, 80, 14);
		
		l2 = new JLabel("Date Of Birth:");
		l2.setBounds(10, 52, 80, 14);
		
		l3 = new JLabel("Gender:");
		l3.setBounds(10, 82, 80, 14);
		
		l4 = new JLabel("Email:");
		l4.setBounds(10, 112, 80, 14);
		
		l5 = new JLabel("Mobile No:");
		l5.setBounds(10, 142, 80, 14);
		
		l6 = new JLabel("Password:");
		l6.setBounds(10, 172, 80, 14);
		
		l7 = new JLabel("Re password:");
		l7.setBounds(10, 202, 80, 14);
		
		l8 = new JLabel("City");
		l8.setBounds(10, 242, 80, 14);
		
		
		name = new JTextField();
		name.setBounds(160, 22, 120, 20);
		
		dob = new JTextField(10);
		dob.setBounds(160, 52, 120, 20);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(160, 82, 80, 20);
		rb2 = new JRadioButton("Female");
		rb2.setBounds(240, 82, 80, 20);

		mail = new JTextField();
		mail.setBounds(160, 112, 120, 20);
		
		mobile = new JTextField(15);
		mobile.setBounds(160, 142, 120, 20);
		
		pass =new JPasswordField();
		pass.setBounds(160, 172, 120, 20);
		
		repass =new JPasswordField();
		repass.setBounds(160, 202, 120, 20);
		
		cb = new JComboBox<>(city);
		cb.setBounds(160, 242, 120, 20);
		
		btn = new JButton("Submit");
		btn.setBounds(160, 282, 120, 20);
		
		ButtonGroup bg =new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		mb = new JMenuBar();
		
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
	
		frame.setJMenuBar(mb);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);
		frame.add(l8);
		frame.add(name);
		frame.add(dob);
		frame.add(rb1);
		frame.add(rb2);
		frame.add(mail);
		frame.add(mobile);
		frame.add(dob);
		frame.add(pass);
		frame.add(repass);
		frame.add(cb);
		frame.add(btn);
		
		//frame.getContentPane().setBackground(Color.PINK);
		
		frame.addWindowListener(this);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		 rb1.addActionListener(this);
		 rb2.addActionListener(this);
		
		
	};
		
	public static void main(String[] args)
	{
		new Task();
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==rb1)
		{
			JOptionPane.showMessageDialog(frame,"male clicked");

		}
		if(e.getSource()==rb2)
		{
			JOptionPane.showMessageDialog(frame,"female clicked");

		}
		
		
	}
	public void windowClosing(WindowEvent e)
	{
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		int a = JOptionPane.showConfirmDialog(frame,"Are you sure want to close ?");
		
		if (a== JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(a==JOptionPane.NO_OPTION)
		{
			System.out.println("press again");
		}
		
	}
	
}
