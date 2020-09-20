import java.util.Scanner;
class table

{
	public static void main(String []args)
	
	{
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter 1 no");
	int a=ab.nextInt();


	for(int i=1;i<=10;i++)
	{
	int b=i*a;
	
	System.out.println(+a +"*"+i +"= "+b);
	}
	
	}
}