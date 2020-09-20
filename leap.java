import java.util.Scanner;
class leap

{
	public static void main(String []args)
	
	{
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter year");
	int a=ab.nextInt();
	if((a%400==0)||(a%4==0 && a%100!=0))
	{
	System.out.println("leap\n year");
	}
	else
	{
	System.out.println("not\t leap year");
	}
	}
	}