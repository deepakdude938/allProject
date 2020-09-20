import java.util.Scanner;
class palindrome
{
	public static void main(String[]args)
{
	Scanner ab=new Scanner(System.in);
	System.out.println("enter your no");
	int a=ab.nextInt();
	int rem,rev=0;
	int b=a;
	
	for(int i=1;i<=3;i++)
	{
	rem=a%10;
	rev=rev*10+rem;
	a=a/10;
	}
	if(b==rev)
	{
		System.out.println("no is palindrome");
		}
	else
	{
	System.out.println("no is not palindrome");	
	}
	}
}