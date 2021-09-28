import java.util.Scanner;
class Ternary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=sc.nextInt();
		String result=(no%2==0)? "Even" :"Odd";
		System.out.println("No is "+result);
	}
}