import java.util.Scanner;
class abc
{
	public static void main(String args[])
	{
		int no=0;
	Scanner ab=new Scanner(System.in);
	System.out.println("enter your no");
	int a=ab.nextInt();
	
	for(int i=2;i<=a-1;i++)
	{
	if(a%i==0)
	{
		no++;
	}
	}
	if(no!=0)
	{
				System.out.println("no is not prime");
	}
	else
				System.out.println("no is prime");

	
	
	}
}