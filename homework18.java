import java.util.Scanner;
class homework18
{
	public static void main(String arg[])
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter your no");
		int a=ab.nextInt();
		int tem=a;
		int rem,count=0;
		while(tem!=0)
			{
				tem=tem/10;
				count++;
			}
			System.out.println(count);
		int index=count-1;
		int []x=new int[count];
		for(int i=1;i<=count;i++)
		{
			rem=a%10;
			x[index]=rem;
			
			a=a/10;
		}
		int add=0;
		for(int i=0;i<count;i++)
		{
			add=add+x[i];
		}
		//System.out.println(add);
	}
}
