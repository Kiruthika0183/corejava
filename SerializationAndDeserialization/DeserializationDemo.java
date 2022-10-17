package SerializationAndDeserialization;

import java.io.IOException;

import java.io.FileInputStream;
import java.io.ObjectInputStream;



public class DeserializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Employee e=null;
		try
		{
		
		FileInputStream fileln=new FileInputStream("D:\\JAVA\\test.txt");
		ObjectInputStream in=new ObjectInputStream(fileln);
		e=(Employee)in.readObject();
		in.close();
		fileln.close();
		}
		catch(IOException i)
		{
			i.printStackTrace();
			return;
			
		}catch(ClassNotFoundException c)
		{
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee..");
		System.out.println("Name :" +e.name);
		System.out.println("Address :" +e.address);
		
				
		

	}

}
