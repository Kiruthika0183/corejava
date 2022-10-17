package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputstreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputStream oStream;
		try {
			oStream = new FileOutputStream("D:\\JAVA\\test.txt\\");
		
		
		oStream.write(70);
		oStream.write(65);
		oStream.write(78);
		System.out.println("Sucessfully created and Written the file");
       }
       catch (IOException e) {
        System.out.println("Exception");
		
		
       }	
	}
}


