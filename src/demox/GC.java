package demox;

public class GC {

	GC()
	{
		super();
	}
	public static void main(String[] args) 
	{
		
		System.out.println("Hello Developer!!");
		int num1=10;
		System.out.println("The value of variable is "+num1);
		System.gc();//calling the gc method for garbage collection
		System.out.println("End Of Program!!");

	}
	public void finalize()
	{
		System.out.println("Performing cleanup activity");
	}
}
