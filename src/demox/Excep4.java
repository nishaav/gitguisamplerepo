package demox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excep4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			dummy();
		}
		catch(Exception e)
		{
			System.out.println("File does not exist");
		}
		System.out.println("End of program!!");
	}

	static void dummy() throws FileNotFoundException
	{
		FileInputStream fin5=new FileInputStream("f1.txt");
	}
}
