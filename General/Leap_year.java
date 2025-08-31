package General;

public class Leap_year
{
	public static void main(String[] args) 
	{
		int year=2023;
		if(year%400==0 || year%4==0 & year%100!=0)
		{
			System.out.println("Given year is leap year");
		}
		
		else
		{
			System.out.println("Given year is not leap year");
		}
	}

}
