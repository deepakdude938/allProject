import java.util.Scanner;
class homework17
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
		
		
				if(x[0]==1)
			{
				System.out.print("One Hundred");
			}
			if(x[0]==2)
			{
				System.out.print("Two Hundred");
			}
			if(x[0]==3)
			{
				System.out.print("Three Hundred");
			}
			if(x[0]==4)
			{
				System.out.print("Four Hundred");
			}
			if(x[0]==5)
			{
				System.out.print("Five Hundred");
			}
			if(x[0]==6)
			{
				System.out.print("Six Hundred");
			}
			if(x[0]==7)
			{
				System.out.print("Seven Hundred");
			}
			if(x[0]==8)
			{
				System.out.print("Eight Hundred");
			}
			if(x[0]==9)
			{
				System.out.print("Nine Hundred");
			}
			if(x[0]==0)
			{
				System.out.print("Zero");
			}
		
				if(x[1]==1 && x[2]==0)
			{
				System.out.print(" Ten");
			}
				if(x[1]==1 && x[2]==1)
			{
				System.out.print(" Eleven");
			}
				if(x[1]==1 && x[2]==2)
			{
				System.out.print(" Twelve");
			}
				if(x[1]==1 && x[2]==3)
			{
				System.out.print(" Thirteen");
			}
				if(x[1]==1 && x[2]==4)
			{
				System.out.print(" Fourteen");
			}
				if(x[1]==1 && x[2]==5)
			{
				System.out.print(" Fifteen");
			}
				if(x[1]==1 && x[2]==6)
			{
				System.out.print(" Sixteen");
			}
				if(x[1]==1 && x[2]==7)
			{
				System.out.print(" Seventeen");
			}
				if(x[1]==1 && x[2]==8)
			{
				System.out.print(" Eighteen");
			}
				if(x[1]==1 && x[2]==9)
			{
				System.out.print(" Nineteen");
			}
			if(x[1]==2)
			{
				System.out.print(" Twenty");
			}
			if(x[1]==3)
			{
				System.out.print(" Thirty");
			}
			if(x[1]==4)
			{
				System.out.print(" Fourty");
			}
			if(x[1]==5)
			{
				System.out.print(" Fifty");
			}
			if(x[1]==6)
			{
				System.out.print(" Sixty");
			}
			if(x[1]==7)
			{
				System.out.print(" Seventy");
			}
			if(x[1]==8)
			{
				System.out.print(" Eighty");
			}
			if(x[1]==9)
			{
				System.out.print(" Ninty");
			}
			if(x[1]==0)
			{
				System.out.print("");
			}
			if(x[2]==1 && x[1]!=1)
			{
				System.out.print(" One");
			}
			if(x[2]==2 && x[1]!=1)
			{
				System.out.print(" Two");
			}
			if(x[2]==3 && x[1]!=1)
			{
				System.out.print(" Three");
			}
			if(x[2]==4 && x[1]!=1)
			{
				System.out.print(" Four");
			}
			if(x[2]==5 && x[1]!=1)
			{
				System.out.print(" Five");
			}
			if(x[2]==6 && x[1]!=1)
			{
				System.out.print(" Six");
			}
			if(x[2]==7 && x[1]!=1)
			{
				System.out.print(" Seven");
			}
			if(x[2]==8 && x[1]!=1)
			{
				System.out.print(" Eight");
			}
			if(x[2]==9 && x[1]!=1)
			{
				System.out.print(" Nine");
			}
			if(x[2]==0 && x[1]!=1)
			{
				System.out.print("");
			}
		
		
	}
	
	
	
}