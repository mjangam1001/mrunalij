// program to print even odd 

import java.util.*;

class EvenOdd
{
	public static void main(String args[])
	{
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a Number");
		number=sc.nextInt();
		if(number%2==0)
			System.out.println(number + " is Even");
		else
			System.out.println(number + " is Odd");
	}
}

/*output
Enter a Number
5
5 is Odd


Enter a Number
2
*/
2 is Even