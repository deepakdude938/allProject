import java.util.Scanner;
class small

{
	public static void main(String []args)
	
	{
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter 1 no");
	int a=ab.nextInt();
	System.out.println("Enter 2 no ");
	int b=ab.nextInt();
	
	if(a>b)
		{
		System.out.println("Between "+a + "and "+b + " greater no is "+a);
		}
		else
		{
		System.out.println("Between "+a +" and "+b + " greater no is "+b);
		}
	}

}