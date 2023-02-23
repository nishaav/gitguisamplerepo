package demox;

public class Excep5 {
	static String str;
	public static void main(String[] args) {
		
		try
		{
			System.out.println("Start of Program!!");
			try
			{
				int a=10/0;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			try
			{
				int size=str.length();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			try
			{
				int ar[]=new int[5];
				ar[5]=10;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("End of Program!!");

			str="Java";
			System.out.println(str.charAt(4));
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
