import java.util.Scanner;
class pat
{
	public static void main(String args[])
	{
		System.out.println("enter no");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		for(int i=1;i<=a;i++)
		{
					char c='a';
					int d=1;

			for(int j=a;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				
					if(i%3==1)
				{
				System.out.print(" *");
				//d++;
				}
				else if(i%3==2)
				{
						System.out.print(" "+d);
					d++;
				}
				else
					System.out.print(" "+c);
				c++;
					
					
			}
			System.out.println();
		}
	}

}