/*Create a simple Swing GUI with input fields for id, fname, lname, and email. 
o Implement CRUD operations (Insert, Update, Select, Delete) using JDBC and MySQL. 
o On button clicks, the program should interact with the database and perform the 
appropriate operation (insert, update, display records, or delete records).*/

package DatabaseAssignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ques9 implements ActionListener 
{
	// 
	JFrame frame,updateframe;
	JLabel l1,l2,l3,l4,l5;
	JTextField id,fname,lname,email,mobile;
	JButton  btn1 , btn2 , btn3, btn4;
	int id2=0;

	//creating constructor
	Ques9()
	{
		frame = new JFrame();
		
		// taking label and setting its bounds 
		l1 = new JLabel("ID");
		l1.setBounds(50, 22, 100, 14);
		
		l2 = new JLabel("First Name");
		l2.setBounds(50, 52, 100, 14);
		
		l3 = new JLabel("Last Name");
		l3.setBounds(50, 82, 100, 14);
		
		l4 = new JLabel("Email:");
		l4.setBounds(50, 112, 100, 14);
		
		l5 = new JLabel("Mobile No:");
		l5.setBounds(50, 142, 100, 14);
		
		id = new JTextField(20);
		id.setBounds(190, 22, 150, 20);
		
		// taking textfields 
		fname = new JTextField(50);
		fname.setBounds(190, 52, 150, 20);
		
		lname = new JTextField(50);
		lname.setBounds(190, 82, 150, 20);
		
		email = new JTextField(50);
		email.setBounds(190, 112, 150, 20);
		
		mobile =new JTextField(20);
		mobile.setBounds(190, 142, 150, 20);
		
		btn1 = new JButton("Insert");
		btn1.setBounds(50, 192, 120, 20);
		
		btn2 = new JButton("Update");
		btn2.setBounds(50, 222, 120, 20);

		btn3 = new JButton("Search");
		btn3.setBounds(210, 192, 120, 20);

		btn4 = new JButton("Delete");
		btn4.setBounds(210,222 , 120, 20);
		
		// set button click events
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);

		// adding all the things to frame
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(id);
		frame.add(fname);
		frame.add(lname);
		frame.add(email);
		frame.add(mobile);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		
		// setting frame size layout and visiblility
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

public static void main(String[] args)  // main method
	{
		new Ques9(); // calling constructor
	}
	public void actionPerformed(ActionEvent e) // button click events 
	{
		if(e.getSource()==btn1)
		{
			insertdata(); // insert method calling 
		}
		
		if(e.getSource()==btn2)
		{
			updatedata(); // update method calling
		}
		
		if(e.getSource()==btn3)
		{
			searchdata(); // search method calling 
		}
	
		if(e.getSource()==btn4)
		{
			deletedata(); // delete method calling
		}
	}

	public void insertdata()  // insert operation
	{
				// creating connection 
				String db = "Ques9";
				String host = "jdbc:mysql://localhost:3306/";
				String url = host + db;
				
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, "root", "root");	
					
					String Firstname = fname.getText().toString();
					String Lastname = lname.getText().toString();
					String Email = email.getText().toString();
					String Mobile = mobile.getText().toString();

					//sql query to insert data into database
					String sql = "insert into information (ID,Firstname,Lastname,Email,Mobile) values (null,'"+Firstname+"','"+Lastname+"','"+Email+"','"+Mobile+"')";

					Statement stmt = con.createStatement();
					int status = stmt.executeUpdate(sql);
					
					if(status>0)
					{
						System.out.println("Success");
			            JOptionPane.showMessageDialog(frame, "Student Inserted Successfully");

					}
					else
					{
						System.out.println("Fail");
					}
					
				} 
				catch (Exception e1) 
				{
					e1.printStackTrace();
				}
	}
	
	public void updatedata()  // update method operation
	{          
				String db = "Ques9";
				String host = "jdbc:mysql://localhost:3306/";
				String url = host + db;
				
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, "root", "root");	
					
					int id1 = Integer.parseInt(id.getText().toString());
					String Firstname = fname.getText().toString();
					String Lastname = lname.getText().toString();
					String Email = email.getText().toString();
					String Mobile = mobile.getText().toString();
			
					// sql query for update data 
					String sql = "update information set Firstname='"+Firstname+"',Lastname='"+Lastname+"',Email='"+Email+"',Mobile='"+Mobile+"' where id='"+id1+"'";

					Statement stmt = con.createStatement();
					int status = stmt.executeUpdate(sql);
					
					if(status>0)
					{
						System.out.println("Success");
		                JOptionPane.showMessageDialog(frame, "Details Updated Successfully");

					}
					else
					{
						System.out.println("Fail");
		                JOptionPane.showMessageDialog(frame, "ID not found.");

					}
						
					} catch ( Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
	}
		
	public void searchdata() // search data operation
	{
					String db = "Ques9";
					String host= "jdbc:mysql://localhost:3306/";
					String url = host+db;
					
					try 
					{
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection(url,"root","root");
						
						String query = "select * from information where ID " ;
						
						Statement stmt = con.createStatement();
						
						ResultSet rs = stmt.executeQuery(query);
						
						
						if (rs.next())
						{
							 fname.setText(rs.getString("Firstname"));
							 lname.setText(rs.getString("Lastname"));
							email.setText(rs.getString("Email"));
							mobile.setText(rs.getString("Mobile"));
						}
						else
						{
			                System.out.println("Details not found.");
			
						}
					}
					catch (Exception e) 
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
}
				

	public void deletedata()  // delete method operation 
	{
			String db = "Ques9";
			String host= "jdbc:mysql://localhost:3306/";
			String url = host+db;
			
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,"root","root");
				Statement stmt = con.createStatement();
				
				String ID = id.getText().toString();
				int id2 = Integer.parseInt(ID);
				// delete sql query 
				String query = "delete from information where ID ='"+id2+"'";
			
				int status = stmt.executeUpdate(query);
				
				if(status>0)
				{
					System.out.println("Data deleted successfully");
                    JOptionPane.showMessageDialog(frame,"Data deleted successfully");

				}
				else
				{
					System.out.println("Error");
	                JOptionPane.showMessageDialog(frame, "ID not found.");

				}
				
				
			}
			catch (Exception e2) 
			{
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
		}
	}

