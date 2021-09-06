import java.util.Scanner;
class Scanner4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of circle");
		double rad=sc.nextDouble();
		
		double result1=areaOfCircle(rad);
		double result2=CercumOfCircle(rad);
		
		System.out.println("Area of cicle is"+result1);
		System.out.println("Area of cicle is"+result2);

	}
	static double areaOfCircle(double rad)
	{
		
		double area=(3.14*rad*rad);
		return area;
	}
	static double CercumOfCircle(double rad1)
	{
		
		double cOfC=(2*3.14*rad1);
		return cOfC;
	}

} 