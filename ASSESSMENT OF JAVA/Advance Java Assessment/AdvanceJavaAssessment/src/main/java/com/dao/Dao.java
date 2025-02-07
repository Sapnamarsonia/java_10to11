package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.model.Model;

public class Dao 
{
	// database conection
	public static Connection getconnect() 
	{
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assessment", "root", "");
			//System.out.println("success");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}

		return con;
	}

// insertdata method
	public static int insertdata(Model m) 
	{
		int status = 0;

		Connection con = Dao.getconnect();
		// Insert query
		String Sql = "INSERT INTO products (pname, pcategory, pmodel, myprice, pdescription,pimage) VALUES (?,?, ?, ?, ?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(Sql);
			ps.setString(1, m.getPname());
			ps.setString(2, m.getPcategory());
			ps.setString(3, m.getPmodel());
			ps.setString(4, m.getMyprice());
			ps.setString(5, m.getPdescription());
			ps.setString(6, m.getPimage());
			

			status = ps.executeUpdate();
			//System.out.println("Status => " + status);
			//System.out.println(ps);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;

	}
//viewdata method
	
	 public static List <Model> viewdata() 
	 {
		 	  ArrayList<Model> arrayList = new ArrayList<>(); 
		 	  Connection con = Dao.getconnect();
			  
			  String sql = "SELECT * FROM products";
			  
			  try 
			  { PreparedStatement ps = con.prepareStatement(sql); 
			  ResultSet set = ps.executeQuery();
			  
			  while (set.next()) 
			  {
				  int id = set.getInt(1);
				    String pname = set.getString(2);
				    String pcategory = set.getString(3);
				    String pmodel = set.getString(4);
				    String myprice = set.getString(5);
				    String pdescription = set.getString(6);
				    byte[] imgData = set.getBytes(7);
				    
				
//				byte[] getImage = Base64.getDecoder().decode(imgData);
			  
			  Model m = new Model(); 
			  m.setId(id);
			  m.setPname(pname);
			  m.setPcategory(pcategory);
			  m.setPmodel(pmodel);
			  m.setMyprice(myprice);
			  m.setPdescription(pdescription);
			  m.setPimage(Base64.getEncoder().encodeToString(imgData));
			  
			  arrayList.add(m);
			  
			  } 
			  } 
			  catch (Exception e) 
			  {  
				  e.printStackTrace(); 
			  } 
			  return arrayList;
			  
			  }
	// selectdata method 
	 public static Model selectdata(int id)
		{
			Model m = new Model();
			
			Connection con = Dao.getconnect();
			
			String sql = "select * from products where id=?";
			try 
			{
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, id);
				ResultSet set = ps.executeQuery();
				
				if(set.next())
				{
					int id1 = set.getInt(1);
					String pname = set.getString(2);
					String pcategory = set.getString(3);
					String pmodel = set.getString(4);
					String myprice = set.getString(5);
					String pdescription = set.getString(6);
					String pimage = set.getString(7);
					
					m.setId(id1);
					m.setPname(pname);
					m.setPcategory(pcategory);
					m.setPmodel(pmodel);
					m.setMyprice(myprice);
					m.setPdescription(pdescription);
					m.setPimage(pimage);
				}
				
				
				
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return m;
		}
	 
	 //updatedata method
	 public static int updatedata(Model m)
		{
			int status = 0;
			Connection con = Dao.getconnect();
			
			
			try 
			{
				PreparedStatement ps = con.prepareStatement("update products set pname=?,pcategory=?,pmodel=?,myprice=?,pdescription=?,pimage=? where id=?");
				ps.setString(1,m.getPname());
				ps.setString(2,m.getPcategory());
				ps.setString(3,m.getPmodel());
				ps.setString(4,m.getMyprice());
				ps.setString(5, m.getPdescription());
				ps.setString(6, m.getPimage());
				ps.setInt(7,m.getId());
			
				status = ps.executeUpdate();
			} 
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return status;
		}
		
	 //deletedata method 
	 public static int deletedata(int id)
		{
			int status = 0;
			
			Connection con = Dao.getconnect();
			String sql ="delete from products where id =?";
			
			try 
			{
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1,id);
				
				status = ps.executeUpdate();
	
			}
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return status;
		}
}
