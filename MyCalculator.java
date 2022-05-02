package ExceptionHandling;

public class MyCalculator
{
	static long power(int n,int p) throws Exception
	{
		if(n<0 || p<0)
			throw new Exception("n or p should not be negative:");
		if(n==0 || p==0)
			throw new Exception("n and p should not be zero:");
		return (long) Math.pow(n,p);
			
	}

	public static void main(String[] args) throws Exception
	{
		System.out.println(power(2,5));
		
	}

}
