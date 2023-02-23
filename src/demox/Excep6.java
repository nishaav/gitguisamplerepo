package demox;

public class Excep6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Start of program!!");
			check(17);			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("End of program!!");
	}

	static void check(int age)
	{
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("Ineligible for voting");
		}
	}
}
/*
 *
 * throw keyword is used to raise an explicit exception
 * voting panel
 * 
 * constraint
 * 
 * voter age>=18 not eligible
 * below 18 not eligible
 * 
 * 
 * 
 * 
 */
