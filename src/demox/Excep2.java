package demox;

import java.util.Scanner;
public class Excep2 {

	public static void main(String[] args) {

		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two numbers for getting the division : ");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int result=num1/num2;
			System.out.println("The output of division is "+(result));
		}
//		catch(Exception e)
//		{
//			System.out.println("The second number must not be zero (0)");
//			//e.printStackTrace();
//		}
		finally
		{
			System.out.println("End Of Program!!");
		}
	}

}
