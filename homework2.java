class homework2
{
	public static void main(String args[])
	{
		int no=2;

		for(int i=1;i<=4;i++)
		{
			for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+no);
				no+=2;
			}
				
				System.out.println();
			
		}	
	}
}