// writing table of any number

import java.util.*;

class Table
{
	public static void main(String args[])
	{
		int number;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(number*i);	
		}
		
	}
}

/*output
Enter a number
5

5
10
15
20
25
30
35
40
45
50
*/