// electricity bill consumption

import java.util.*;

class Bill
{
	public static void main(String args[])
	{
		int numberOfDays;
		float electicityRate;
		float numberOfUnits;
		double bill=0.0d;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of days of the month");
		numberOfDays=sc.nextInt();
		System.out.println("Enter rate of single unit of electricity");
		electicityRate=sc.nextFloat();
		System.out.println("Enter number of units consumed");
		numberOfUnits=sc.nextFloat();
		bill=numberOfDays*(electicityRate*numberOfUnits);
		System.out.println(bill + " Rs" );

		
	}
}

/*output
Enter number of days of the month
31
Enter rate of single unit of electricity
4.5
Enter number of units consumed
89
12415.5 Rs
*/