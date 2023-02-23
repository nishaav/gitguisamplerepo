package demox;

import java.util.Scanner;

public class Excep3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two numbers for getting the division : ");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int result=num1/num2;
			System.out.println("The output of division is "+(result));
		}
		catch(ArrayIndexOutOfBoundsException e)//specialized
		{
			System.out.println("Array Index Issue.Please check");
		}
		catch(NullPointerException e)
		{
			System.out.println("No value provided.Please initialize");
		}
		catch(NumberFormatException | ArithmeticException | StringIndexOutOfBoundsException e)
		{
			System.out.println("Number not valid");
		}
		catch(Exception e)//generalized catch
		{
			System.out.println("The second number must not be zero (0)");
			//e.printStackTrace();
		}
		finally
		{
			System.out.println("End Of Program!!");
		}
	}

}
