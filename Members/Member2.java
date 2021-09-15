import java.util.Scanner;
class Member2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of Circule");
		double rad=sc.nextDouble();
		System.out.println("1.Area");
		System.out.println("2.Circumfernce of circle");
		System.out.println("Enter ur choice");
		int ch=sc.nextInt();
		if(ch==1)
		{
			double result=new demo().area(rad);
			System.out.println("Area="+result);
		}
		else if(ch==2)
		{
			double result1=new demo().circum(rad);
			System.out.println("circumference="+result1); 
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}
}
class demo
{
	static double pi=3.14;

		double area(double r)
		{
			double areaOfC=pi*r*r;
			return areaOfC;

		}
		double circum(double r)
		{
			double circumOfC=2*pi*r;
			return circumOfC;
		}
}