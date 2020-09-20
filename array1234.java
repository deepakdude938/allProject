class array1234
{
	public static void main(String []args)
	{
		int [][]x={{11,12,13,14},{89,90,95,75}};
		int temp;
		for(int i=0;i<x.length-1;i++)
		{
				for(int j=0;j<x[i].length;j++)
			{
				temp=x[0][j];
				x[0][j]=x[1][x[i].length-1-j];
				x[1][x[i].length-1-j]=temp;
									

			}
		}
			
			for(int i=0;i<x.length;i++)
			{
		
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			}
			
			/*	int y[][]={a[],b[]};
				
				for(int i=0;i<x.length;i++)
					{
						for(int j=0;j<x[i].length;j++)
							
							{
								System.out.println(x[i][j]);
								
							}
					}
						
				for(int i=0;i<a.length;i++)
				{
				
					
				}	
				for(int i=0;i<b.length;i++)
				{
					System.out.println(c[i]);
					
				}	*/;
				
	}
}