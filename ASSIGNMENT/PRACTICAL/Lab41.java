//o Implement a file copy program using FileInputStream and FileOutputStream. 

package CoreJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lab41
{
	public static void main(String[] args) {
		
	try {
        // to read the path of files
        File flpath1 = new File("input.txt");
        File flpath2 = new File("output.txt");
        
        try (// passing file path to streams
		FileInputStream input = new FileInputStream(flpath1);
				FileOutputStream output = new FileOutputStream(flpath2)) {
			int info = 0;
			// reading the given file1
			while( (info = input.read()) != -1) {
			   output.write(info); // writing to file2
			}
		}
        System.out.print("File1 copied to the given file!!");
     }
     catch(Exception exp) { // for handling exception
        System.out.println("There is an error finding file");
     }
  }
	
}

