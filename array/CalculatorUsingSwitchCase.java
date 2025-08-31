package array;

public class CalculatorUsingSwitchCase 
{

	public static void main(String[] args) 
	{
		int num1=10;
		int num2=20;
		int result;
		String sym="*";
		
		switch(sym)
		{
		  case "+":result=num1+num2;
			       System.out.println("addition is: "+result);
		           break;
		  
		  case "-":result=num1-num2;
	               System.out.println("substraction is: "+result);
                   break;
          
		  case "*":result=num1*num2;
	               System.out.println("multiplication is: "+result);
                   break;
          
		  case "/":result=num1/num2;
	               System.out.println("division is: "+result);
                   break;
                   
           default:System.out.println("invalid input");
           break;
		  
		  
		}
	}

}
