package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file= new FileInputStream("D:\\JAVA\\test.txt\\");
		BufferedReader br=new BufferedReader(new InputStreamReader(file));
		String line;
		while((line=br.readLine()) !=null) {
			System.out.println(line);
			
		}
		
		

	}

}
