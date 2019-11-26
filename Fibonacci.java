import java.util.*;

class Fibonacci
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n");
		n = sc.nextInt();
		printFibonancciSerices(n);
		
	}
	public static void printFibonancciSerices(int n)
	{
		int num1=0,num2=1,num3=1,num4=2;
		int num5=0;
		System.out.println("Fibonacci Series");
		System.out.println(num1 +"\n"+ num2 +"\n"+ num3 +"\n"+ num4);
		for(int i=4;i<n;i++)
		{
			num5=num1+num2+num3+num4;
			num1=num2;
			num2=num3;
			num3=num4;
			num4=num5;
			System.out.println(num5);
		}
		
	}
 
}