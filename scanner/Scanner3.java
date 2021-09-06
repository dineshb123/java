import java.util.Scanner;
class Scanner3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter No Of quntity");
		int qty=sc.nextInt();//take input from user

		System.out.println("Enter Price");
		douuble price=sc.nextDouble();//take input from user

		double output=bill(qty,price);//Call method
		System.out.println("Calculated Bil is"+output);


	} 
	static double bill(int qty,double price)
	{
		
		double result=qty*price;
		return result;
	}
}