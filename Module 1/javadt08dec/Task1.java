package javadt08dec;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Task1 implements ActionListener
{
	JFrame frame;                
	JCheckBox chk1,chk2,chk3;
	JLabel l1;
	JButton btn;
	
	Task1()
	{
		frame = new JFrame();
		
		
		l1 = new JLabel("FOOD BILLING SYSTEM");
		l1.setBounds(150, 50, 200, 50);
		
		chk1 = new JCheckBox("Pizza = 100rs");
		chk1.setBounds(130, 100, 200, 50);
		chk2 = new JCheckBox("Sandwich = 80rs ");
		chk2.setBounds(130, 150, 200, 50);
		chk3 = new JCheckBox("Burger = 50rs");
		chk3.setBounds(130, 210, 200, 50);

		btn = new JButton("Order");
		btn.setBounds(130, 350, 100, 50);
		btn.addActionListener(this);
		
		
		frame.add(l1);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btn);
		
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		 //chk1.addActionListener(this);
		 //chk2.addActionListener(this);
		 //chk3.addActionListener(this);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
		float amount =0;
		StringBuilder builder = new StringBuilder("\n selected items: ");
		if(chk1.isSelected())
		{
			//JOptionPane.showMessageDialog(frame,"pizza selected");
			builder.append("\n pizza @ Rs.100");
			amount += 100;
		}

		if(chk2.isSelected())
	     {
		   //JOptionPane.showMessageDialog(frame,"Sandwich selected");
			builder.append("\n sanwich @ Rs.80");
			amount += 80;

	     }
		if(chk3.isSelected())
	     {
		   //JOptionPane.showMessageDialog(frame,"Burger selected");
			builder.append("\n burger @ Rs.50");
			amount += 50;

	     }
		
		builder.append("\n Total amount = "+ amount);
		
	JOptionPane.showMessageDialog(frame,builder.toString());
}
	public static void main(String[] args) 
	{
		new Task1();
		
	}
}
