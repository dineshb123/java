import java.util.Scanner;
class Scanner2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		double n1=sc.nextDouble();

		System.out.println("Enter Second Number");
		double n2=sc.nextDouble();

		System.out.println("Enter Third number");
		double n3=sc.nextDouble();

		double add=n1+n2+n3;
		System.out.println("Addition is"+add);

		double mul=n1*n2*n3;
		System.out.println("Multiplication is"+mul);
		
	}
}