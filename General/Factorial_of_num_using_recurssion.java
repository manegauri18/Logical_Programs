package General;

public class Factorial_of_num_using_recurssion 
{
	static int fact=1;
	public static void main(String[] args)
	{
		int num=5;
		Factorial_of_num_using_recurssion f1= new Factorial_of_num_using_recurssion();
		f1.calcFact(num);
		
		System.out.println("Factorial of number is: "+fact);	
	}
	
	public void calcFact(int num)
	{
		if(num>0)
		{
		  fact=fact*num;
		  calcFact(num-1);
		}
	}

}
