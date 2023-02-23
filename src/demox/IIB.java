package demox;

public class IIB {

	
	/*
	 * Object has 3 characteristics 
	 * 1)state : data for member variables
	 * 2)behavior : methods
	 * 3)identity : unique id of the object : hashcode
	 * 
	 * components of hashcode
	 * packagename.classname@referenceid
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dummy();
		
		{
			System.out.println("STatic of Main 1");
		}	
	}
	static
	{
		System.out.println("STatic of Main ");
	}

}
//static >IIB>constructor
class Dummy
{
	static//static block
	{
		System.out.println("I am a static block");
	}
	{
		System.out.println("I am a IIB2");
	}
	Dummy()
	{
		System.out.println("I am a constructor");
	}
	{
		System.out.println("I am a IIB1");
	}
	{
		System.out.println("I am a IIB3");
	}
	void show()
	{
		System.out.println("I am a method");
	}
	
}