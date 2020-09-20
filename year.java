import java.util.Scanner;
class year

{
	public static void main(String []args)
	
	{
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter year");
	int a=ab.nextInt();
	if(a%4==0)
			{
				if(a%100==0)
				{
					
						if(a%400==0){
							System.out.println("leap year");
						}
						else
						{
							System.out.println("\"not leap year\"");
						}
							
					
				}
				else{
					
					System.out.println("leap");
				}
			}
	else
			{
			System.out.println("Not Leap");
			}
	}
}