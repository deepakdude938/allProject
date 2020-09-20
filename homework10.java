class homework10
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
			{
				int no=1;
				char ch='a';
				for(int j=3;j>=i;j--)
					{
						System.out.print(" ");
					}
				for(int k=1;k<=i;k++)
					{
						if(i%3==1)
						{
							System.out.print(" *");
						}
						else if(i%3==2)
						{
							System.out.print(" "+no);
							no++;
						}
						else
						{
						System.out.print(" "+ch);
						ch++;
						}
					}
					System.out.println();
			
			}
	
	
	}


}