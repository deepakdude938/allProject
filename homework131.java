class homework131
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			int no=1;
			for(int j=3;j>=i;j--)
			System.out.print(" ");
		
		for(int l=1;l<=i;l++)
		{
			if(i==2 || i==4)
			System.out.print("* ");
		else
			System.out.print(no+" ");
		no++;
		}
		System.out.println();
		}
	}
}