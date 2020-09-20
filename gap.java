import java.util.Scanner;
class gap

{
	public static void main(String []args)
	
	{
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter 1 no");
	int a=ab.nextInt();
	System.out.println("Enter 2 no ");
	int b=ab.nextInt();
	if(a<b)
	for(int i=a+1;i<b;i++){
	System.out.println(i);
	}
	else
		for(int i=a-1;i>b;i--){
	System.out.println(i);
	}
		
	}
}