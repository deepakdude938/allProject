class revstring
{
public static void main(String []args)
	{
	String a="deepak";
	int len=a.length();
	String rev="";
	for(int i=len-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
	
		}
	System.out.println("reverse of "+a+" is "+rev);
	}



}