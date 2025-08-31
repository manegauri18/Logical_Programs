package General;
//adde by BR_1
//   *
//  * *
// * * *
//* * * * 
// * * *
//  * *
//   *
public class Dimond_pattern1 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=4; i++)   //for row
		{
			for(int k=3; k>=i; k--)
			{
				System.out.print(" ");   //for printing space
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");   //for column
			}
			System.out.println();
		}
		
		//reverse pyramid logic
		for(int i=1; i<=4; i++)
		{
			for(int k=1; k<=i; k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=4-i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
