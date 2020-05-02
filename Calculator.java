package MyTask;

import java.util.Scanner;

public class Calculator {

	int add(int x, int y)
	{
		return x+y;
		
	}
	int sub(int x, int y)
	{
		return x-y;
		
	}
	int multiply(int x, int y)
	{
		return x*y;
		
	}
	int divide(int x, int y)
	{
		return x/y;
		
	}
	
	public static void main(String[] args) {
		
		Calculator cal =new Calculator();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number 1");
		int a=sc.nextInt();
		System.out.println("Enter number 2");
		int b=sc.nextInt();
		int status=0;
		while(status==0)
		{
			System.out.println("Enter Options");
			System.out.println("1 for add two numbers");
			System.out.println("2 for subtract two numbers");
			System.out.println("3 for mutiply two numbers");
			System.out.println("4 for divide two numbers");
			System.out.println("5 for exit operations");
			int temp=sc.nextInt();
			int res=0;
			switch(temp)
			{
			case 1:
				
				res=cal.add(a,b);
			    	System.out.println("Addition of two number is : "+res);
			   	break;
			case 2:
				res=cal.sub(a,b);
			    	System.out.println("Subtraction of two number is : "+res);
			    	break;
		  	case 3:
				
				res=cal.multiply(a,b);
			    	System.out.println("Multiplication of two number is : "+res);
			    	break;
			case 4:
				res=cal.divide(a,b);
			    	System.out.println("Division of two number is : "+res);
			    	break;
			case 5:
				status=1;
				System.out.println("Thank You");
				break;
			    
			
			}
			
			
		}
		

	}

}

-----------------------------------------
Answers:-
Enter number 1
10
Enter number 2
5
Enter Options
1 for add two numbers
2 for subtract two numbers
3 for mutiply two numbers
4 for divide two numbers
5 for exit operations
1
Addition of two number is : 15
Enter Options
1 for add two numbers
2 for subtract two numbers
3 for mutiply two numbers
4 for divide two numbers
5 for exit operations
2
Subtraction of two number is : 5
Enter Options
1 for add two numbers
2 for subtract two numbers
3 for mutiply two numbers
4 for divide two numbers
5 for exit operations
3
Multiplication of two number is : 50
Enter Options
1 for add two numbers
2 for subtract two numbers
3 for mutiply two numbers
4 for divide two numbers
5 for exit operations
4
Division of two number is : 2
Enter Options
1 for add two numbers
2 for subtract two numbers
3 for mutiply two numbers
4 for divide two numbers
5 for exit operations
5
Thank You
