import java.util.Scanner;
class factorial

{
	public static void main(String []args)
	
	{
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter no");
	int a=ab.nextInt();
	int fact=1;

	
		for(int i=a;i>=1;i--)
		{
		
		fact=fact*i;
		
		}
		System.out.println("Factorial of "+a+" is "+fact);
		
	}

}