import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

@WebServlet("/imagesave")
@MultipartConfig(maxFileSize = 16177216) // 16 MB limit for file upload
public class imagesave extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Database connection info
    private static final String DB_URL = "jdbc:mysql://localhost:3306/assessment";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    // File upload directory (static folder inside webapp)
    private static final String UPLOAD_DIR = "static" + File.separator + "image"; // Folder to save uploaded images

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Retrieve form data
        String pname = req.getParameter("pname");
        String pcategory = req.getParameter("pcategory");
        String pmodel = req.getParameter("pmodel");
        String myprice = req.getParameter("myprice");
        String pdescription = req.getParameter("pdescription");
        
        // Get the uploaded image file part
        Part filePart = req.getPart("pimage");
        String fileName = getFileName(filePart);
        
        // Create the upload directory if it does not exist
        String appPath = req.getServletContext().getRealPath("/"); // Get real path to the webapp
        String uploadPath = appPath + UPLOAD_DIR; // Full path to the images folder

        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdirs(); // Create the directory if it doesn't exist
        }

        // Path where the image will be saved
        String filePath = uploadPath + File.separator + fileName;

        // Save the image file to the specified path
        try (InputStream inputStream = filePart.getInputStream()) {
            Files.copy(inputStream, Path.of(filePath), StandardCopyOption.REPLACE_EXISTING);
        }
        System.out.println("Image will be saved to: " + filePath); // Prints the image file path

        // Save product data in the database, including the image filename
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Use newer MySQL driver class
            try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                // Prepare the SQL query to insert the product data
                String sql = "INSERT INTO products (pname, pcategory, pmodel, myprice, pdescription, pimage) VALUES (?, ?, ?, ?, ?, ?)";
                
                try (PreparedStatement ps = con.prepareStatement(sql)) {
                    ps.setString(1, pname);
                    ps.setString(2, pcategory);
                    ps.setString(3, pmodel);
                    ps.setString(4, myprice);
                    ps.setString(5, pdescription);
                    ps.setString(6, fileName); // Save only the filename in the database

                    int result = ps.executeUpdate();
                    if (result > 0) {
                        resp.sendRedirect("index.jsp"); // Redirect to the home page or another success page
                    } else {
                        resp.getWriter().println("Error while saving product.");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    resp.getWriter().println("Database error: " + e.getMessage());
                }
            } catch (SQLException e) {
                e.printStackTrace();
                resp.getWriter().println("Database connection error: " + e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            resp.getWriter().println("Database connection error: " + e.getMessage());
        }
    }

    // Utility method to get the file name from the Part header
    private String getFileName(Part part) {
        String contentDisposition = part.getHeader("content-disposition");
        for (String cd : contentDisposition.split(";")) {
            if (cd.trim().startsWith("filename")) {
                return cd.substring(cd.indexOf("=") + 2, cd.length() - 1).replace("\\", "/").substring(cd.lastIndexOf("/") + 1);
            }
        }
        return null;
    }
}
