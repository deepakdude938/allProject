import java.util.Scanner;
class evenodd

{
	public static void main(String []args)
	
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter no");
		int a=ab.nextInt();
		if(a%2==0){
		System.out.println("No. is Even");
		}
		else{
		System.out.println("No is odd");
		}
	}
}