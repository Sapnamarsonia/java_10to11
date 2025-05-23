
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Base64;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/imageSave4")
@MultipartConfig(maxFileSize=16177216)
public class imageSave4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession ss = request.getSession(false);
		
		if(ss != null)
		{
		
		String usl = "jdbc:mysql://localhost:3306/project";
		String user = "root";
		String pass = "";
		
		/*
		 * Part p = request.getPart("p_image"); System.out.println(p);
		 */
		//Part p = request.getPart("p_image");
		String id = request.getParameter("id");
		int id2 = Integer.parseInt(id);
		String name = request.getParameter("p_name");
		String price = request.getParameter("p_price");
		String description = request.getParameter("p_des");
		String image = request.getParameter("p_image");
		String p_qua = request.getParameter("p_qua");
		String fp = request.getParameter("fp");
		String email = request.getParameter("email");
		
		String base64ImageData = image.split(",")[1];
		 byte[] imageData = Base64.getDecoder().decode(base64ImageData);
		 InputStream io = new ByteArrayInputStream(imageData);
		
		
		
		
		
		//InputStream io = request.getPart("p_image").getInputStream();
		//byte[] imageData = java.util.Base64.getDecoder().decode(base64Image.split(",")[1]);
		
		//int itid = ImageDao.getITid(nam);
		//System.out.println(p);
		//System.out.println(id2);
		//ImageModel m = ImageDao.getimageindexwise(id2);
		
		//System.out.println(m.getId());
		//System.out.println("get");
		//System.out.println(m.getP_image());
		
		
		int r = 0;
		Connection con = null;
	
		
			try {
				
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(usl, user, pass);
				
			PreparedStatement ps = con.prepareStatement("insert into cart(p_name,p_price,p_des,p_qua,email,fp,p_image) values(?,?,?,?,?,?,?)");
				
				//InputStream io = new ByteArrayInputStream(image.getBytes(StandardCharsets.UTF_8));

				//InputStream io = m.getP_image();
				
				ps.setString(1, name);
				ps.setString(2, price);				
				ps.setString(3, description);
				ps.setString(4,p_qua);
				ps.setString(5,email);
				ps.setString(6,fp);
				ps.setBlob(7, io);
				//ps.setString(5, email);
				
				r = ps.executeUpdate();
			
				if(r>0)
				{
					System.out.println("done");
					Thread.sleep(1000);
					
					
					 PreparedStatement ps2 =con.prepareStatement("delete from wishlist where id=?");
					 ps2.setInt(1,id2);
					  
					  int status = ps2.executeUpdate(); 
					  if(status>0) 
					  {
						  response.sendRedirect("cart.jsp");
					   }
					  else 
					  {
						  System.out.println("Error"); 
					  }
					 
					
				}
				else				{
				System.out.println("error");
				}
				
				
			
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		
		
		
		
	}

}