import java.util.Scanner;
class reverse

{
	public static void main(String []args)
	
	{
		int rem,rev=0;
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter no");
		int a=ab.nextInt();
		
		while(a!=0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		
		}
		System.out.println("Reverse of no is "+rev);
	}
}