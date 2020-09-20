class palindrome
{
	public static void main(String[]args)
{
	int a=121,rem,rev=0,b;
	
	for(int i=1;i<=a.length;i++)
	{
	rem=a%10;
	rev=rev*10+rem;
	}
	if(a==rev)
	{
		System.out.println("no is palindrome");
		}
	else
	{
	System.out.println("no is not palindrome");	
	}
	}
}