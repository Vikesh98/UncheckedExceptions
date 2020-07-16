
public class ExceptionHandling {
	public static void main(String[] args) {
	
	try
	{
		try 
		{
			try
			{
				int A[]=new int[12];
				System.out.println(A[12]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array index out of range");
			}
			int value=50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("A number cant be divided by zero");
		}
		String s1=null;
	}
	catch(NullPointerException e)
	{
		System.out.println("String value is null");
	}
	finally
	{
		System.out.println("These are all unchecked exceptions\nAnd i am finally block");
	}
		

	}

}
