class homework8
{
	public static void main(String args[])
	{

		for(int i=1;i<=4;i++)
		{
			char ch='a';
			int d=1;
			for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(" "+ch);
					ch++;
				}
				else
				{
					System.out.print(" "+d);
					d++;	
				}
			}
				
				System.out.println();
			
		}	
	}
}