
package SerializationAndDeserialization;
import java.io.*;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			Employee e=new Employee();
			e.name="kirthi";
			e.address="Sathy";
			FileOutputStream fileOut=new FileOutputStream("D:\\JAVA\\test.txt");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialize data is saved in D:\\JAVA\\test.txt");
			
					
		}

	}


