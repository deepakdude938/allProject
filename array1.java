class array1
{
	public static void main(String args[])
	{
	int a[]={1,2,3,4,6,26,29,16};
	int [] b=new int[8];
	for(int i=0;i<b.length;i++)
	{
	b[i]=a[i];
		if(b[i]%2==0)
		{
		System.out.println("even no are"+a[i]);
		
		}
	}
	
		for(int j=0;j<b.length;j++)
		{
		if(b[j]%2==1)
		{
		System.out.println("odd nos are"+b[j]);
		}
		}
	
	
	}
}