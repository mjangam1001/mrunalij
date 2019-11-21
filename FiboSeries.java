// Fibonacci Series

import java.util.*;

class FiboSeries
{
	public static void main(String args[])
	{
		int fib=0,number=0,number_1=1;
		for(int i=0;i<=10;i++)
		{
			System.out.println(fib);
			number=number_1;
			number_1=fib;
			fib=number+number_1;
			
		}
	}

}

/*output
0
1
1
2
3
5
8
13
21
34
55
*/