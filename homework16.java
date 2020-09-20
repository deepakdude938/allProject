import java.util.Scanner;
class homework16
{
	public static void main(String args[])
	{
		System.out.println("Enter your no");
		Scanner ab=new Scanner(System.in);
		String b[]=new String[8];
		int a=ab.nextInt();
		int rem;
		for(int i=0;i<3;i++)
		{
			rem=a%10;
			if(rem==1)
			{
				b[i]="One";
			}
			if(rem==2)
			{
				b[i]="Two";
			}
			if(rem==3)
			{
				b[i]="Three";
			}
			if(rem==4)
			{
				b[i]="Four";
			}
			if(rem==5)
			{
				b[i]="Five";	
			}
			if(rem==6)
			{
				b[i]="Six";
			}
			if(rem==7)
			{
				b[i]="Seven";
			}
			if(rem==8)
			{
				b[i]="Eigth";
			}
			if(rem==9)
			{
				b[i]="Nine";
			}
			if(rem==0)
			{
				b[i]="Zero";
			}
			a=a/10;
		
		}
		System.out.print(b[2]+" "+b[1]+" "+b[0]);
	}
	
	
}