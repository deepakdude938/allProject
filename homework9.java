class homework9
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
			{
				int no=1;
				for(int j=3;j>=i;j--)
					{
						System.out.print(" ");
					}
				for(int k=1;k<=i;k++)
					{
						if(i%2==1)
							System.out.print(" *");
						else
						{
							System.out.print(" "+no);
							no++;
						}
					}
					System.out.println();
			
			}
	
	
	}


}