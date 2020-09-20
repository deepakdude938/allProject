import java.util.Scanner;
class homework15
{
	public static void main(String args[])
	{
		System.out.println("Enter your no");
		Scanner ab=new Scanner(System.in);
		int a=ab.nextInt();
		int temp=a;
		int count=0;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		
		int index=count-1;
		int x []=new int[count];
		int rem;
		
		for(int i=0;i<count;i++)
		{
			rem=a%10;
			x[index]=rem;
			index--;
		
			a=a/10;
		
		}
		for(int i=0;i<x.length;i++)
		{
				if(x[i]==1)
			{
				System.out.print("One");
			}
			if(x[i]==2)
			{
				System.out.print("Two");
			}
			if(x[i]==3)
			{
				System.out.print("Three");
			}
			if(x[i]==4)
			{
				System.out.print("Four");
			}
			if(x[i]==5)
			{
				System.out.print("Five");
			}
			if(x[i]==6)
			{
				System.out.print("Six");
			}
			if(x[i]==7)
			{
				System.out.print("Seven");
			}
			if(x[i]==8)
			{
				System.out.print("Eight");
			}
			if(x[i]==9)
			{
				System.out.print("Nine");
			}
			if(x[i]==0)
			{
				System.out.print("Zero");
			}
			
		}
	}
	
	
	
}