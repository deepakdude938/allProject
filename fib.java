import java.util.Scanner;
class fib
	{
		public static void main(String args[])
		
		{
			int fib=1;
			System.out.println("Enter your no");
			Scanner ab=new Scanner(System.in);
			int a=ab.nextInt();
			for(int i=1;i<=a;i++)
			{
				fib=fib*i;
			}
			System.out.print(fib);
		}
	
	}