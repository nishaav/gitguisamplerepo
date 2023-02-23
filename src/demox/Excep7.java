package demox;

public class Excep7 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
try
{
	check(17);	
}
catch(Exception e)
{
	e.printStackTrace();	
}
	}

	static void check(int age) throws Excep//specified
	{
		if(age<18)
		{
			throw new Excep("Invalid age for voting");
		}
		else
		{
			System.out.println("Valid age for voting");
		}
	}
}

class Excep extends Exception
{
	Excep(String str)
	{
		super(str);
	}	
}